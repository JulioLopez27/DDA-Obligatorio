/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Exceptions.LoginException;
import Exceptions.RecargaException;
import Observer.Observable;
import dominio.Recarga;
import dominio.Sesion;
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
    private ServicioTransitos servicioTransitos = new ServicioTransitos();
    private ServicioRecargas servicioRecargas = new ServicioRecargas();
    private ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();

    private Fachada() {
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public Sesion loginUsuarioPorpietario(String cedula, String password) throws LoginException {
        return servicioUsuarios.loginUsuarioPropietario(cedula, password);
    }

    public UsuarioAdministrador loginUsuarioAdministrador(String cedula, String password) throws LoginException {
        return servicioUsuarios.loginUsuarioAdministrador(cedula, password);
    }

    public boolean agregar(UsuarioPropietario usuarioPropietario){
        return servicioUsuarios.agregar(usuarioPropietario);
    }
    
    public boolean agregar(UsuarioAdministrador usuarioAdministrador){
        return servicioUsuarios.agregar(usuarioAdministrador);
    }

    public void agregar(Recarga recarga) throws RecargaException {
        servicioUsuarios.agregar(recarga);
    }

    public List<Recarga> getRecargasPendientes() {
        return servicioUsuarios.getRecargasPendientes();
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        return servicioUsuarios.aprobar(recarga, usuarioAdministrador);
    }

    public List<Transito> getTransitos(UsuarioPropietario usuarioPropietario) {
        return servicioTransitos.getTransitos(usuarioPropietario);
    }

    public void agregar(Transito transito) {
        servicioTransitos.agregar(transito);
    }
    
    public List<Vehiculo> getVehiculos() {
        return servicioUsuarios.getVehiculos();
    }
    
    public List<Recarga> getRecargas() {
        return servicioUsuarios.getRecargas();
    }
}
