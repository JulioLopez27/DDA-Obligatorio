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
public class Recarga {
    private double monto;
    private LocalDate fecha;
    private UsuarioAdministrador aprobador;

    public Recarga(double monto) {
        this.monto = monto;
        this.fecha = LocalDate.now();
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public UsuarioAdministrador getAprobador() {
        return aprobador;
    }

    public void setAprobador(UsuarioAdministrador aprobador) {
        this.aprobador = aprobador;
    }
    
    
    
}
