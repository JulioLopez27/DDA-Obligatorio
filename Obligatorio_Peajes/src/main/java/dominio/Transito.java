/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.time.LocalDate;

/**
 *
 * @author Julio Cesar
 */
public class Transito {
    private Vehiculo vehiculo;
    private Puesto puesto;
    private LocalDate fecha;
    private double monto;

    public Transito(Vehiculo vehiculo, Puesto puesto) {
        this.vehiculo = vehiculo;
        this.puesto = puesto;
        this.fecha = LocalDate.now();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return this.puesto.getMonto(this.vehiculo.getCategoria());
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return this.vehiculo.getUsuarioPropietario();
    }
    
    
}
