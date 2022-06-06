package modelo;


public abstract class Persona {

    // Atributos
    protected int dni;
    protected String nombreApellido;
    protected String telefono;
    protected String email;

    // Constructor

    public Persona() {
    }

    public Persona(int dni, String nombreApellido, String telefono, String email) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.telefono = telefono;
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
