/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import Exceptions.RecargaException;
import Servicios.Fachada;
import Servicios.ServicioUsuarios;
import dominio.Categoria;
import dominio.Cuenta;
import dominio.Recarga;
import dominio.Tarifa;
import dominio.UsuarioAdministrador;
import dominio.UsuarioPropietario;
import dominio.Vehiculo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author gonzalobazzi
 */
public class DatosPrueba {

    public static void cargar(){
        Fachada fachada = Fachada.getInstancia();
        
        //Cuentas
        Cuenta cuenta1 = new Cuenta(3500);
        Cuenta cuenta2 = new Cuenta(100);
        Cuenta cuenta3 = new Cuenta(2000);
        
        //Usuarios Propietarios
        UsuarioPropietario usuarioProp1 = new UsuarioPropietario(200, cuenta1, 41234567, "pass123", "Juan Perez");
        UsuarioPropietario usuarioProp2 = new UsuarioPropietario(50, cuenta2, 51234567, "pass123", "Ana Lopez");
        UsuarioPropietario usuarioProp3 = new UsuarioPropietario(500, cuenta3, 11234567, "pass123", "Alberto Rodriguez");
        
        //Usuarios Admin
        UsuarioAdministrador usuarioAdmin1 = new UsuarioAdministrador(41234567, "pass123", "Carlos Gonzalez");
        
        //Categorias
        Categoria cat1 = new Categoria("Automóvil");
        Categoria cat2 = new Categoria("Moto");
        Categoria cat3 = new Categoria("Camión");
        Categoria cat4 = new Categoria("Ómnibus");
        
        //Tarifas
        Tarifa tarifa1 = new Tarifa(100, cat1);
        Tarifa tarifa2 = new Tarifa(20, cat2);
        Tarifa tarifa3 = new Tarifa(180, cat3);
        Tarifa tarifa4 = new Tarifa(240, cat4);
        
        //Vehiculos
        Vehiculo vehiculo1 = new Vehiculo(usuarioProp1, cat1, "SDX 8547", "Celerio", "Plateado");
        Vehiculo vehiculo2 = new Vehiculo(usuarioProp1, cat3, "STR 2357", "Scania", "Rojo");
        Vehiculo vehiculo3 = new Vehiculo(usuarioProp2, cat1, "AXT 4978", "Gol", "Verde");
        Vehiculo vehiculo4 = new Vehiculo(usuarioProp3, cat4, "STX 1225", "Marcopolo", "Marrón");
        Vehiculo vehiculo5 = new Vehiculo(usuarioProp1, cat2, "LED 4512", "Jumbo", "Negro");
        Vehiculo vehiculo6 = new Vehiculo(usuarioProp3, cat1, "BMN 5423", "Lancer", "Blanco");
        
        List<Vehiculo> vehiculosProp1 = new ArrayList<>(Arrays.asList(vehiculo1,vehiculo2,vehiculo5));
        
        usuarioProp1.setVehiculos(vehiculosProp1);
        
        //Agregar Usuarios
        fachada.agregar(usuarioProp1);
        fachada.agregar(usuarioProp2);
        fachada.agregar(usuarioProp3);
        fachada.agregar(usuarioAdmin1);
        
        //Recargas
        Recarga rec1 = new Recarga(128.8, cuenta1, usuarioProp1);
        Recarga rec2 = new Recarga(250, cuenta1, usuarioProp1);
        Recarga rec3 = new Recarga(350, cuenta1, usuarioProp1);
        Recarga rec4 = new Recarga(350, cuenta2, usuarioProp2);
        Recarga rec5 = new Recarga(1000, cuenta3, usuarioProp3);
        Recarga rec6 = new Recarga(200, cuenta3, usuarioProp3);
        try{
            fachada.agregar(rec1);
            fachada.agregar(rec2);
            fachada.agregar(rec3);
            fachada.agregar(rec4);
            fachada.agregar(rec5);
            fachada.agregar(rec6);
        } catch(RecargaException re){
            
        }
                
    }
}
