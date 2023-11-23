package co.edu.uniquindio.Optica.database;

import co.edu.uniquindio.Optica.enums.GradoLente;
import co.edu.uniquindio.Optica.enums.ProblemaVisual;
import co.edu.uniquindio.Optica.model.Cliente;
import co.edu.uniquindio.Optica.model.Optometra;

public enum DiagnosticoDB {

    DIAGNOSTICO_DB_1(GradoLente.GRADO_075, ProblemaVisual.ASTIGMATISMO);
    private GradoLente gradoLente;
    private ProblemaVisual problemaVisual;
    private Cliente cliente;
    private Optometra optometra;

    DiagnosticoDB(GradoLente gradoLente, ProblemaVisual problemaVisual) {
        this.gradoLente = gradoLente;
        this.problemaVisual = problemaVisual;
    }

    public GradoLente getGradoLente() {
        return gradoLente;
    }

    public ProblemaVisual getProblemaVisual() {
        return problemaVisual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Optometra getOptometra() {
        return optometra;
    }
}
