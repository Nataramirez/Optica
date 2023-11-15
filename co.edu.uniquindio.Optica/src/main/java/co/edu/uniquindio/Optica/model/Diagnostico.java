package co.edu.uniquindio.Optica.model;

import co.edu.uniquindio.Optica.enums.GradoLente;
import co.edu.uniquindio.Optica.enums.ProblemaVisual;

public class Diagnostico {
    private GradoLente gradoLente;
    private ProblemaVisual problemaVisual;
    Optica ownedByOptica;

    public Diagnostico(){}
    public Diagnostico(GradoLente gradoLente, ProblemaVisual problemaVisual) {
        this.gradoLente = gradoLente;
        this.problemaVisual = problemaVisual;
    }

    public GradoLente getGradoLente() {
        return gradoLente;
    }

    public void setGradoLente(GradoLente gradoLente) {
        this.gradoLente = gradoLente;
    }

    public ProblemaVisual getProblemaVisual() {
        return problemaVisual;
    }

    public void setProblemaVisual(ProblemaVisual problemaVisual) {
        this.problemaVisual = problemaVisual;
    }

    public Optica getOwnedByOptica() {
        return ownedByOptica;
    }

    public void setOwnedByOptica(Optica ownedByOptica) {
        this.ownedByOptica = ownedByOptica;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "gradoLente=" + gradoLente +
                ", problemaVisual=" + problemaVisual +
                '}';
    }
}
