/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import Exceptions.LoginException;
import modelo.Usuario;
import modelo.fachada.Fachada;
import vista.LoginAbstractoVista;

/**
 *
 * @author gonzalobazzi
 */
public class LoginUsuarioPropietarioControlador extends LoginAbstractoControlador {

    public LoginUsuarioPropietarioControlador(LoginAbstractoVista vista, String titulo) {
        super(vista, titulo);
    }

    @Override
    protected Usuario validarUsuario(int cedula, String password) throws LoginException {
        return Fachada.getInstancia().loginUsuarioPorpietario(cedula, password);
    }
}
