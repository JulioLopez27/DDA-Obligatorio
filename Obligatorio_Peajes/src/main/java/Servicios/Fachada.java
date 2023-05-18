/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Exceptions.LoginException;
import dominio.Sesion;
import dominio.UsuarioPropietario;
import dominio.UsuarioAdministrador;

/**
 *
 * @author sebita
 */
public class Fachada {

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
}
