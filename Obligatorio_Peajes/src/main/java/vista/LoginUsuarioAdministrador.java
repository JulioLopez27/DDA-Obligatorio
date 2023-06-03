/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Exceptions.LoginException;
import modelo.fachada.Fachada;
import modelo.Usuario;
import modelo.UsuarioAdministrador;
import java.awt.Frame;

/**
 *
 * @author sebita
 */
public class LoginUsuarioAdministrador extends LoginAbstracto {

    public LoginUsuarioAdministrador(Frame parent, boolean modal) {
        super(parent, modal, "Aplicación para administradores");
    }

    @Override
    protected Usuario validarUsuario(int cedula, String password) throws LoginException {
        return Fachada.getInstancia().loginUsuarioAdministrador(cedula, password);
    }

    @Override
    protected void ejecutarProximoCasoDeUso(Usuario usuario) {
        new UIMenuAdministrador(null, false, (UsuarioAdministrador) usuario).setVisible(true);
    }

}
