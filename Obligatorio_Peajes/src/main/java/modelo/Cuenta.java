/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import Exceptions.PeajesException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Cuenta {
    private double saldo;
    private UsuarioPropietario usuarioPropietario;
    private List<Recarga> recargas = new ArrayList();

    public Cuenta(double saldo, UsuarioPropietario usuarioPropietario) {
        this.saldo = saldo;
        this.usuarioPropietario = usuarioPropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setUsuarioPropietario(UsuarioPropietario usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
    }

    public UsuarioPropietario getUsuarioPropietario() {
        return usuarioPropietario;
    }
    
    public List<Recarga> getRecargas() {
        return recargas;
    }
    
    public String getSaldoFormateado(){
        return "$ " + this.saldo;
    }

    public void agregar(Recarga recarga) throws PeajesException {
        if(recarga != null && recarga.getMonto() > 0){
            this.recargas.add(recarga);
        } else {
            throw new PeajesException("Monto inválido");
        }
    }

    public List<Recarga> getRecargasPendientes() {
        List<Recarga> recargasPendientes = new ArrayList();
        for(Recarga r :this.recargas){
            if(r.getAprobador() == null){
                recargasPendientes.add(r);
            }
        }
        return recargasPendientes;
    }

    public boolean aprobar(Recarga recarga, UsuarioAdministrador usuarioAdministrador) {
        for(Recarga r : this.recargas){
            if(r.equals(recarga)){
                r.setAprobador(usuarioAdministrador);
                this.saldo += r.getMonto();
                return true;
            }
        }
        return false;
    }

    public boolean validarSaldo(double montoAPagar) {
        return montoAPagar <= this.getSaldo();
    }

    public void actualizarSaldo(double montoAPagar) {
        this.saldo -= montoAPagar;
    }
}
