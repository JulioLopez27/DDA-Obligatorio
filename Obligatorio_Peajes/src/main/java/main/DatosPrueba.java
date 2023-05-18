/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import Servicios.Fachada;
import Servicios.ServicioUsuarios;
import dominio.Cuenta;
import dominio.UsuarioAdministrador;
import dominio.UsuarioPropietario;

/**
 *
 * @author gonzalobazzi
 */
public class DatosPrueba {

    public static void cargar(){
        Fachada fachada = Fachada.getInstancia();
        
        //Cuentas
        Cuenta cuenta1 = new Cuenta(0);
        Cuenta cuenta2 = new Cuenta(100);
        Cuenta cuenta3 = new Cuenta(2000);
        
        //Usuarios 
        UsuarioPropietario usuarioProp1 = new UsuarioPropietario(200, cuenta1, 41234567, "pass123", "Juan Perez");
        UsuarioPropietario usuarioProp2 = new UsuarioPropietario(50, cuenta2, 51234567, "pass123", "Ana Lopez");
        UsuarioPropietario usuarioProp3 = new UsuarioPropietario(500, cuenta3, 11234567, "pass123", "Alberto Rodriguez");
        
        UsuarioAdministrador usuarioAdmin1 = new UsuarioAdministrador(41234567, "pass123", "Carlos Gonzalez");
        
        fachada.agregar(usuarioProp1);
        fachada.agregar(usuarioProp2);
        fachada.agregar(usuarioProp3);
        fachada.agregar(usuarioAdmin1);
                
    }
}
