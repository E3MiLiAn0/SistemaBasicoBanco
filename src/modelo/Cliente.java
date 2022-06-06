package modelo;

import java.util.Date;
import java.util.List;

public class Cliente extends Persona {
    // ATRIBUTOS
    private String domicilio;
    private Date altaCliente;
     private Sucursal sucursal;
    private Integer sucursalId;

    private List<Cuenta> cuentas;

    public Cliente() {
        super();
    }

    public Cliente(int dni, String nombreApellido, String telefono, String email, String domicilio,
                   List<Cuenta> cuentas, Date altaCliente, Sucursal sucursal) {
        super(dni, nombreApellido, telefono, email);
        this.domicilio = domicilio;
        this.cuentas = cuentas;
        this.altaCliente = altaCliente;
        this.sucursal= sucursal;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getAltaCliente() {
        return altaCliente;
    }

    public void setAltaCliente(Date altaCliente) {
        this.altaCliente = altaCliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "domicilio='" + domicilio + '\'' +
                ", altaCliente=" + altaCliente +
                ", sucursal=" + sucursal +
                ", sucursalId=" + sucursalId +
                ", cuentas=" + cuentas +
                ", dni=" + dni +
                ", nombreApellido='" + nombreApellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}