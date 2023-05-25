/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Exceptions.LoginException;
import Exceptions.RecargaException;
import dominio.Recarga;
import dominio.Sesion;
import dominio.Usuario;
import dominio.UsuarioAdministrador;
import dominio.UsuarioPropietario;
import dominio.Vehiculo;
import java.util.ArrayList;
import java.util.List;

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

    public Sesion loginUsuarioPropietario(String cedula, String password) throws LoginException {
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
        
    public UsuarioAdministrador loginUsuarioAdministrador(String cedula, String password) throws LoginException {
       return (UsuarioAdministrador)this.loginUsuario(cedula, password,(ArrayList)usuariosAdministrador);
    }

    private Usuario loginUsuario(String cedula, String password, List<Usuario> usuarios) throws LoginException {
        for (Usuario u : usuarios) {
            int cedulaNro = Integer.parseInt(cedula); //ToDo validar que sea numero antes de castear
            if (u.validarCredenciales(cedulaNro, password)) {
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
    
    public void agregar(Recarga recarga) throws RecargaException {
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
            if(up.equals(recarga.getUsuarioPropietario())){ //ToDo Validar si es necesario pasar por cuenta
                return up.aprobar(recarga, usuarioAdministrador);
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

    List<Recarga> getRecargas() {
              List<Recarga> recargas = new ArrayList(); 
        for(UsuarioPropietario up : this.usuariosPropietario){
            recargas.addAll(up.getRecargas());
        }
        return recargas;
    }
    
    

}
