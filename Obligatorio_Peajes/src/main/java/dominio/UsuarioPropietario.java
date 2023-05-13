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
public class UsuarioPropietario extends Usuario {
    private double saldoMinimoAlerta;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private Cuenta cuenta;
    private List<Notificacion> notificaciones = new ArrayList<>();
    private List<Bonificacion> bonificaciones = new ArrayList<>();

    public UsuarioPropietario(double saldoMinimoAlerta, Cuenta cuenta, int cedula, String password, String nombre) {
        super(cedula, password, nombre);
        this.saldoMinimoAlerta = saldoMinimoAlerta;
        this.cuenta = cuenta;
    }

    public double getSaldoMinimoAlerta() {
        return saldoMinimoAlerta;
    }

    public void setSaldoMinimoAlerta(double saldoMinimoAlerta) {
        this.saldoMinimoAlerta = saldoMinimoAlerta;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public List<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }
    
    
}
