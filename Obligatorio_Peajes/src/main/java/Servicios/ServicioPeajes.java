/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import dominio.Bonificacion;
import dominio.Puesto;
import dominio.Tarifa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebita
 */

public class ServicioPeajes {
    
    private List<Puesto> puestos = new ArrayList();
    private List<Bonificacion> bonificaiones = new ArrayList();

    public ServicioPeajes() {
        
    }

    public List<Puesto> getPuestos() {
        return puestos;
    }
    
      public List<Bonificacion> getBonificaiones() {
        return bonificaiones;
    }
      
      public void agregar (Puesto puesto){
       this.puestos.add(puesto);
      }
      
          public void agregar (Bonificacion bonificacion){
       this.bonificaiones.add(bonificacion);
      }
          
          public void agregar (Tarifa tarifa, Puesto puesto){
              for(Puesto p : puestos){
                  if(p.equals(puesto)){
                  p.agregar(tarifa);
                  }
              }
          }

    
}