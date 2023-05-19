/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gonzalobazzi
 */
public class Observable {
    
    private List<Observer> observadores;
    
    public enum Evento {
        RECARGA_SOLICITADA,
        SALDO_ACTUALIZADO,
        BONIFICACION_ASIGNADA,
        TRANSITO_EFECTUADO
        
    }
    
    public Observable() {
        observadores = new ArrayList();
    }
    
    public void subscribir(Observer o) {
        this.observadores.add(o);
    }
    
    public void desubscribir(Observer o) {
        this.observadores.remove(o);
    }
    
    public void notificar(Observable.Evento e) {
        for(Observer o : observadores)
            o.notificar(this, e);
    }
    
}
