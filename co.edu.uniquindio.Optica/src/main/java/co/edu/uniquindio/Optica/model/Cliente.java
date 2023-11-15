package co.edu.uniquindio.Optica.model;

public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;
    private String correo;
    private int edad;
    Optica ownedByOptica;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, String telefono, String correo, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Optica getOwnedByOptica() {
        return ownedByOptica;
    }

    public void setOwnedByOptica(Optica ownedByOptica) {
        this.ownedByOptica = ownedByOptica;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre = '" + nombre + '\'' +
                ", documento = '" + documento + '\'' +
                ", telefono = '" + telefono + '\'' +
                ", correo = '" + correo + '\'' +
                ", edad = " + edad +
                '}';
    }
}
