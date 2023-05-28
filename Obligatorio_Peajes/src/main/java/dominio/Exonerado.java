/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Julio Cesar
 */
public class Exonerado extends TipoBonificacion {

    public Exonerado() {
        super("Exonerado");
    }

    @Override
    public double getPorcentajeDescuento(Transito transito) {
        return 100;
    }
    
}
