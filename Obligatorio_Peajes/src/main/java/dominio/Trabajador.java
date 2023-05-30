/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Trabajador extends TipoBonificacion {

    public Trabajador() {
        super("Trabajador");
    }

    @Override
    public double getPorcentajeDescuento(Transito transito) {
        int dayOfWeek = 3;//transito.getFecha().getDayOfWeek().getValue();
        return (dayOfWeek >= 1 && dayOfWeek <= 5) ? 80 : 0;
    }
    
}
