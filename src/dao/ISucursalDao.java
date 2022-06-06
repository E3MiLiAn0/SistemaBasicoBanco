package dao;

import modelo.Sucursal;

public interface ISucursalDao {

    public void crearSucursal(Sucursal sucursal);
    public void borrarSucursal(int id);
    public void editarSucursal(Sucursal sucursal);
    public Sucursal buscarSucursal(int id);

}
