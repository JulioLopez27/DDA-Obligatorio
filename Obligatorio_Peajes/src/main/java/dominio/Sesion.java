/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.time.LocalDate;

/**
 *
 * @author Julio Cesar
 */
public class Sesion {
    private LocalDate inicio;
    private LocalDate fin;
    private UsuarioPropietario usuarioPropietario;

    public Sesion(UsuarioPropietario usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
        this.inicio = LocalDate.now();
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return usuarioPropietario;
    }
    
    
}
