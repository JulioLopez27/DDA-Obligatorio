/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.fachada;

import Exceptions.LoginException;
import Exceptions.PeajesException;
import Observer.Observable;
import modelo.servicios.ServicioPeajes;
import modelo.servicios.ServicioUsuarios;
import modelo.Bonificable;
import modelo.Bonificacion;
import modelo.Puesto;
import modelo.Recarga;
import modelo.Sesion;
import modelo.Tarifa;
import modelo.Transito;
import modelo.UsuarioPropietario;
import modelo.UsuarioAdministrador;
import modelo.Vehiculo;
import java.util.List;
import modelo.Notificacion;

/**
 *
 * @author sebita
 */
public class Fachada extends Observable {

    private static Fachada instancia = null;

    private ServicioUsuarios servicioUsuarios = new ServicioUsuarios();
    private ServicioPeajes servicioPeajes = new ServicioPeajes();
    

    private Fachada() {
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public Sesion loginUsuarioPorpietario(int cedula, String password) throws LoginException {
        return servicioUsuarios.loginUsuarioPropietario(cedula, password);
    }

    public UsuarioAdministrador loginUsuarioAdministrador(int cedula, String password) throws LoginException {
        return servicioUsuarios.loginUsuarioAdministrador(cedula, password);
    }

    public boolean agregar(UsuarioPropietario usuarioPropietario){
        return servicioUsuarios.agregar(usuarioPropietario);
    }
    
    public boolean agregar(UsuarioAdministrador usuarioAdministrador){
        return servicioUsuarios.agregar(usuarioAdministrador);
    }

    public void agregar(Recarga recarga) throws PeajesException {
        servicioUsuarios.agregar(recarga);
    }

    public List<Recarga> getRecargasPendientes() {
        return servicioUsuarios.getRecargasPendientes();
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        return servicioUsuarios.aprobar(recarga, usuarioAdministrador);
    }

    public Transito agregar(Transito transito) throws PeajesException {
        return servicioUsuarios.agregar(transito);
    }
    
    public void agregar(Puesto puesto) {
        servicioPeajes.agregar(puesto);
    }
    
    public List<Vehiculo> getVehiculos() {
        return servicioUsuarios.getVehiculos();
    }
    
    public List<Recarga> getRecargas() {
        return servicioUsuarios.getRecargas();
    }

    public List<Puesto> getPuestos() {
        return servicioPeajes.getPuestos();
    }

    public void agregar(Tarifa tarifa, Puesto puesto) {
        servicioPeajes.agregar(tarifa, puesto);
    }

    public Vehiculo buscarVehiculo(String matricula) throws PeajesException {
        return servicioUsuarios.buscarVehiculo(matricula);
    }

    public void agregar(Bonificable tipoBonificacion) {
        servicioPeajes.agregar(tipoBonificacion);
    }

    public List<Bonificable> getTiposBonificacion() {
        return servicioPeajes.getTiposBonificacion();
    }

    public UsuarioPropietario buscarPropietario(String cedula) throws PeajesException {
        return servicioUsuarios.buscarUsuario(cedula);
    }

    public void asignarBonificacion(UsuarioPropietario usuarioEncontrado, Bonificacion bonificacionSeleccionada) throws PeajesException {
        servicioUsuarios.asignarBonificacion(usuarioEncontrado, bonificacionSeleccionada);
    }

    //TODO VER SI SE USA
//    public void agregar(Notificacion notificacion) {
//        servicioUsuarios.agregar(notificacion);
//    }

}