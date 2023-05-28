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
    private double montoPagado;
    private Bonificacion bonificacion = null;

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

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return this.puesto.getMonto(this.vehiculo.getCategoria());
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return this.vehiculo.getUsuarioPropietario();
    }

    public double getPorcentajeDescuento() {
        return (this.bonificacion != null) ? this.bonificacion.getPorcentajeDescuento(this) : 0;
    }

    public double getMontoAPagar() {
        double montoTransito = this.getMonto();
        double porcentajeDescuento = this.getPorcentajeDescuento();
        return montoTransito * (1 - porcentajeDescuento / 100);
    }
    
}
