/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.servicios;

import Exceptions.LoginException;
import Exceptions.PeajesException;
import modelo.Bonificacion;
import modelo.Recarga;
import modelo.Sesion;
import modelo.Transito;
import modelo.Usuario;
import modelo.UsuarioAdministrador;
import modelo.UsuarioPropietario;
import modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import modelo.Notificacion;

/**
 *
 * @author Julio Cesar
 */
public class ServicioUsuarios {

    private List<UsuarioPropietario> usuariosPropietario;
    private List<UsuarioAdministrador> usuariosAdministrador;
    private List<Sesion> sesiones;

    public ServicioUsuarios() {
        usuariosPropietario = new ArrayList<>();
        usuariosAdministrador = new ArrayList<>();
        sesiones = new ArrayList<>();
    }

    public Sesion loginUsuarioPropietario(int cedula, String password) throws LoginException { //TODO QUITAR LA SESION 
       UsuarioPropietario usuarioLogueado=(UsuarioPropietario)this.loginUsuario(cedula, password, (ArrayList)usuariosPropietario);
       if(usuarioLogueado!=null){
           Sesion sesion= new Sesion(usuarioLogueado);
           this.agregar(sesion);
           return sesion;
       }
       return null;
    
    }

    private void agregar(Sesion sesion) {
        sesiones.add(sesion);
    }
        
    public UsuarioAdministrador loginUsuarioAdministrador(int cedula, String password) throws LoginException {
        UsuarioAdministrador usuarioAdministrador = (UsuarioAdministrador)this.loginUsuario(cedula, password,(ArrayList)usuariosAdministrador);
        if(usuarioAdministrador.isLogueado()){
            throw new LoginException("Ud ya está logueado.");
        } else {
            usuarioAdministrador.setLogueado(true);
            return usuarioAdministrador;
        }
    }

    private Usuario loginUsuario(int cedula, String password, List<Usuario> usuarios) throws LoginException {
        for (Usuario u : usuarios) {
            if (u.validarCredenciales(cedula, password)) {
                return u;
            }
        }
        throw new LoginException("Acceso denegado");
    }
    
    public boolean agregar(UsuarioPropietario usuarioPropietario){
        return usuariosPropietario.add(usuarioPropietario);
    } 
    
    public boolean agregar(UsuarioAdministrador usuarioAdministrador){
        return usuariosAdministrador.add(usuarioAdministrador);
    } 
    
    public void agregar(Recarga recarga) throws PeajesException {
        for(UsuarioPropietario up : this.usuariosPropietario){
            if(up.equals(recarga.getUsuarioPropietario())){
                up.agregarRecarga(recarga);
                return;
            }
        }
    }

    public List<Recarga>getRecargasPendientes() {
       List<Recarga> recargasPendientes = new ArrayList(); 
        for(UsuarioPropietario up : this.usuariosPropietario){
            recargasPendientes.addAll(up.getRecargasPendientes());
        }
        return recargasPendientes;
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        for(UsuarioPropietario up : this.usuariosPropietario){
            if(up.equals(recarga.getUsuarioPropietario())){
                if(up.aprobar(recarga, usuarioAdministrador)){
                    up.agregar(new Notificacion("Tu recarga de $" + recarga.getMonto() + " fue aprobada."));
                    return true;
                }
            }
        }
        return false;
    }
    
    public List<Vehiculo> getVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList(); 
        for(UsuarioPropietario up : this.usuariosPropietario){
            vehiculos.addAll(up.getVehiculos());
        }
        return vehiculos;
    }

    public List<Recarga> getRecargas() {
        List<Recarga> recargas = new ArrayList(); 
        for(UsuarioPropietario up : this.usuariosPropietario){
            recargas.addAll(up.getRecargas());
        }
        return recargas;
    }

    public Transito agregar(Transito transito) throws PeajesException {
        for(UsuarioPropietario up : this.usuariosPropietario){ 
            if(up.existe(transito.getVehiculo())){
                return up.agregar(transito);
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculo(String matricula) throws PeajesException{
        for (UsuarioPropietario usuarioPropietario : usuariosPropietario) {
            Vehiculo vehiculoEncontrado = usuarioPropietario.buscarVehiculo(matricula);
            if(vehiculoEncontrado != null){
                return vehiculoEncontrado;
            }
        }
        throw new PeajesException("No existe el vehículo");
    }

    public UsuarioPropietario buscarUsuario(String cedula) throws PeajesException {
        for (UsuarioPropietario usuarioPropietario : usuariosPropietario) {
            if(usuarioPropietario.getCedula() == Integer.parseInt(cedula)){
                return usuarioPropietario;
            }
        }
         throw new PeajesException("No existe el propietario");
    }

    public void asignarBonificacion(UsuarioPropietario usuarioEncontrado, Bonificacion bonificacionSeleccionada) throws PeajesException {
        if(bonificacionSeleccionada == null)
            throw new PeajesException("Debe especificar una bonificación");
        if(bonificacionSeleccionada.getPuesto() == null)
            throw new PeajesException("Debe expecificar un puesto");
        for (UsuarioPropietario up : usuariosPropietario) {
            if(up.equals(usuarioEncontrado)){
                up.asignarBonificacion(bonificacionSeleccionada);
                return;
            }
        }
    }
    
}
