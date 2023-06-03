/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Exceptions.LoginException;
import Exceptions.PeajesException;
import Observer.Observable;
import dominio.Bonificable;
import dominio.Bonificacion;
import dominio.Puesto;
import dominio.Recarga;
import dominio.Sesion;
import dominio.Tarifa;
import dominio.Transito;
import dominio.UsuarioPropietario;
import dominio.UsuarioAdministrador;
import dominio.Vehiculo;
import java.util.List;

/**
 *
 * @author sebita
 */
public class Fachada extends Observable {

    private static Fachada instancia = null;

    private ServicioUsuarios servicioUsuarios = new ServicioUsuarios();
    private ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();
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

}
