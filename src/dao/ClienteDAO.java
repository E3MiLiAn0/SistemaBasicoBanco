package dao;
import  modelo.Cliente;

import javax.swing.*;
import java.sql.*;

public class ClienteDAO implements   IPersonaDao<Cliente> {

    private final String INSERT= "INSERT INTO cliente(dni,domicilio,nombrApellido, telefono, email)VALUES (?,?,?,?,?)";
    private final String UPDATE="update cliente set domicilio=? , nombrApellido =?, telefono=?, email=?  where dni=?";
    private final String delete="DELETE FROM cliente WHERE dni=?";
    private final String obtenerCliente= "select dni from cliente where dni= ? ";
    private PreparedStatement preparedStatement;
    private Conexion conexion;


    public ClienteDAO(){
        preparedStatement= null;
        conexion= new Conexion();
    }


    @Override
    public void insertObject (Cliente cliente) {

        try {
            preparedStatement = conexion.getConnection().prepareCall(INSERT);
            preparedStatement.setInt(1, cliente.getDni());
            preparedStatement.setString(2, cliente.getNombreApellido());
            preparedStatement.setString(3, cliente.getDomicilio());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getTelefono());


            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la parte de clienteDao " + e.getMessage());
            e.printStackTrace();


        }


    }

    @Override
    public void update(Cliente obj) {
        try{
            preparedStatement= conexion.getConnection().prepareStatement(UPDATE);
            preparedStatement.setString(1,obj.getDomicilio());
            preparedStatement.setString(2,obj.getNombreApellido());
            preparedStatement.setString(3,obj.getTelefono());
            preparedStatement.setString(4,obj.getEmail());
            preparedStatement.setInt(5,obj.getDni());
            //preparedStatement.setInt(5,obj.getSucursal().getNumSucursal());
            int consulta = preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public boolean delete(int dni) {
        return false;
    }

    public Cliente buscar(int dni){
        Cliente clienteEncontrado= new Cliente();

        try{
            preparedStatement=conexion.getConnection().prepareStatement(obtenerCliente);
            preparedStatement.setInt(1,dni);
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()){

                int dni1= res.getInt(1);
                clienteEncontrado.setDni(dni1);
                return clienteEncontrado;


            }
            res.close();
            preparedStatement.close();
        }
        catch (SQLException e){
            System.out.println("entro por aca");
        }



        return clienteEncontrado;
    }
}