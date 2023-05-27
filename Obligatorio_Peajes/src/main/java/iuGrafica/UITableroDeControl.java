/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuGrafica;

import Observer.Observable;
import Observer.Observer;
import Servicios.Fachada;
import dominio.Bonificacion;
import dominio.Recarga;
import dominio.Transito;
import dominio.UsuarioPropietario;
import dominio.Vehiculo;
import iuGrafica.celdas.CeldaBonificacion;
import iuGrafica.celdas.CeldaTransito;
import iuGrafica.celdas.CeldaVehiculo;
import iuGrafica.celdas.CeldaRecargasss;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Digital
 */
public class UITableroDeControl extends javax.swing.JDialog implements Observer {

    private UsuarioPropietario usuarioPropietario;

    /**
     * Creates new form TablerDeControl
     */
    public UITableroDeControl(UsuarioPropietario usuario) {
        initComponents();
        this.usuarioPropietario = usuario;

        jListVehiculos.setCellRenderer(new VehiculoDetalleRenderer());
        jListTransitos.setCellRenderer(new TransitoDetalleRenderer());
        jListBonificaciones.setCellRenderer(new BonificacionesDetallesRenderer());
        jListRecargas.setCellRenderer(new RecargasDetalleRenderer());
        //ToDo hay que suscribir a la fachada y desuscribir cuando cierra la pantalla

        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTablaNotificaciones = new javax.swing.JTable();
        jButtonRecargar = new javax.swing.JButton();
        jButtonBorrarNotificaciones = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCantVehiculos = new javax.swing.JLabel();
        jCantBonificaciones = new javax.swing.JLabel();
        jCantTransitos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCantRecargas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCantNotificaciones = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextSaldo = new javax.swing.JLabel();
        jTextNombreUsuario = new javax.swing.JLabel();
        jLabelPuestoTransito = new javax.swing.JLabel();
        jLabelMatriculaTransito = new javax.swing.JLabel();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelTarifaMonto = new javax.swing.JLabel();
        jLabelBonificacionTransito = new javax.swing.JLabel();
        jLabelMontoBonifTransito = new javax.swing.JLabel();
        jLabelMontoPagadoTransito = new javax.swing.JLabel();
        jLabelFechaTransito = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListTransitos = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListVehiculos = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBonificaciones = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListRecargas = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablero de control de propietario");
        setFocusTraversalPolicyProvider(true);

        jScrollPane5.setAutoscrolls(true);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTablaNotificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Mensaje"
            }
        ));
        jScrollPane5.setViewportView(jTablaNotificaciones);

        jButtonRecargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRecargar.setText("Rercargar");
        jButtonRecargar.setAutoscrolls(true);
        jButtonRecargar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecargarActionPerformed(evt);
            }
        });

        jButtonBorrarNotificaciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBorrarNotificaciones.setText("Borrar");
        jButtonBorrarNotificaciones.setAutoscrolls(true);
        jButtonBorrarNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBorrarNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarNotificacionesActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Cerrar");
        jButton3.setAutoscrolls(true);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setAutoscrolls(true);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("jLabel1");
        jLabel1.setAutoscrolls(true);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("jLabel2");
        jLabel2.setAutoscrolls(true);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("jLabel3");
        jLabel3.setAutoscrolls(true);
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCantVehiculos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantVehiculos.setText("jLabel4");
        jCantVehiculos.setAutoscrolls(true);
        jCantVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCantBonificaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantBonificaciones.setText("jLabel5");
        jCantBonificaciones.setAutoscrolls(true);
        jCantBonificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCantTransitos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantTransitos.setText("jLabel6");
        jCantTransitos.setAutoscrolls(true);
        jCantTransitos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setText("jLabel7");
        jLabel7.setAutoscrolls(true);
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCantRecargas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantRecargas.setText("jLabel8");
        jCantRecargas.setAutoscrolls(true);
        jCantRecargas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setText("jLabel9");
        jLabel9.setAutoscrolls(true);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCantNotificaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantNotificaciones.setText("jLabel10");
        jCantNotificaciones.setAutoscrolls(true);
        jCantNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setText("jLabel11");
        jLabel11.setAutoscrolls(true);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextSaldo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextSaldo.setForeground(new java.awt.Color(0, 153, 0));
        jTextSaldo.setText("jLabel12");
        jTextSaldo.setAutoscrolls(true);
        jTextSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNombreUsuario.setText("jLabel14");
        jTextNombreUsuario.setAutoscrolls(true);
        jTextNombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelPuestoTransito.setText("Puesto");
        jLabelPuestoTransito.setAutoscrolls(true);
        jLabelPuestoTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelMatriculaTransito.setText("Matricula");
        jLabelMatriculaTransito.setAutoscrolls(true);
        jLabelMatriculaTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTarifa.setText("Tarifa");
        jLabelTarifa.setAutoscrolls(true);
        jLabelTarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTarifaMonto.setText("Tarifa (Monto)");
        jLabelTarifaMonto.setAutoscrolls(true);
        jLabelTarifaMonto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelBonificacionTransito.setText("Bonif.");
        jLabelBonificacionTransito.setAutoscrolls(true);
        jLabelBonificacionTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelMontoBonifTransito.setText("Monto Bonif.");
        jLabelMontoBonifTransito.setAutoscrolls(true);
        jLabelMontoBonifTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelMontoPagadoTransito.setText("Monto Pagado");
        jLabelMontoPagadoTransito.setAutoscrolls(true);
        jLabelMontoPagadoTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelFechaTransito.setText("Fecha");
        jLabelFechaTransito.setAutoscrolls(true);
        jLabelFechaTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane6.setAutoscrolls(true);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane6.setViewportView(jListTransitos);

        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane3.setViewportView(jListVehiculos);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setViewportView(jListBonificaciones);

        jLabel4.setText("Nombre Bonificacion");
        jLabel4.setAutoscrolls(true);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setText("Puesto");
        jLabel5.setAutoscrolls(true);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setText("Fecha Asignada");
        jLabel6.setAutoscrolls(true);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane2.setViewportView(jListRecargas);

        jLabel8.setText("Matricula");

        jLabel10.setText("Modelo");

        jLabel12.setText("Color");

        jLabel13.setText("#Transitos");

        jLabel14.setText("Monto total");

        jLabel15.setText("Fecha recarga");

        jLabel16.setText("Monto");

        jLabel17.setText("Estado");

        jLabel18.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel15)
                .addGap(71, 71, 71)
                .addComponent(jLabel16)
                .addGap(75, 75, 75)
                .addComponent(jLabel17)
                .addGap(73, 73, 73)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBorrarNotificaciones)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(82, 82, 82))
                            .addComponent(jCantNotificaciones))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(jTextSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextNombreUsuario)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jCantRecargas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jCantTransitos))
                            .addComponent(jButtonRecargar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCantVehiculos)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCantBonificaciones)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addGap(208, 208, 208)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 1097, Short.MAX_VALUE)
                                        .addComponent(jLabelPuestoTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabelMatriculaTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabelTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabelTarifaMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabelBonificacionTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelMontoBonifTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabelMontoPagadoTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelFechaTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel8)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel10)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel12)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel13)
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel14)
                                        .addGap(0, 1374, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))))))
                .addGap(32, 32, 32))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextSaldo)
                    .addComponent(jTextNombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10))
                            .addComponent(jLabel12))
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCantVehiculos)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCantBonificaciones)
                        .addComponent(jLabel2)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuestoTransito)
                    .addComponent(jLabelMatriculaTransito)
                    .addComponent(jLabelTarifa)
                    .addComponent(jLabelTarifaMonto)
                    .addComponent(jLabelBonificacionTransito)
                    .addComponent(jLabelMontoBonifTransito)
                    .addComponent(jLabelMontoPagadoTransito)
                    .addComponent(jLabelFechaTransito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCantRecargas)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRecargar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCantTransitos)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(jCantNotificaciones)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrarNotificaciones))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecargarActionPerformed
        new UIRecargaSaldo(usuarioPropietario).setVisible(true);
    }//GEN-LAST:event_jButtonRecargarActionPerformed

    private void jButtonBorrarNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarNotificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBorrarNotificacionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBorrarNotificaciones;
    private javax.swing.JButton jButtonRecargar;
    private javax.swing.JLabel jCantBonificaciones;
    private javax.swing.JLabel jCantNotificaciones;
    private javax.swing.JLabel jCantRecargas;
    private javax.swing.JLabel jCantTransitos;
    private javax.swing.JLabel jCantVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBonificacionTransito;
    private javax.swing.JLabel jLabelFechaTransito;
    private javax.swing.JLabel jLabelMatriculaTransito;
    private javax.swing.JLabel jLabelMontoBonifTransito;
    private javax.swing.JLabel jLabelMontoPagadoTransito;
    private javax.swing.JLabel jLabelPuestoTransito;
    private javax.swing.JLabel jLabelTarifa;
    private javax.swing.JLabel jLabelTarifaMonto;
    private javax.swing.JList jListBonificaciones;
    private javax.swing.JList jListRecargas;
    private javax.swing.JList jListTransitos;
    private javax.swing.JList jListVehiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaNotificaciones;
    private javax.swing.JLabel jTextNombreUsuario;
    private javax.swing.JLabel jTextSaldo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificar(Observable origen, Object evento) {
        //ToDo MANDAR EVENTO ACTUALIZAR PANTALLA

    }

    private void inicializar() {
        jTextNombreUsuario.setText(usuarioPropietario.getNombre());
        jTextSaldo.setText(usuarioPropietario.getCuenta().getSaldoFormateado());
        jCantVehiculos.setText(usuarioPropietario.getVehiculos().size() + "");
        jCantBonificaciones.setText(usuarioPropietario.getBonificaciones().size() + "");
        jCantTransitos.setText(usuarioPropietario.getCantidadTransitos() + "");
        jCantRecargas.setText(usuarioPropietario.getCuenta().getRecargas().size() + "");
        jCantNotificaciones.setText(usuarioPropietario.getNotificaciones().size() + "");
        cargarListaDeVehiculos();
        cargarListaDeBonificaciones();
        cargarListaDeTransitos();
        cargarListaDeRecargas();
        cargarListaDeNotificaciones();
    }

    private void cargarListaDeVehiculos() {
        List<Vehiculo> vehiculos = Fachada.getInstancia().getVehiculos();
        jListVehiculos.setListData(vehiculos.toArray());
    }

    private void cargarListaDeBonificaciones() {
        List<Bonificacion> bonificaciones = usuarioPropietario.getBonificaciones();
        jListBonificaciones.setListData(bonificaciones.toArray());
    }

    private void cargarListaDeTransitos() {
        List<Transito> transitos = Fachada.getInstancia().getTransitos(usuarioPropietario);
        jListTransitos.setListData(transitos.toArray());
    }

    private void cargarListaDeRecargas() {
        List<Recarga> recargas = Fachada.getInstancia().getRecargas();
        jListRecargas.setListData(recargas.toArray());
    }

    private void cargarListaDeNotificaciones() {

    }

    public class TransitoDetalleRenderer implements ListCellRenderer<Transito> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Transito> list, Transito transito, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaTransito celdaTransito = new CeldaTransito();
            celdaTransito.jLabelPuesto.setText(transito.getPuesto().getNombre());
            celdaTransito.jLabelMatricula.setText(transito.getVehiculo().getMatricula());
            celdaTransito.jLabelTarifa.setText("TEST TARIFA");
            celdaTransito.jLabelTarifaMonto.setText("TEST 108");
            celdaTransito.jLabelBonificacion.setText("TEST Exonerado");
            celdaTransito.jLabelMontoBonif.setText("TEST 50");
            celdaTransito.jLabelMontoPagado.setText("TEST 50");
            celdaTransito.jLabelFecha.setText(transito.getFecha().toString());

            return celdaTransito;
        }

    }

    public class VehiculoDetalleRenderer implements ListCellRenderer<Vehiculo> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Vehiculo> list, Vehiculo vehiculo, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaVehiculo celdaVehiculo = new CeldaVehiculo();
            celdaVehiculo.jMatricula.setText(vehiculo.getMatricula());
            celdaVehiculo.jModelo.setText(vehiculo.getModelo());
            celdaVehiculo.jColor.setText(vehiculo.getColor());
            celdaVehiculo.jTransitos.setText("" + vehiculo.getTransitos().size());
            celdaVehiculo.jMontoTotal.setText("a");

            return celdaVehiculo;
        }

    }

    public class BonificacionesDetallesRenderer implements ListCellRenderer<Bonificacion> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Bonificacion> list, Bonificacion bonificacion, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaBonificacion celdaBonificacion = new CeldaBonificacion();
            celdaBonificacion.jNombreBonificacion.setText(bonificacion.getNombre());
            celdaBonificacion.jPuesto.setText("Puesto Solis");
            celdaBonificacion.jFechaAsignada.setText(LocalDate.now().toString());
            return celdaBonificacion;
        }

    }
    
    public class RecargasDetalleRenderer implements ListCellRenderer<Recarga> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Recarga> list, Recarga recarga, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaRecargasss celdaRecarga = new CeldaRecargasss();
            celdaRecarga.jFechaRecarga.setText(recarga.getFecha().toString());
            celdaRecarga.jMonto.setText(""+recarga.getMonto());
            celdaRecarga.jEstado.setText(recarga.getEstado());
            celdaRecarga.jAdministrador.setText((recarga.getAprobador() != null) ? recarga.getAprobador().getNombre() : "-");
            celdaRecarga.setBackground((cellHasFocus) ? Color.blue : Color.white);
            return celdaRecarga;
        }

    }
}
