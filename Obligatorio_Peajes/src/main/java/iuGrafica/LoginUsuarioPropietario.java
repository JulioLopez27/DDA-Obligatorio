/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuGrafica;

import Exceptions.LoginException;
import Servicios.Fachada;
import dominio.Sesion;
import dominio.Usuario;
import java.awt.Frame;

/**
 *
 * @author sebita
 */
public class LoginUsuarioPropietario extends LoginAbstracto {
    
    public LoginUsuarioPropietario(Frame parent, boolean modal){
        super(parent,modal, "Aplicación para propietarios");
        
    }

    @Override
    protected Usuario validarUsuario(String cedula, String password) throws LoginException {
        Sesion sesion = Fachada.getInstancia().loginUsuarioPorpietario(cedula, password);
          return sesion != null
                ? sesion.getUsuarioPropietario()
                : null;
       
    }

    @Override
    protected void ejecutarProximoCasoDeUso(Usuario usuario) {
        new TableroDeControl().setVisible(true);
    }
    
}
