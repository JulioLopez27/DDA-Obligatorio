/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Exceptions.PeajesException;
import modelo.fachada.Fachada;
import modelo.servicios.ServicioUsuarios;
import modelo.Bonificacion;
import modelo.Categoria;
import modelo.Cuenta;
import modelo.Exonerado;
import modelo.Frecuente;
import modelo.Puesto;
import modelo.Recarga;
import modelo.Tarifa;
import modelo.Trabajador;
import modelo.Transito;
import modelo.UsuarioAdministrador;
import modelo.UsuarioPropietario;
import modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Bonificable;
import java.time.LocalDateTime;

/**
 *
 * @author gonzalobazzi
 */
public class DatosPrueba {

    public static void cargar() {
        Fachada fachada = Fachada.getInstancia();

        //Cuentas
        Cuenta cuenta1 = new Cuenta(3500, null);
        Cuenta cuenta2 = new Cuenta(50, null);
        Cuenta cuenta3 = new Cuenta(2000, null);

        //Usuarios Propietarios
        UsuarioPropietario usuarioProp1 = new UsuarioPropietario(2500, cuenta1, 123, "123", "Juan Perez");
        UsuarioPropietario usuarioProp2 = new UsuarioPropietario(50, cuenta2, 456, "456", "Ana Lopez");
        UsuarioPropietario usuarioProp3 = new UsuarioPropietario(500, cuenta3, 789, "789", "Alberto Rodriguez");

        cuenta1.setUsuarioPropietario(usuarioProp1);
        cuenta2.setUsuarioPropietario(usuarioProp2);
        cuenta3.setUsuarioPropietario(usuarioProp3);

        //Usuarios Admin
        UsuarioAdministrador usuarioAdmin1 = new UsuarioAdministrador(41234567, "123", "Carlos Gonzalez");
        UsuarioAdministrador usuarioAdmin2 = new UsuarioAdministrador(123, "123", "Admin 123");
        UsuarioAdministrador usuarioAdmin3 = new UsuarioAdministrador(456, "456", "Admin 456");

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
        Vehiculo vehiculo1_prop1 = new Vehiculo(usuarioProp1, cat1, "SDX 8547", "Celerio", "Plateado");
        Vehiculo vehiculo2_prop1 = new Vehiculo(usuarioProp1, cat3, "STR 2357", "Scania", "Rojo");
        Vehiculo vehiculo3_prop2 = new Vehiculo(usuarioProp2, cat1, "AXT 4978", "Gol", "Verde");
        Vehiculo vehiculo4_prop3 = new Vehiculo(usuarioProp3, cat4, "STX 1225", "Marcopolo", "Marrón");
        Vehiculo vehiculo5_prop1 = new Vehiculo(usuarioProp1, cat2, "LED 4512", "Jumbo", "Negro");
        Vehiculo vehiculo6_prop3 = new Vehiculo(usuarioProp3, cat1, "BMN 5423", "Lancer", "Blanco");

        List<Vehiculo> vehiculosProp1 = new ArrayList<>(Arrays.asList(vehiculo1_prop1, vehiculo2_prop1, vehiculo5_prop1));
        usuarioProp1.setVehiculos(vehiculosProp1);
        List<Vehiculo> vehiculosProp2 = new ArrayList<>(Arrays.asList(vehiculo3_prop2));
        usuarioProp2.setVehiculos(vehiculosProp2);
        List<Vehiculo> vehiculosProp3 = new ArrayList<>(Arrays.asList(vehiculo4_prop3, vehiculo6_prop3));
        usuarioProp3.setVehiculos(vehiculosProp3);

        //Agregar Usuarios
        fachada.agregar(usuarioProp1);
        fachada.agregar(usuarioProp2);
        fachada.agregar(usuarioProp3);
        fachada.agregar(usuarioAdmin1);
        fachada.agregar(usuarioAdmin2);
        fachada.agregar(usuarioAdmin3);

        //Puestos
        Puesto puesto1 = new Puesto("Peaje Solis", "Rta Interbalnearia KM 48");
        Puesto puesto2 = new Puesto("Peaje Pando", "Rta Interbalnearia KM 28");
        Puesto puesto3 = new Puesto("Peaje Garzón", "Rta 9 KM 225");
        Puesto puesto4 = new Puesto("Peaje Rocha", "Rta 9 KM 330");

        fachada.agregar(puesto1);
        fachada.agregar(puesto2);
        fachada.agregar(puesto3);
        fachada.agregar(puesto4);

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
        fachada.agregar(tarifa5, puesto4);
        fachada.agregar(tarifa6, puesto4);
        fachada.agregar(tarifa7, puesto4);
        fachada.agregar(tarifa8, puesto4);

        //Recargas
        Recarga rec1 = new Recarga(128.8, cuenta1);
        Recarga rec2 = new Recarga(250, cuenta1);
        Recarga rec3 = new Recarga(350, cuenta1);
        Recarga rec4 = new Recarga(350, cuenta2);
        Recarga rec5 = new Recarga(1000, cuenta3);
        Recarga rec6 = new Recarga(200, cuenta3);

        //TipoBonificacion
        Bonificable tipoBonifExonerado = new Exonerado();
        Bonificable tipoBonifFrecuente = new Frecuente();
        Bonificable tipoBonifTrabajador = new Trabajador();

        //Bonificaciones
        Bonificacion bonificacion1 = new Bonificacion(tipoBonifExonerado, puesto1);
        Bonificacion bonificacion2 = new Bonificacion(tipoBonifFrecuente, puesto2);
        Bonificacion bonificacion3 = new Bonificacion(tipoBonifTrabajador, puesto3);

        //Transitos
        Transito transito1_prop2 = new Transito(vehiculo3_prop2, puesto1);
        Transito transito2_prop2 = new Transito(vehiculo3_prop2, puesto2);
        Transito transito1_prop1 = new Transito(vehiculo1_prop1, puesto3);
        Transito transito2_prop1 = new Transito(vehiculo1_prop1, puesto1);
        Transito transito3_prop1 = new Transito(vehiculo1_prop1, puesto4);
        Transito transito4_prop1 = new Transito(vehiculo1_prop1, puesto1);
        Transito transito5_prop1 = new Transito(vehiculo1_prop1, puesto4);
        Transito transito6_prop1 = new Transito(vehiculo1_prop1, puesto3);
        Transito transito7_prop1 = new Transito(vehiculo1_prop1, puesto2);
        Transito transito8_prop1 = new Transito(vehiculo1_prop1, puesto2);
        Transito transito9_prop1 = new Transito(vehiculo1_prop1, puesto2);

        //Cambiamos la fecha del tránsito para validar el orden
        transito1_prop1.setFecha(LocalDateTime.of(2023, 5, 21, 10, 30));
        transito2_prop1.setFecha(LocalDateTime.of(2023, 1, 10, 11, 30));
        transito3_prop1.setFecha(LocalDateTime.of(2023, 6, 21, 10, 30));
        transito4_prop1.setFecha(LocalDateTime.of(2023, 6, 21, 10, 15));
        transito5_prop1.setFecha(LocalDateTime.of(2023, 3, 2, 21, 30));
        transito6_prop1.setFecha(LocalDateTime.of(2023, 3, 2, 18, 30));
        transito7_prop1.setFecha(LocalDateTime.of(2023, 5, 21, 10, 30));
        transito8_prop1.setFecha(LocalDateTime.of(2023, 6, 20, 10, 30));

        try {
            //Agregamos recargas
            fachada.agregar(rec1);
            fachada.agregar(rec2);
            fachada.agregar(rec3);
            fachada.agregar(rec4);
            fachada.agregar(rec5);
            fachada.agregar(rec6);

            //Agregamos tipos de bonificación
            fachada.agregar(tipoBonifExonerado);
            fachada.agregar(tipoBonifFrecuente);
            fachada.agregar(tipoBonifTrabajador);

            //Asignamos Bonificación
            fachada.asignarBonificacion(usuarioProp1, bonificacion1);
            fachada.asignarBonificacion(usuarioProp1, bonificacion2);
            fachada.asignarBonificacion(usuarioProp1, bonificacion3);

            //Agregamos Transitos
            fachada.agregar(transito1_prop1);
            fachada.agregar(transito2_prop1);
            fachada.agregar(transito3_prop1);
            fachada.agregar(transito4_prop1);
            fachada.agregar(transito5_prop1);
            fachada.agregar(transito6_prop1);
            fachada.agregar(transito7_prop1);
            fachada.agregar(transito8_prop1);
            fachada.agregar(transito9_prop1);

        } catch (PeajesException pe) {
            System.out.println("ERROR: " + pe.getMessage());
        }

    }
}
