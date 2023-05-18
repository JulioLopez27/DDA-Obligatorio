/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuGrafica;

import Exceptions.LoginException;
import Servicios.Fachada;
import dominio.Usuario;
import java.awt.Frame;

/**
 *
 * @author sebita
 */
public class LoginUsuarioAdministrador extends LoginAbstracto {
       public LoginUsuarioAdministrador(Frame parent, boolean modal){
        super(parent,modal, "Aplicación para administradores");
       }

    @Override
    protected Usuario validarUsuario(String cedula, String password) throws LoginException {
        return Fachada.getInstancia().loginUsuarioAdministrador(cedula, password);
    }

    @Override
    protected void ejecutarProximoCasoDeUso(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

       
}
