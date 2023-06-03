/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.fachada.Fachada;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Vehiculo {
    private UsuarioPropietario usuarioPropietario;
    private Categoria categoria;
    private String matricula;
    private String modelo;
    private String color;
    private List<Transito> transitos = new ArrayList<>();
    
    public Vehiculo(UsuarioPropietario usuarioPropietario, Categoria categoria, String matricula, String modelo, String color) {
        this.usuarioPropietario = usuarioPropietario;
        this.categoria = categoria;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return usuarioPropietario;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Transito> getTransitos() {
        return transitos;
    }

    
    public int getCantidadTransitos(){
        return this.getTransitos().size();
    }
    
    public double getMontoTotal(){
        double montoTotal = 0;
        for(Transito t : this.transitos){
            montoTotal += t.getMontoPagado();
        }
        return montoTotal;
    }

    public boolean agregar(Transito transito) {
        return this.transitos.add(transito);
    }

    public int getCantidadTransitosHoy(Puesto puesto) {
        int transitosHoy = 0;
        for (Transito transito : transitos) {
            if(transito.getFecha().equals(LocalDate.now()) && transito.getPuesto().equals(puesto)){
                transitosHoy ++;
            }
        }
        return transitosHoy;
    }
}
