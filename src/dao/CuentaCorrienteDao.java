package dao;

import modelo.CuentaCorriente;

import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.*;

public class CuentaCorrienteDao implements ICuenta<CuentaCorriente> {
    private PreparedStatement preparedStatement;
    private Conexion conexion;

    private final String  UPDATESALDO="UPDATE cuentacorriente SET saldo= ? WHERE dniCliente=?";
    private final String  consultarSaldo= "select saldo from cuentaCorriente where dniCliente=?";
    private final String INSERT="INSERT INTO cuentaCorriente (numCuenta, saldo, cbu, dniCliente) VALUES (?, ?, ?,?);";
    public CuentaCorrienteDao(){
        preparedStatement= null;
        conexion= new Conexion();

    }

    @Override
    public void insertObject(CuentaCorriente obj, int dni) {
            try {
                preparedStatement =conexion.getConnection().prepareCall(INSERT);
                preparedStatement.setInt(1,obj.getNumCuenta());
                preparedStatement.setInt(2,obj.getSaldo());
                preparedStatement.setString(3,obj.getCbu());
                preparedStatement.setInt(4, dni);
                preparedStatement.executeUpdate();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
    }






    @Override
    public boolean updateObject(CuentaCorriente obj) {
        return false;
    }

    @Override
    public boolean deleteObject(int dni) {
        return false;
    }

    @Override
    public Double consultarSaldo(int dni) {

        try{
            preparedStatement= conexion.getConnection().prepareCall(consultarSaldo);
            preparedStatement.setInt(1,dni);
            ResultSet resultado= preparedStatement.executeQuery();
            while (resultado.next())
               return resultado.getDouble("saldo");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error al mostrar saldo  en DAO"+e.getMessage());

        }



        return null;
    }

    @Override
    public void updateSaldo(int dni, int saldo) {

        try {
            preparedStatement= conexion.getConnection().prepareStatement(UPDATESALDO);
            preparedStatement.setInt(1, saldo);
            preparedStatement.setInt(2,dni);
            int consulta = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    }


