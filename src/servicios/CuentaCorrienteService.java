package servicios;

import dao.CuentaCorrienteDao;
import dao.ICuenta;
import modelo.CuentaCorriente;

public class CuentaCorrienteService implements ICuentaService<CuentaCorriente> {

    CuentaCorrienteDao cuentaCorrienteDao= new CuentaCorrienteDao();


    @Override
    public void extraer(int dni, int monto) {
        double saldoActual=consultarSaldo(dni);
        saldoActual=saldoActual-monto;
        cuentaCorrienteDao.updateSaldo(dni , (int) saldoActual);

    }

    @Override
    public void depositar(int dni,int monto) {
        double saldoActual=consultarSaldo(dni);
        saldoActual=saldoActual+monto;
        cuentaCorrienteDao.updateSaldo( dni, (int) saldoActual);

    }

    @Override
    public Double consultarSaldo(int dni) {
        return cuentaCorrienteDao.consultarSaldo(dni);
    }

    @Override
    public void crearCuenta(CuentaCorriente obj, int dni) {
        cuentaCorrienteDao.insertObject(obj, dni);
    }
}
