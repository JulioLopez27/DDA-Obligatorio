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
public class Recarga {
    private double monto;
    private LocalDate fecha;
    private UsuarioAdministrador aprobador;
    private Cuenta cuenta;

    public Recarga(double monto, Cuenta cuenta) {
        this.monto = monto;
        this.cuenta = cuenta;
        this.fecha = LocalDate.now();
    }

    public double getMonto() {
        return monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public UsuarioAdministrador getAprobador() {
        return aprobador;
    }

    public void setAprobador(UsuarioAdministrador aprobador) {
        this.aprobador = aprobador;
    }
    
    public UsuarioPropietario getUsuarioPropietario(){
        return this.cuenta.getUsuarioPropietario();
    } 
    
    public String getEstado(){
        return (this.aprobador != null) ? "Aprobada" : "Pendiente";
    }
    
}
