package co.edu.uniquindio.Optica.database;

import co.edu.uniquindio.Optica.enums.GradoLente;
import co.edu.uniquindio.Optica.enums.ProblemaVisual;

public enum DiagnosticoDB {
    MIOPIA_025(GradoLente.GRADO_025, ProblemaVisual.MIOPIA),
    MIOPIA_050(GradoLente.GRADO_050, ProblemaVisual.MIOPIA),
    MIOPIA_075(GradoLente.GRADO_075, ProblemaVisual.MIOPIA),
    MIOPIA_100(GradoLente.GRADO_100, ProblemaVisual.MIOPIA),
    MIOPIA_125(GradoLente.GRADO_125, ProblemaVisual.MIOPIA),
    MIOPIA_150(GradoLente.GRADO_150, ProblemaVisual.MIOPIA),
    MIOPIA_175(GradoLente.GRADO_175, ProblemaVisual.MIOPIA),
    MIOPIA_200(GradoLente.GRADO_200, ProblemaVisual.MIOPIA),
    MIOPIA_225(GradoLente.GRADO_225, ProblemaVisual.MIOPIA),
    MIOPIA_250(GradoLente.GRADO_250, ProblemaVisual.MIOPIA),
    MIOPIA_275(GradoLente.GRADO_275, ProblemaVisual.MIOPIA),
    MIOPIA_300(GradoLente.GRADO_300, ProblemaVisual.MIOPIA),
    MIOPIA_325(GradoLente.GRADO_325, ProblemaVisual.MIOPIA),
    MIOPIA_350(GradoLente.GRADO_350, ProblemaVisual.MIOPIA),
    MIOPIA_375(GradoLente.GRADO_375, ProblemaVisual.MIOPIA),
    MIOPIA_400(GradoLente.GRADO_400, ProblemaVisual.MIOPIA),
    MIOPIA_425(GradoLente.GRADO_425, ProblemaVisual.MIOPIA),
    MIOPIA_450(GradoLente.GRADO_450, ProblemaVisual.MIOPIA),
    MIOPIA_475(GradoLente.GRADO_475, ProblemaVisual.MIOPIA),
    MIOPIA_500(GradoLente.GRADO_500, ProblemaVisual.MIOPIA),
    MIOPIA_525(GradoLente.GRADO_525, ProblemaVisual.MIOPIA),
    MIOPIA_550(GradoLente.GRADO_550, ProblemaVisual.MIOPIA),
    MIOPIA_575(GradoLente.GRADO_575, ProblemaVisual.MIOPIA),
    MIOPIA_600(GradoLente.GRADO_600, ProblemaVisual.MIOPIA),
    ASTIGMATISMO_025(GradoLente.GRADO_025, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_050(GradoLente.GRADO_050, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_075(GradoLente.GRADO_075, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_100(GradoLente.GRADO_100, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_125(GradoLente.GRADO_125, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_150(GradoLente.GRADO_150, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_175(GradoLente.GRADO_175, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_200(GradoLente.GRADO_200, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_225(GradoLente.GRADO_225, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_250(GradoLente.GRADO_250, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_275(GradoLente.GRADO_275, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_300(GradoLente.GRADO_300, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_325(GradoLente.GRADO_325, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_350(GradoLente.GRADO_350, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_375(GradoLente.GRADO_375, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_400(GradoLente.GRADO_400, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_425(GradoLente.GRADO_425, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_450(GradoLente.GRADO_450, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_475(GradoLente.GRADO_475, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_500(GradoLente.GRADO_500, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_525(GradoLente.GRADO_525, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_550(GradoLente.GRADO_550, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_575(GradoLente.GRADO_575, ProblemaVisual.ASTIGMATISMO),
    ASTIGMATISMO_600(GradoLente.GRADO_600, ProblemaVisual.ASTIGMATISMO);
    private GradoLente gradoLente;
    private ProblemaVisual problemaVisual;

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
}
