package co.edu.uniquindio.Optica;

import co.edu.uniquindio.Optica.database.ClienteDB;
import co.edu.uniquindio.Optica.database.OptometraDB;
import co.edu.uniquindio.Optica.database.VendedorDB;
import co.edu.uniquindio.Optica.enums.*;
import co.edu.uniquindio.Optica.model.Diagnostico;
import co.edu.uniquindio.Optica.model.Optica;

public class Main {
    public static void main(String[] args) {

        Optica optica = inicializarDatosPrueba();
    }

    /**
     * Método para la inicialización de datos de la aplicación
     * @return
     */
    private static Optica inicializarDatosPrueba(){
        Optica optica = new Optica();
        for (ClienteDB cliente: ClienteDB.values()) {
            optica.crearUsuario(
                    cliente.getNombre(),
                    cliente.getDocumento(),
                    cliente.getTelefono(),
                    cliente.getCorreo(),
                    cliente.getEdad()
            );
        }
        for (VendedorDB vendedor: VendedorDB.values()) {
            optica.crearUsuario(
                    vendedor.getNombre(),
                    vendedor.getDocumento(),
                    vendedor.getSalario(),
                    vendedor.getComision()
            );
        }
        for (OptometraDB optometra: OptometraDB.values()) {
            optica.crearUsuario(
                    optometra.getNombre(),
                    optometra.getDocumento(),
                    optometra.getSalario(),
                    optometra.getHorario()
            );
        }

        Diagnostico diagnostico1 = optica.crearDiagnostico(
                GradoLente.GRADO_075,
                ProblemaVisual.ASTIGMATISMO,
                optica.getListaClientes().get(1),
                optica.obtenerOptometras().get(1)
        );

        optica.crearLente(diagnostico1, Montura.ACERO_INOXIDABLE, Filtro.UV);
        return optica;
    }
}