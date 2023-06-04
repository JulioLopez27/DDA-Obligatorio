/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Bonificacion;
import modelo.Recarga;
import modelo.Transito;
import modelo.UsuarioPropietario;
import modelo.Vehiculo;
import vista.celdas.CeldaBonificacion;
import vista.celdas.CeldaTransito;
import vista.celdas.CeldaVehiculo;
import vista.celdas.CeldaRecargaSaldo;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import modelo.Notificacion;
import vista.celdas.CeldaNotificacion;
import vista.controladores.TableroControlControlador;

/**
 *
 * @author Digital
 */
public class UITableroDeControl extends javax.swing.JDialog implements TableroControlVista {

    private TableroControlControlador controlador;

    /**
     * Creates new form TablerDeControl
     */
    public UITableroDeControl(UsuarioPropietario usuarioPropietario) {
        initComponents();
        this.controlador = new TableroControlControlador(this, usuarioPropietario);
        jListVehiculos.setCellRenderer(new VehiculoDetalleRenderer());
        jListTransitos.setCellRenderer(new TransitoDetalleRenderer());
        jListBonificaciones.setCellRenderer(new BonificacionesDetallesRenderer());
        jListRecargas.setCellRenderer(new RecargasDetalleRenderer());
        jListNotificaciones.setCellRenderer(new NotificacionDetalleRenderer());
        controlador.cargarListas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRecargar = new javax.swing.JButton();
        jButtonBorrarNotificaciones = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jCantVehiculos = new javax.swing.JLabel();
        jCantBonificaciones = new javax.swing.JLabel();
        jCantTransitos = new javax.swing.JLabel();
        jCantRecargas = new javax.swing.JLabel();
        jCantNotificaciones = new javax.swing.JLabel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jListNotificaciones = new javax.swing.JList();
        jLabelFechaNotificacion = new javax.swing.JLabel();
        jLabelMensajeNotificacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablero de control de propietario");
        setFocusTraversalPolicyProvider(true);

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

        jButtonCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.setAutoscrolls(true);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jSeparator1.setAutoscrolls(true);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jCantRecargas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantRecargas.setText("jLabel8");
        jCantRecargas.setAutoscrolls(true);
        jCantRecargas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCantNotificaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantNotificaciones.setText("jLabel10");
        jCantNotificaciones.setAutoscrolls(true);
        jCantNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jLabelFechaTransito.setText("Fecha y hora");
        jLabelFechaTransito.setAutoscrolls(true);
        jLabelFechaTransito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane6.setAutoscrolls(true);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jListTransitos.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(jListTransitos);

        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jListVehiculos.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jListVehiculos);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jListBonificaciones.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
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

        jListRecargas.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
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

        jScrollPane4.setViewportView(jListNotificaciones);

        jLabelFechaNotificacion.setText("Fecha");

