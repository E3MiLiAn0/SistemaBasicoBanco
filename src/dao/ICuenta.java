package dao;

public interface ICuenta <T> {
    public void insertObject(T obj, int dni);
    public boolean updateObject(T obj);
    public boolean deleteObject(int dni);
    public Double consultarSaldo(int dni);
    public void updateSaldo(int dni, int saldo);

}
