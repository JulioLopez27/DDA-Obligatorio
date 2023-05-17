/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import dominio.Sesion;
import dominio.Usuario;
import dominio.UsuarioAdministrador;
import dominio.UsuarioPropietario;
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

    public Sesion loginUsuarioPropietario(String cedula, String password) {
       UsuarioPropietario usuarioLogueado=(UsuarioPropietario)this.loginUsuario(cedula, password, (ArrayList)usuariosPropietario);
       if(usuarioLogueado!=null){
           Sesion sesion= new Sesion(usuarioLogueado);
           this.agregar(sesion);
           return sesion;
       }
       return null;
    
    }

    public UsuarioAdministrador loginUsuarioAdministrador(String cedula, String password) {
       return (UsuarioAdministrador)this.loginUsuario(cedula, password,(ArrayList)usuariosAdministrador);
    }

    private Usuario loginUsuario(String cedula, String password, List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            int cedulaNro = Integer.parseInt(cedula);
            if (u.getCedula() == cedulaNro && u.esPasswordValida(password)) {
                return u;
            }
        }
        return null;
    }

    
    
    
    
    private void agregar(Sesion sesion) {
        sesiones.add(sesion);
    }
}
