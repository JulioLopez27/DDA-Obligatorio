/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Exceptions.LoginException;

/**
 *
 * @author Julio Cesar
 */
public class UsuarioAdministrador extends Usuario {

    private boolean logueado;
    
    public UsuarioAdministrador(int cedula, String password, String nombre) {
        super(cedula, password, nombre);
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }

}
