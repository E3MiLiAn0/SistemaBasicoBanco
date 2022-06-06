package modelo;

import java.util.Date;

public class Empleado extends Persona {


    private Integer legajo;
    private Date fechaIngreso;


    public Empleado(int dni, String nombreApellido, String telefono, String email) {
        super(dni, nombreApellido, telefono, email);
        // TODO Auto-generated constructor stub
    }


    public Integer getLegajo() {
        return legajo;
    }


    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }


    public Date getFechaIngreso() {
        return fechaIngreso;
    }


    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }



}