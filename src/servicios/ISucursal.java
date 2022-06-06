package servicios;

import modelo.Sucursal;

public interface ISucursal {
    public void insertSucursal(Sucursal sucursal);
    public void updateSucursal(Sucursal sucursal);
    public  void delete(int dni);

}
