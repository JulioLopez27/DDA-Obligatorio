package vista.controladores;

import Exceptions.PeajesException;
import Observer.Observable;
import Observer.Observer;
import modelo.Puesto;
import modelo.Transito;
import modelo.Vehiculo;
import modelo.fachada.Fachada;
import vista.EmularTransitoVista;

/**
 *
 * @author Julio Cesar
 */
public class EmularTransitoControlador implements Observer {

    private EmularTransitoVista vista;

    public EmularTransitoControlador() {
    }

    public EmularTransitoControlador(EmularTransitoVista vista) {
        this.vista = vista;
        vista.cargarComboPuestos(Fachada.getInstancia().getPuestos());
        Fachada.getInstancia().subscribir(this);
    }

    public void setVista(EmularTransitoVista vista) {
        this.vista = vista;
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cargarTarifasDePuesto(Puesto puesto) {
        vista.mostrarTarifasDePuesto(puesto.getTarifas());
    }

    public void registrarTransito(Puesto puestoSeleccionado, String matricula) {
        try {
            Vehiculo vehiculoEncontrado = Fachada.getInstancia().buscarVehiculo(matricula);
            Transito transitoAgregado = Fachada.getInstancia().agregar(new Transito(vehiculoEncontrado, puestoSeleccionado));
            vista.mostrarDatosDeTransito(detallesDeTransito(transitoAgregado));
        } catch (PeajesException pe) {
            vista.mostrarMensaje(pe.getMessage());
        }
    }

    private String detallesDeTransito(Transito transitoAgregado) {
        String nombreBonificacion = (transitoAgregado.getBonificacion() != null) ? transitoAgregado.getBonificacion().getNombre() : "No tiene";
        String datosTransito = "Nombre de Propietario: " + transitoAgregado.getUsuarioPropietario().getNombre() + "\r\n"
                + "Categoría de vehículo: " + transitoAgregado.getVehiculo().getCategoria().getNombre() + "\r\n"
                + "Bonificación: " + nombreBonificacion + "\r\n"
                + "Costo del tránsito: " + transitoAgregado.getMontoPagado() + "\r\n"
                + "Saldo disponible: " + transitoAgregado.getUsuarioPropietario().getCuenta().getSaldo();
        return datosTransito;
    }

    public void cerrar() {
        Fachada.getInstancia().desubscribir(this);
    }

}
