package servicios;

import dao.ClienteDAO;
import modelo.Cliente;

public class ClienteService implements IPersonaService<Cliente> {




    ClienteDAO clienteDAO= new ClienteDAO();
    public ClienteService() {


    }


    @Override
    public void addObje(Cliente obj) {
        clienteDAO.insertObject(obj);
    }

    @Override
    public void updateObj(Cliente obj) {
        clienteDAO.update(obj);
    }

    @Override
    public Boolean deleteCliente(int dni) {
       if(clienteDAO.delete(dni)){
           return  true;
       }
        return false;
    }

    public  Cliente buscar(int dni){
        Cliente clienteEncontrado=clienteDAO.buscar(dni);
        if (clienteEncontrado.equals(null)){
           return null ;
        }
        return  clienteEncontrado;
    }


}