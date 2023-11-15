package co.edu.uniquindio.Optica.model;

import co.edu.uniquindio.Optica.enums.Filtro;
import co.edu.uniquindio.Optica.enums.Montura;

public class Lente {
    private Diagnostico diagnostico;
    private Montura montura;
    private Filtro filtro;
    Optica ownedByOptica;

    public Lente(){}
    public Lente(Diagnostico diagnostico, Montura montura, Filtro filtro) {
        this.diagnostico = diagnostico;
        this.montura = montura;
        this.filtro = filtro;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public Filtro getFiltro() {
        return filtro;
    }

    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }

    public Optica getOwnedByOptica() {
        return ownedByOptica;
    }

    public void setOwnedByOptica(Optica ownedByOptica) {
        this.ownedByOptica = ownedByOptica;
    }

    @Override
    public String toString() {
        return "Lente{" +
                "diagnostico=" + diagnostico +
                ", montura=" + montura +
                ", filtro=" + filtro +
                '}';
    }
}
