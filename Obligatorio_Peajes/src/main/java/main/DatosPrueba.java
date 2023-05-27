/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Exceptions.RecargaException;
import Servicios.Fachada;
import Servicios.ServicioUsuarios;
import dominio.Bonificacion;
import dominio.Categoria;
import dominio.Cuenta;
import dominio.Puesto;
import dominio.Recarga;
import dominio.Tarifa;
import dominio.Transito;
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

    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();

        //Cuentas
        Cuenta cuenta1 = new Cuenta(3500, null);
        Cuenta cuenta2 = new Cuenta(100, null);
        Cuenta cuenta3 = new Cuenta(2000, null);

        //Usuarios Propietarios
        UsuarioPropietario usuarioProp1 = new UsuarioPropietario(200, cuenta1, 41234567, "pass123", "Juan Perez");
        UsuarioPropietario usuarioProp2 = new UsuarioPropietario(50, cuenta2, 51234567, "pass123", "Ana Lopez");
        UsuarioPropietario usuarioProp3 = new UsuarioPropietario(500, cuenta3, 11234567, "pass123", "Alberto Rodriguez");

        cuenta1.setUsuarioPropietario(usuarioProp1);
        cuenta2.setUsuarioPropietario(usuarioProp2);
        cuenta3.setUsuarioPropietario(usuarioProp3);

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
        Tarifa tarifa5 = new Tarifa(200, cat1);
        Tarifa tarifa6 = new Tarifa(40, cat2);
        Tarifa tarifa7 = new Tarifa(360, cat3);
        Tarifa tarifa8 = new Tarifa(480, cat4);
        
        //Vehiculos
        Vehiculo vehiculo1 = new Vehiculo(usuarioProp1, cat1, "SDX 8547", "Celerio", "Plateado");
        Vehiculo vehiculo2 = new Vehiculo(usuarioProp1, cat3, "STR 2357", "Scania", "Rojo");
        Vehiculo vehiculo3 = new Vehiculo(usuarioProp2, cat1, "AXT 4978", "Gol", "Verde");
        Vehiculo vehiculo4 = new Vehiculo(usuarioProp3, cat4, "STX 1225", "Marcopolo", "Marrón");
        Vehiculo vehiculo5 = new Vehiculo(usuarioProp1, cat2, "LED 4512", "Jumbo", "Negro");
        Vehiculo vehiculo6 = new Vehiculo(usuarioProp3, cat1, "BMN 5423", "Lancer", "Blanco");

        List<Vehiculo> vehiculosProp1 = new ArrayList<>(Arrays.asList(vehiculo1, vehiculo2, vehiculo5));
        usuarioProp1.setVehiculos(vehiculosProp1);

        //Agregar Usuarios
        fachada.agregar(usuarioProp1);
        fachada.agregar(usuarioProp2);
        fachada.agregar(usuarioProp3);
        fachada.agregar(usuarioAdmin1);

        //Puestos
        Puesto puesto1 = new Puesto("Peaje Solis", "Rta Interbalnearia KM 48");
        Puesto puesto2 = new Puesto("Peaje Pando", "Rta Interbalnearia KM 28");
        Puesto puesto3 = new Puesto("Peaje Garzón", "Rta 9 KM 225");

        fachada.agregar(puesto1);
        fachada.agregar(puesto2);
        fachada.agregar(puesto3);

        fachada.agregar(tarifa1, puesto1);
        fachada.agregar(tarifa2, puesto1);
        fachada.agregar(tarifa3, puesto1);
        fachada.agregar(tarifa4, puesto1);
        fachada.agregar(tarifa1, puesto2);
        fachada.agregar(tarifa2, puesto2);
        fachada.agregar(tarifa3, puesto2);
        fachada.agregar(tarifa4, puesto2);
        fachada.agregar(tarifa5, puesto3);
        fachada.agregar(tarifa6, puesto3);
        fachada.agregar(tarifa7, puesto3);
        fachada.agregar(tarifa8, puesto3);
        


        //Transitos
        Transito transito1 = new Transito(vehiculo1, puesto1);
        Transito transito2 = new Transito(vehiculo1, puesto2);
        Transito transito3 = new Transito(vehiculo1, puesto3);

        //Agregar Transitos
        fachada.agregar(transito1);
        fachada.agregar(transito2);
        fachada.agregar(transito3);

        //Recargas
        Recarga rec1 = new Recarga(128.8, cuenta1);
        Recarga rec2 = new Recarga(250, cuenta1);
        Recarga rec3 = new Recarga(350, cuenta1);
        Recarga rec4 = new Recarga(350, cuenta2);
        Recarga rec5 = new Recarga(1000, cuenta3);
        Recarga rec6 = new Recarga(200, cuenta3);
        try {
            fachada.agregar(rec1);
            fachada.agregar(rec2);
            fachada.agregar(rec3);
            fachada.agregar(rec4);
            fachada.agregar(rec5);
            fachada.agregar(rec6);
        } catch (RecargaException re) {

        }
        Bonificacion b1 = new Bonificacion("Exonerado");
        Bonificacion b2 = new Bonificacion("Trabajador");
        usuarioProp1.agregar(b1);
        usuarioProp1.agregar(b2);
    }
}