        jLabelMensajeNotificacion1.setText("Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(177, 177, 177)
                .addComponent(jLabel16)
                .addGap(198, 198, 198)
                .addComponent(jLabel17)
                .addGap(129, 129, 129)
                .addComponent(jLabel18)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jTextSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextNombreUsuario)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel10)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel12)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel13)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel14)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonRecargar)
                                    .addComponent(jCantNotificaciones, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonBorrarNotificaciones, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCantVehiculos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCantBonificaciones, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCantTransitos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCantRecargas, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4)
                                .addGap(165, 165, 165)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(79, 79, 79))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabelPuestoTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabelMatriculaTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabelTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabelTarifaMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabelBonificacionTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabelMontoBonifTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelMontoPagadoTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabelFechaTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabelFechaNotificacion)
                        .addGap(222, 222, 222)
                        .addComponent(jLabelMensajeNotificacion1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSaldo)
                    .addComponent(jTextNombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)
                        .addComponent(jLabel10)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCantVehiculos)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCantBonificaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
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
                    .addComponent(jCantTransitos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCantRecargas)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNotificacion)
                    .addComponent(jLabelMensajeNotificacion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCantNotificaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBorrarNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecargarActionPerformed
        controlador.abrirRecargarSaldo();
    }//GEN-LAST:event_jButtonRecargarActionPerformed

    private void jButtonBorrarNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarNotificacionesActionPerformed
        controlador.borrarNotificaciones();
    }//GEN-LAST:event_jButtonBorrarNotificacionesActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        controlador.cerrar();
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarNotificaciones;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonRecargar;
    private javax.swing.JLabel jCantBonificaciones;
    private javax.swing.JLabel jCantNotificaciones;
    private javax.swing.JLabel jCantRecargas;
    private javax.swing.JLabel jCantTransitos;
    private javax.swing.JLabel jCantVehiculos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBonificacionTransito;
    private javax.swing.JLabel jLabelFechaNotificacion;
    private javax.swing.JLabel jLabelFechaTransito;
    private javax.swing.JLabel jLabelMatriculaTransito;
    private javax.swing.JLabel jLabelMensajeNotificacion1;
    private javax.swing.JLabel jLabelMontoBonifTransito;
    private javax.swing.JLabel jLabelMontoPagadoTransito;
    private javax.swing.JLabel jLabelPuestoTransito;
    private javax.swing.JLabel jLabelTarifa;
    private javax.swing.JLabel jLabelTarifaMonto;
    private javax.swing.JList jListBonificaciones;
    private javax.swing.JList jListNotificaciones;
    private javax.swing.JList jListRecargas;
    private javax.swing.JList jListTransitos;
    private javax.swing.JList jListVehiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTextNombreUsuario;
    private javax.swing.JLabel jTextSaldo;
    // End of variables declaration//GEN-END:variables


    @Override
    public void inicializarDatos(UsuarioPropietario usuarioPropietario) { //TODO VER SI PODEMOS NO DUPLICAR CÓDIGO
        jTextNombreUsuario.setText(usuarioPropietario.getNombre());
        jTextSaldo.setText(usuarioPropietario.getCuenta().getSaldoFormateado());
        jCantVehiculos.setText(usuarioPropietario.getVehiculos().size() + "");
        jCantBonificaciones.setText(usuarioPropietario.getBonificaciones().size() + "");
        jCantTransitos.setText(usuarioPropietario.getCantidadTransitos() + "");
        jCantRecargas.setText(usuarioPropietario.getCuenta().getRecargas().size() + "");
        jCantNotificaciones.setText(usuarioPropietario.getNotificaciones().size() + "");
    }

    @Override
    public void cargarListaDeVehiculos(List<Vehiculo> vehiculos) {
        jListVehiculos.setListData(vehiculos.toArray());
    }

    @Override
    public void cargarListaDeBonificaciones(List<Bonificacion> bonificaciones) {
        jListBonificaciones.setListData(bonificaciones.toArray());
    }

    @Override
    public void cargarListaDeTransitos(List<Transito> transitos) {
        Collections.sort(transitos, Comparator.comparing(Transito::getFecha).reversed());
        jListTransitos.setListData(transitos.toArray());
    }

    @Override
    public void cargarListaDeRecargas(List<Recarga> recargas) {
        Collections.sort(recargas, Comparator.comparing(Recarga::getFecha).reversed());
        jListRecargas.setListData(recargas.toArray());
    }

    @Override
    public void cargarListaDeNotificaciones(List<Notificacion> notificaciones) {
        Collections.sort(notificaciones, Comparator.comparing(Notificacion::getFecha).reversed());
        jListNotificaciones.setListData(notificaciones.toArray());
    }

    @Override
    public void ejecutarRecargaSaldo(UsuarioPropietario usuarioPropietario) {
        new UIRecargaSaldo(usuarioPropietario).setVisible(true);
    }

    @Override
    public void actualizarSaldo(String saldo) {
        jTextSaldo.setText(saldo);
    }

    @Override
    public void actualizarCantBonificaciones(String cantBonificaciones) {
        jCantBonificaciones.setText(cantBonificaciones);
    }

    @Override
    public void actualizarCantTransitos(String cantTransitos) {
        jCantTransitos.setText(cantTransitos);
    }

    @Override
    public void actualizarCantRecargas(String cantRecargas) {
        jCantRecargas.setText(cantRecargas);
    }

    @Override
    public void actualizarCantNotificaciones(String cantNotificaciones) {
        jCantNotificaciones.setText(cantNotificaciones);
    }

    public class VehiculoDetalleRenderer implements ListCellRenderer<Vehiculo> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Vehiculo> list, Vehiculo vehiculo, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaVehiculo celdaVehiculo = new CeldaVehiculo();
            celdaVehiculo.jMatricula.setText(vehiculo.getMatricula());
            celdaVehiculo.jModelo.setText(vehiculo.getModelo());
            celdaVehiculo.jColor.setText(vehiculo.getColor());
            celdaVehiculo.jTransitos.setText("" + vehiculo.getTransitos().size());
            celdaVehiculo.jMontoTotal.setText(vehiculo.getMontoTotal()+"");
            celdaVehiculo.setBackground((cellHasFocus) ? Color.lightGray : Color.white);
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
            celdaBonificacion.setBackground((cellHasFocus) ? Color.lightGray : Color.white);
            return celdaBonificacion;
        }

    }
    
    public class TransitoDetalleRenderer implements ListCellRenderer<Transito> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Transito> list, Transito transito, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaTransito celdaTransito = new CeldaTransito();
            celdaTransito.jLabelPuesto.setText(transito.getPuesto().getNombre());
            celdaTransito.jLabelMatricula.setText(transito.getVehiculo().getMatricula());
            celdaTransito.jLabelTarifa.setText(transito.getVehiculo().getCategoria().getNombre());
            celdaTransito.jLabelTarifaMonto.setText(transito.getMonto()+"");
            celdaTransito.jLabelBonificacion.setText((transito.getBonificacion() != null) ? transito.getBonificacion().getNombre() : "No tiene.");
            celdaTransito.jLabelMontoBonif.setText(transito.getMonto() - transito.getMontoPagado() +"");
            celdaTransito.jLabelMontoPagado.setText(transito.getMontoPagado()+"");
            celdaTransito.jLabelFecha.setText(transito.getFechaFormateada());
            celdaTransito.setBackground((cellHasFocus) ? Color.lightGray : Color.white);
            return celdaTransito;
        }

    }

    public class RecargasDetalleRenderer implements ListCellRenderer<Recarga> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Recarga> list, Recarga recarga, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaRecargaSaldo celdaRecarga = new CeldaRecargaSaldo();
            celdaRecarga.jFechaRecarga.setText(recarga.getFechaFormateada());
            celdaRecarga.jMonto.setText(""+recarga.getMonto());
            celdaRecarga.jEstado.setText(recarga.getEstado());
            celdaRecarga.jAdministrador.setText((recarga.getAprobador() != null) ? recarga.getAprobador().getNombre() : "-");
            celdaRecarga.setBackground((cellHasFocus) ? Color.lightGray : Color.white);
            return celdaRecarga;
        }

    }
    
    public class NotificacionDetalleRenderer implements ListCellRenderer<Notificacion> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Notificacion> list, Notificacion notificacion, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaNotificacion celdaNotificacion = new CeldaNotificacion();
            celdaNotificacion.jFecha.setText(notificacion.getFechaFormateada());
            celdaNotificacion.jMensaje.setText(notificacion.getMensaje());
            celdaNotificacion.setBackground((cellHasFocus) ? Color.lightGray : Color.white);
            return celdaNotificacion;
        }

    }
}
