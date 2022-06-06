package servicios;

import dao.ISucursalDao;
import modelo.Sucursal;

public class SucursalService implements  ISucursal{


    ISucursalDao sucursalDao;

    @Override
    public void insertSucursal(Sucursal sucursal) {
            sucursalDao.crearSucursal(sucursal);
    }

    @Override
    public void updateSucursal(modelo.Sucursal sucursal) {

    }

    @Override
    public void delete(int dni) {

    }
}
