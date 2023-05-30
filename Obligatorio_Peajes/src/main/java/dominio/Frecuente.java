/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import Servicios.Fachada;

/**
 *
 * @author Julio Cesar
 */
public class Frecuente extends TipoBonificacion {

    public Frecuente() {
        super("Frecuente");
    }

    @Override
    public double getPorcentajeDescuento(Transito transito) {
        int transitosEnElDia = transito.getVehiculo().getCantidadTransitosHoy(transito.getPuesto());
        return (transitosEnElDia >= 1) ? 50 : 0;
    }
    
    
}
