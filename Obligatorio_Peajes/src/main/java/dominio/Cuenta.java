/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;
import Exceptions.RecargaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Cuenta {
    private double saldo;
    private List<Recarga> recargas = new ArrayList();

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }
    
    public String getSaldoFormateado(){
        return "$ " + this.saldo;
    }

    public void agreagar(Recarga recarga) throws RecargaException {
        if(recarga != null && recarga.getMonto() > 0){
            this.recargas.add(recarga);
        } else {
            throw new RecargaException("Monto inválido");
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
}
