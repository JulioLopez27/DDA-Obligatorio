/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Interfaces.Renderizable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Bonificacion implements Renderizable {
    private String nombre;
    private TipoBonificacion tipoBonificacion;
    private Puesto puesto = null; //ToDo PREGUNTAR AL PROFE

    public Bonificacion(TipoBonificacion tipoBonificacion) {
        this.tipoBonificacion = tipoBonificacion;
        this.nombre = tipoBonificacion.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public TipoBonificacion getTipoBonificacion() {
        return tipoBonificacion;
    }

    public void setTipoBonificacion(TipoBonificacion tipoBonificacion) {
        this.tipoBonificacion = tipoBonificacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String getDescription() {
        return this.getNombre();
    }

    public double getPorcentajeDescuento(Transito transito) {
        return this.tipoBonificacion.getPorcentajeDescuento(transito);
    }
    
    
}
