/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuGrafica;

import Exceptions.PeajesException;
import Observer.Observable;
import Observer.Observer;
import Servicios.Fachada;
import dominio.Recarga;
import dominio.UsuarioPropietario;
import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author Digital
 */
public class UIRecargaSaldo extends javax.swing.JDialog implements Observer {

    private UsuarioPropietario usuarioPropietario;
    
    /**
     * Creates new form RecargaSaldo
     */
    public UIRecargaSaldo(UsuarioPropietario usuario) {
        initComponents();
        this.usuarioPropietario = usuario;
        
        jTextNombreUsuario.setText(usuarioPropietario.getNombre());
        jTextSaldo.setText(usuarioPropietario.getCuenta().getSaldoFormateado());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextSaldo = new javax.swing.JLabel();
        jTextNombreUsuario = new javax.swing.JLabel();
        jTextFieldMontoRecarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recarga de saldo");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Monto a recargar: ");

        jButtonAceptar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jTextSaldo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextSaldo.setForeground(new java.awt.Color(0, 153, 0));
        jTextSaldo.setText("jLabel3");

        jTextNombreUsuario.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMontoRecarga, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextNombreUsuario)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextSaldo)
                    .addComponent(jTextNombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMontoRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        String montoARecargar = jTextFieldMontoRecarga.getText();
        try{
            Recarga nuevaRecarga = new Recarga(parseDouble(montoARecargar), usuarioPropietario.getCuenta());
            Fachada.getInstancia().agregar(nuevaRecarga);
            this.dispose();
        } catch (PeajesException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "El monto debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldMontoRecarga;
    private javax.swing.JLabel jTextNombreUsuario;
    private javax.swing.JLabel jTextSaldo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificar(Observable origen, Object evento) {
        //ToDo NOTIFICAR SALDO ACTUALIZADO
    }
}
