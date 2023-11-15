package co.edu.uniquindio.Optica.model;

public class Vendedor extends Empleado{
    private float comision;

    public Vendedor() {}

    public Vendedor(String nombre, String documento, float salario, float comision) {
        super(nombre, documento, salario);
        this.comision = comision;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "comision=" + comision +
                "} " + super.toString();
    }
}
