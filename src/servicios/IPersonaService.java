package servicios;

import java.util.List;

import constants.TipoCuenta;
import modelo.Cliente;
import modelo.Cuenta;

public interface IPersonaService <T> {

    public void addObje(T obj);
    public void updateObj(T obj);
    public Boolean deleteCliente(int dni);



   /* public List<Cliente> listarClientes();

    public List<Cliente> listarClientes(Integer nroSucursal);

    public List<Cuenta> listarCuentas();

    public Cuenta crearCuenta (TipoCuenta tipoCuenta) ;

    public void modifyClient(String nombreApellido);*/

}
