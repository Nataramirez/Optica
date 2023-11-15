package co.edu.uniquindio.Optica.model;

import co.edu.uniquindio.Optica.enums.*;

import java.util.ArrayList;
import java.util.List;

public class Optica {

    public List<Vendedor> listaVendedores = new ArrayList<>();
    public List<Cliente> listaClientes = new ArrayList<>();
    public List<Optometra> listaOptometras = new ArrayList<>();
    public List<Lente> listaLentes = new ArrayList<>();
    public List<Diagnostico> listaDiagnosticos = new ArrayList<>();

    public Optica(){}

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Optometra> getListaOptometras() {
        return listaOptometras;
    }

    public void setListaOptometras(List<Optometra> listaOptometras) {
        this.listaOptometras = listaOptometras;
    }

    public List<Lente> getListaLentes() {
        return listaLentes;
    }

    public void setListaLentes(List<Lente> listaLentes) {
        this.listaLentes = listaLentes;
    }

    public List<Diagnostico> getListaDiagnosticos() {
        return listaDiagnosticos;
    }

    public void setListaDiagnosticos(List<Diagnostico> listaDiagnosticos) {
        this.listaDiagnosticos = listaDiagnosticos;
    }

    /**
     * Método para verificar la existencia de usuarios en la aplicación
     * @param documento
     * @return
     */
    public boolean buscarUsuario(String documento, TipoUsuario tipoUsuario){
        boolean usuarioExiste = false;
        switch (tipoUsuario){
            case CLIENTE: {
                for (Cliente cliente: getListaClientes()) {
                    if(cliente.getDocumento().equals(documento)){
                        usuarioExiste = true;
                        break;
                    }
                }
            }
            case VENDEDOR: {
                for (Vendedor vendedor: getListaVendedores()) {
                    if(vendedor.getDocumento().equals(documento)){
                        usuarioExiste = true;
                        break;
                    }
                }
            }
            case OPTOMETRA: {
                for (Optometra optometra: getListaOptometras()) {
                    if(optometra.getDocumento().equals(documento)){
                        usuarioExiste = true;
                        break;
                    };
                }
            }
            default: {
                return usuarioExiste;
            }
        }
    }

    /**
     * Método para crear usuario de tipo Cliente
     * @param nombre
     * @param documento
     * @param telefono
     * @param correo
     * @param edad
     * @return
     */
    public boolean crearUsuario(String nombre, String documento, String telefono, String correo, int edad){
        if(!buscarUsuario(documento, TipoUsuario.CLIENTE)){
            Cliente cliente = new Cliente(nombre, documento, telefono, correo, edad);
            getListaClientes().add(cliente);
            return true;
        }else {
            return false;
        }

    }

    /**
     * Método para crear usuario de tipo Vendedor
     * @param nombre
     * @param documento
     * @param salario
     * @param comision
     * @return
     */
    public boolean crearUsuario(String nombre, String documento, float salario, float comision) {
        if(!buscarUsuario(documento, TipoUsuario.VENDEDOR)){
            Vendedor vendedor = new Vendedor(nombre, documento, salario, comision);
            getListaVendedores().add(vendedor);
            return true;
        }
        return false;
    }

    /**
     * Método para crear usuarios de tipo Optómetra
     * @param nombre
     * @param documento
     * @param salario
     * @param horario
     * @return
     */
    public boolean crearUsuario(String nombre, String documento, float salario, String horario){
        if(!buscarUsuario(documento, TipoUsuario.OPTOMETRA)){
            Optometra optometra = new Optometra(nombre, documento, salario, horario);
            getListaOptometras().add(optometra);
            return true;
        }
        return false;
    }

    /**
     * Método para obtener listado de un tipo de usuario
     * @param tipoUsuario
     * @return
     */
    public List obtenerUsuario(TipoUsuario tipoUsuario){
        switch (tipoUsuario){
            case CLIENTE -> {
                return getListaClientes();
            }
            case VENDEDOR -> {
                return getListaVendedores();
            }
            case OPTOMETRA -> {
                return getListaOptometras();
            }
            default -> {
                return new ArrayList<>();
            }
        }
    }

    /**
     * Método para eliminar usuarios
     * @param documento
     * @param tipoUsuario
     * @return
     */
    public boolean eliminarUsuario(String documento, TipoUsuario tipoUsuario){
        boolean usuarioEliminado = false;
        switch (tipoUsuario){
            case CLIENTE -> {
                if (!buscarUsuario(documento, TipoUsuario.CLIENTE)){
                    int tamanioLista = getListaClientes().size();
                    for(int i = 0; i < tamanioLista; i++){
                        Cliente cliente = getListaClientes().get(i);
                        if(cliente.getDocumento().equals(documento)){
                            getListaClientes().remove(i);
                            usuarioEliminado = true;
                            break;
                        }
                    }
                }
            }
            case VENDEDOR -> {
                if(!buscarUsuario(documento, TipoUsuario.VENDEDOR)){
                    int tamanioLista = getListaVendedores().size();
                    for(int i = 0; i < tamanioLista; i++){
                        Vendedor vendedor = getListaVendedores().get(i);
                        if(vendedor.getDocumento().equals(documento)){
                            getListaClientes().remove(i);
                            usuarioEliminado = true;
                            break;
                        }
                    }
                }
            }
            case OPTOMETRA -> {
                if (!buscarUsuario(documento, TipoUsuario.OPTOMETRA)){
                    int tamanioLista = getListaOptometras().size();
                    for(int i = 0; i < tamanioLista; i++){
                        Optometra optometra = getListaOptometras().get(i);
                        if(optometra.getDocumento().equals(documento)){
                            getListaClientes().remove(i);
                            usuarioEliminado = true;
                            break;
                        }
                    }
                }
            }
        }
        return usuarioEliminado;
    }

    /**
     * Método para verificar la existe un diagnóstico
     * @param gradoLente
     * @param problemaVisual
     * @return
     */
    public boolean buscarDiagnostico(GradoLente gradoLente, ProblemaVisual problemaVisual){
        boolean diagnosticoExiste = false;
        for (Diagnostico diagnostico: getListaDiagnosticos()) {
            if(diagnostico.getGradoLente().getNombre().equalsIgnoreCase(gradoLente.getNombre()) &&
            diagnostico.getProblemaVisual().getNombre().equalsIgnoreCase(problemaVisual.getNombre())){
                diagnosticoExiste = true;
                break;
            }
        }
        return diagnosticoExiste;
    }

    /**
     * Método para +la creación de diagnósticos
     * @param gradoLente
     * @param problemaVisual
     * @return
     */
    public boolean crearDiagnostico(GradoLente gradoLente, ProblemaVisual problemaVisual){
        if (!buscarDiagnostico(gradoLente, problemaVisual)){
            Diagnostico diagnostico = new Diagnostico(gradoLente, problemaVisual);
            getListaDiagnosticos().add(diagnostico);
            return true;
        }else {
            return false;
        }

    }

    /**
     * Método para buscar lente
     * @param diagnostico
     * @param montura
     * @param filtro
     * @return
     */
    public boolean buscarLente(Diagnostico diagnostico, Montura montura, Filtro filtro){
        boolean lenteExiste = false;
        for (Lente lente: getListaLentes()) {
            if(lente.getDiagnostico().equals(diagnostico) && lente.getMontura().equals(montura) &&
                lente.getFiltro().equals(filtro)){
                lenteExiste = true;
                break;
            }
        }
        return lenteExiste;
    }
}
