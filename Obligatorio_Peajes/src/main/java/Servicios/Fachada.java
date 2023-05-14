/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
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
    //ToDo private ServicioTransitos servicioTransitos = new ServicioTransitos();
    //ToDo private ServicioRecargas servicioRecargas = new ServicioRecargas();
    
    private Fachada() {
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    public Sesion loginUsuarioPorpietario(String cedula, String password){
        return servicioUsuarios.loginUsuarioPropietario(cedula, password);
    }
    
    public UsuarioAdministrador loginUsuarioAdministrador(String cedula, String password){
         return servicioUsuarios.loginUsuarioAdministrador(cedula, password);
    }
    
}
