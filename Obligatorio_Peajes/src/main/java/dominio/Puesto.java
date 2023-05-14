/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Puesto {
    private String nombre;
    private String direccion;
    private List<Tarifa> tarifas = new ArrayList<>();
    private List<Bonificacion> bonificaciones = new ArrayList<>(); //ToDo Esta lista debería estar en Puesto?

    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(List<Bonificacion> bonificaciones) {
        this.bonificaciones = bonificaciones;
    }
    
    
}