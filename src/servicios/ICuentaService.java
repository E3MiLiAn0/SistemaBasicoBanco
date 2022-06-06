package servicios;

public interface ICuentaService<T> {
    public void extraer(int dni, int monto);

    public void depositar(int dni, int monto);

    public Double consultarSaldo(int dni);

    public  void crearCuenta(T obj, int dni);
}
