/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;
import Exceptions.RecargaException;
import java.util.ArrayList;
import java.util.Collection;
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

    public void agregar(Bonificacion bonificacion) {
    this.bonificaciones.add(bonificacion);
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

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
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
    
    public int getCantidadTransitos(){
        int cantidadTransitos = 0;
        for(Vehiculo v : this.getVehiculos()){
            cantidadTransitos += v.getCantidadTransitos();
        }
        return cantidadTransitos;
    }

    public void agregarRecarga(Recarga recarga) throws RecargaException {
        this.cuenta.agreagar(recarga);
    }

    public List<Recarga> getRecargasPendientes() {
        return this.cuenta.getRecargasPendientes();
    }
    
    public List<Recarga> getRecargas() {
        return this.cuenta.getRecargas();
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        return this.getCuenta().aprobar(recarga, usuarioAdministrador);
    }

    public boolean existe(Vehiculo vehiculo) {
        for(Vehiculo v : this.vehiculos){
            if(v.equals(vehiculo))
                return true;
        }
        return false;
    }

    public void agregar(Transito transito) {
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.equals(transito.getVehiculo())){
                vehiculo.agregar(transito);
                return;
            }
        }
    }

    public List<Transito> getTransitos() {
        List<Transito> transitosUsuario = new ArrayList();
        for (Vehiculo v : vehiculos) {
            transitosUsuario.addAll(v.getTransitos());
        }
        return transitosUsuario;
    }

    public Vehiculo buscarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getMatricula().equals(matricula)){
                return vehiculo;
            }
        }
        return null;
    }

    public void asignarBonificacion(Bonificacion bonificacionSeleccionada) {
        if(bonificaciones.isEmpty() || !existeBonificacion(bonificacionSeleccionada)){
            this.bonificaciones.add(bonificacionSeleccionada);
        }
    }

    private boolean existeBonificacion(Bonificacion bonificacionSeleccionada) {
        for (Bonificacion b : bonificaciones) {
            if(b.getPuesto().equals(bonificacionSeleccionada.getPuesto())){
                return true;
            }
        }
        return false;
    }

    public Bonificacion getBonificacionPuesto(Puesto puestoSeleccionado) {
        for (Bonificacion b : bonificaciones) {
            if(b.getPuesto().equals(puestoSeleccionado)){
                return b;
            }
        }
        return null;
    }

    
}
