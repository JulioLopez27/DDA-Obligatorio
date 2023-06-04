/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.controladores;

import Observer.Observable;
import Observer.Observer;
import modelo.UsuarioPropietario;
import modelo.fachada.Fachada;
import vista.TableroControlVista;

/**
 *
 * @author gonzalobazzi
 */
public class TableroControlControlador implements Observer {

    private Fachada fachada = Fachada.getInstancia();
    private TableroControlVista vista;
    private UsuarioPropietario usuarioPropietario;
    
    public TableroControlControlador(TableroControlVista vista, UsuarioPropietario usuarioPropietario) {
        this.vista = vista;
        this.usuarioPropietario = usuarioPropietario;
        fachada.subscribir(this);
        vista.inicializarDatos(usuarioPropietario);
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        
    }

    public void cargarListas() {
        vista.cargarListaDeVehiculos(usuarioPropietario.getVehiculos());
        vista.cargarListaDeBonificaciones(usuarioPropietario.getBonificaciones());
        vista.cargarListaDeTransitos(usuarioPropietario.getTransitos());
        vista.cargarListaDeRecargas(usuarioPropietario.getRecargas());
        vista.cargarListaDeNotificaciones(usuarioPropietario.getNotificaciones());
    }

    public void cerrar() {
        fachada.desubscribir(this);
    }

    public void borrarNotificaciones() {
        usuarioPropietario.borrarNotificaciones();
    }

    public void abrirRecargarSaldo() {
        vista.ejecutarRecargaSaldo(usuarioPropietario);
    }
    
}
