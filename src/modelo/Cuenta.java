package modelo;


public abstract class Cuenta {
    protected Integer numCuenta;
    protected int saldo;
    protected String cbu;

    // Constructor
    public Cuenta() {
    }

    public Cuenta(Integer numCuenta, int saldo, String cbu) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.cbu = cbu;
    }

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

}
