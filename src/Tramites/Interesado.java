package Tramites;

public class Interesado {
    private String dni;
    private String nombres;
    private String telefono;
    private String correo;
    private String tipo; 

    public Interesado(String dni, String nombres, String telefono, String correo, String tipo) {
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return dni + " - " + nombres + " - " + tipo;
    }
}
