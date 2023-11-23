package co.edu.uniquindio.Optica.model;

import co.edu.uniquindio.Optica.enums.*;

import java.util.ArrayList;
import java.util.List;

public class Optica {

    public List<Empleado> listaEmpleados = new ArrayList<>();
    public List<Cliente> listaClientes = new ArrayList<>();
    public List<Lente> listaLentes = new ArrayList<>();
    public List<Diagnostico> listaDiagnosticos = new ArrayList<>();
    public List<Venta> listaVentas = new ArrayList<>();

    public Optica(){}

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
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

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
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
                for (Empleado empleado: getListaEmpleados()) {
                    if(empleado.getDocumento().equals(documento)){
                        usuarioExiste = true;
                        break;
                    }
                }
            }
            case OPTOMETRA: {
                for (Empleado empleado: getListaEmpleados()) {
                    if(empleado.getDocumento().equals(documento)){
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
     * Método para verificar la existe un diagnóstico
     * @param diagnosticoBuscado
     * @return boolean
     */
    public boolean buscarDiagnostico(Diagnostico diagnosticoBuscado){
        boolean diagnosticoExiste = false;
        for (Diagnostico diagnostico: getListaDiagnosticos()) {
            if(diagnostico.getId().equals(diagnosticoBuscado.getId())){
                diagnosticoExiste = true;
                break;
            }
        }
        return diagnosticoExiste;
    }

    /**
     * Método para buscar un diagnostico y validar su posterior creación
     * @param gradoLente
     * @param problemaVisual
     * @param cliente
     * @param optometra
     * @return
     */
    public boolean buscarDiagnostico(GradoLente gradoLente, ProblemaVisual problemaVisual, Cliente cliente, Optometra optometra){
        boolean diagnosticoExiste = false;
        for (Diagnostico diagnostico: getListaDiagnosticos()) {
            if(diagnostico.getGradoLente() == gradoLente &&
                    diagnostico.getProblemaVisual() == problemaVisual &&
                    diagnostico.getCliente() == cliente && diagnostico.getOptometra() == optometra){
                diagnosticoExiste = true;
                break;
            }
        }
        return diagnosticoExiste;
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
            getListaEmpleados().add(vendedor);
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
            getListaEmpleados().add(optometra);
            return true;
        }
        return false;
    }

    /**
     * Método para la creación de diagnósticos
     * @param gradoLente
     * @param problemaVisual
     * @param cliente
     * @param optometra
     * @return
     */
    public Diagnostico crearDiagnostico(GradoLente gradoLente, ProblemaVisual problemaVisual, Cliente cliente, Optometra optometra) {
        if (!buscarDiagnostico(gradoLente, problemaVisual, cliente, optometra)) {
            Diagnostico diagnostico = new Diagnostico(gradoLente, problemaVisual, cliente, optometra);
            getListaDiagnosticos().add(diagnostico);
            cliente.setDiagnostico(diagnostico);
            optometra.getListaDiagnosticos().add(diagnostico);
            return diagnostico;
        }
        return new Diagnostico();
    }

    /**
     * Método para crear lente
     * @param diagnostico
     * @param montura
     * @param filtro
     * @return
     */
    public boolean crearLente(Diagnostico diagnostico, Montura montura, Filtro filtro ){
        if (!buscarLente(diagnostico, montura, filtro)){
            Lente lente = new Lente(diagnostico, montura, filtro);
            getListaLentes().add(lente);
            return true;
        }else {
            return false;
        }

    }

    /**
     * Método para obtener listado de Optómetras
     * @return
     */
    public ArrayList<Optometra> obtenerOptometras(){
        ArrayList<Optometra> listaOptometras = new ArrayList<>();
        for (Empleado empleado: getListaEmpleados()) {
            if(empleado instanceof Optometra){
                listaOptometras.add((Optometra) empleado);
            }
        }
       return listaOptometras;
    }

    /**
     * Método para optener listado de Vendedores
     * @return
     */
    public ArrayList<Empleado> obtenerVendedores(){
        List<Empleado> listaVendedores = new ArrayList<>();
        for (Empleado empleado: getListaEmpleados()) {
            if(empleado instanceof Vendedor){
                listaVendedores.add(empleado);
            }
        }
        return (ArrayList<Empleado>) listaVendedores;
    }

    /**
     * Método para obtener listado de Clientes
     * @return
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Método para obtener listado de diagnóticos
     * @return
     */
    public List<Diagnostico> obtenerDiagnosticos() {
        return getListaDiagnosticos();
    }

    /**
     * Método para obtener listado de Lentes
     * @return
     */
    public List<Lente> obtenerLentes() {
        return getListaLentes();
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
                    int tamanioLista = getListaEmpleados().size();
                    for(int i = 0; i < tamanioLista; i++){
                        Empleado empleado = getListaEmpleados().get(i);
                        if(empleado.getDocumento().equals(documento)){
                            getListaEmpleados().remove(i);
                            usuarioEliminado = true;
                            break;
                        }
                    }
                }
            }
            case OPTOMETRA -> {
                if (!buscarUsuario(documento, TipoUsuario.OPTOMETRA)){
                    int tamanioLista = getListaEmpleados().size();
                    for(int i = 0; i < tamanioLista; i++){
                        Empleado empleado = getListaEmpleados().get(i);
                        if(empleado.getDocumento().equals(documento)){
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
     * Método para eliminar diagnosticos
     * @param diagnostico
     * @return
     */
    public boolean eliminarDiagnostico(Diagnostico diagnostico){
        boolean diagnosticoEliminado = false;
        if(!buscarDiagnostico(diagnostico)){
            int tamanioLista = getListaDiagnosticos().size();
            for(int i = 0; i < tamanioLista; i++){
                Diagnostico diagnosticoEncontrado = getListaDiagnosticos().get(i);
                if(diagnosticoEncontrado.getId().equals(diagnostico.getId())){
                    getListaClientes().remove(i);
                    diagnosticoEliminado = true;
                    break;
                }
            }
        }
        return diagnosticoEliminado;
    }

    public boolean eliminarLente(Lente lente){
        boolean lenteEliminado = false;
        if(!buscarLente(lente.getDiagnostico(), lente.getMontura(), lente.getFiltro())){
            int tamanioLista = getListaLentes().size();
            for(int i = 0; i < tamanioLista; i++){
                Lente lenteEncontrado = getListaLentes().get(i);
                if(lenteEncontrado == lente){
                    getListaLentes().remove(i);
                    lenteEliminado = true;
                    break;
                }
            }
        }
        return lenteEliminado;
    }
}
