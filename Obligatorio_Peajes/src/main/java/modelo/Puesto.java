/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Interfaces.Renderizable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Puesto implements Renderizable {

    private String nombre;
    private String direccion;
    private List<Tarifa> tarifas = new ArrayList<>();

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

    public void agregar(Tarifa tarifa) {
        this.tarifas.add(tarifa);
    }

    @Override
    public String getDescription() {
        return this.getNombre();
    }

    public double getMonto(Categoria categoria) {
        for (Tarifa tarifa : tarifas) {
            if (tarifa.getCategoria().equals(categoria)) {
                return tarifa.getMonto();
            }
        }
        return 0;
    }

}
