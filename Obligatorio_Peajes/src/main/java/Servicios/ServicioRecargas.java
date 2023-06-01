/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Exceptions.PeajesException;
import dominio.Recarga;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
@Deprecated
public class ServicioRecargas {
    
    private List<Recarga> recargas = new ArrayList();

    public ServicioRecargas() {
        
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public void setRecargas(List<Recarga> recargas) {
        this.recargas = recargas;
    }

    public void agregar(Recarga recarga) throws PeajesException {
        if(recarga != null && recarga.getMonto() > 0){
            this.recargas.add(recarga);
        } else {
            throw new PeajesException("Monto inválido");
        }
    }
    
}
