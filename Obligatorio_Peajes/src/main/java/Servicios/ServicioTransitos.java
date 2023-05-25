/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import dominio.Transito;
import dominio.UsuarioPropietario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class ServicioTransitos {
    
    private List<Transito> transitos;

    public ServicioTransitos() {
        this.transitos = new ArrayList();
    }

    public List<Transito> getTransitos() {
        return transitos;
    }

    public List<Transito> getTransitos(UsuarioPropietario usuarioPropietario) {
        List<Transito> transitosDeUsuario = new ArrayList();
        for(Transito t : this.transitos){
            if(t.getUsuarioPropietario().equals(usuarioPropietario)){
                transitosDeUsuario.add(t);
            }
        }
        return transitosDeUsuario;
    }
    
    public void agregar(Transito transito){
        this.transitos.add(transito);
    }
    
    
    
}
