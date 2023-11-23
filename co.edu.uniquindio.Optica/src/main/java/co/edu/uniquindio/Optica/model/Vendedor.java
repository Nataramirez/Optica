package co.edu.uniquindio.Optica.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado{
    private float comision;
    public List<Venta> listaVentas = new ArrayList<>();

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

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "comision=" + comision +
                "} " + super.toString();
    }

    public void salarioTotal(){}
}
