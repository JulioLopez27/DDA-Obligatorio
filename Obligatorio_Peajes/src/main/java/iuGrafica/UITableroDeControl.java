/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuGrafica;

import Observer.Observable;
import Observer.Observer;
import dominio.Recarga;
import dominio.UsuarioPropietario;
import dominio.Vehiculo;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
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

        // ToDo Preguntar por que esto no funciona
        //jListaVehiculos.setCellRenderer(new VehiculoDetalleRenderer());
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaVehiculos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaBonificaciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaTransitos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablaRecargas = new javax.swing.JTable();
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
        jScrollPane6 = new javax.swing.JScrollPane();
        jListaVehiculos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablero de control de propietario");

        jTablaVehiculos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Modelo", "Color", "#Transitos", "Monto total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaVehiculos);

        jTablaBonificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre bonificación", "Puesto", "Fecha assignada"
            }
        ));
        jScrollPane2.setViewportView(jTablaBonificaciones);

        jTablaTransitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Puesto", "Matricula", "Tarifa", "Tarifa (monto)", "Bonific. ", "Bonific. (monto)", "Monto pagado", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(jTablaTransitos);

        jTablaRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha recarga", "Monto", "Estado", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTablaRecargas);

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
        jButtonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecargarActionPerformed(evt);
            }
        });

        jButtonBorrarNotificaciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBorrarNotificaciones.setText("Borrar");
        jButtonBorrarNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarNotificacionesActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Cerrar");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jCantVehiculos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantVehiculos.setText("jLabel4");

        jCantBonificaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantBonificaciones.setText("jLabel5");

        jCantTransitos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantTransitos.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jCantRecargas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantRecargas.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jCantNotificaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCantNotificaciones.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jTextSaldo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextSaldo.setForeground(new java.awt.Color(0, 153, 0));
        jTextSaldo.setText("jLabel12");

        jTextNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNombreUsuario.setText("jLabel14");

        jListaVehiculos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jListaVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jCantRecargas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCantVehiculos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jCantBonificaciones))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jCantTransitos))
                            .addComponent(jButtonRecargar)
                            .addComponent(jButtonBorrarNotificaciones)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCantNotificaciones)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(jTextSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextNombreUsuario)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(308, 308, 308)))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextSaldo)
                    .addComponent(jTextNombreUsuario))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCantVehiculos)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCantBonificaciones)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCantTransitos)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCantRecargas)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRecargar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCantNotificaciones)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrarNotificaciones))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListaVehiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaBonificaciones;
    private javax.swing.JTable jTablaNotificaciones;
    private javax.swing.JTable jTablaRecargas;
    private javax.swing.JTable jTablaTransitos;
    private javax.swing.JTable jTablaVehiculos;
    private javax.swing.JLabel jTextNombreUsuario;
    private javax.swing.JLabel jTextSaldo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificar(Observable origen, Object evento) {
        //ToDo ACTUALIZAR LA PANTALLA
        
    }

    private void inicializar() {
        jTextNombreUsuario.setText(usuarioPropietario.getNombre());
        jTextSaldo.setText(usuarioPropietario.getCuenta().getSaldoFormateado());
        jCantVehiculos.setText(usuarioPropietario.getVehiculos().size()+"");
        jCantBonificaciones.setText(usuarioPropietario.getBonificaciones().size()+"");
        jCantTransitos.setText(usuarioPropietario.getCantidadTransitos()+"");
        jCantRecargas.setText(usuarioPropietario.getCuenta().getRecargas().size()+"");
        jCantNotificaciones.setText(usuarioPropietario.getNotificaciones().size()+"");
        cargarListaDeVehiculos();
        cargarListaDeBonificaciones();
        cargarListaDeTransitos();
        cargarListaDeRecargas();
        cargarListaDeNotificaciones();
    }

    private void cargarListaDeVehiculos() {
        DefaultTableModel model = (DefaultTableModel)jTablaVehiculos.getModel();
        for(Vehiculo v : usuarioPropietario.getVehiculos()){
            Object[] dataRow = new Object[]{
                v.getMatricula(),
                v.getModelo(),
                v.getColor(),
                v.getCantidadTransitos(),
                v.getMontoTotal()
            };
            model.addRow(dataRow);
        }
        
    }

    private void cargarListaDeBonificaciones() {
        //
    }

    private void cargarListaDeTransitos() {
        //
    }

    private void cargarListaDeRecargas() {
        DefaultTableModel model = (DefaultTableModel)jTablaRecargas.getModel();
        for(Recarga r : usuarioPropietario.getCuenta().getRecargas()){
            Object[] dataRow = new Object[]{
                r.getFecha(),
                r.getMonto(),
                r.getEstado(),
                (r.getAprobador() != null) ? r.getAprobador() : "No asignado"
            };
            model.addRow(dataRow);
        }
    }

    private void cargarListaDeNotificaciones() {
        
    }
    
    public class VehiculoDetalleRenderer implements ListCellRenderer<Vehiculo> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Vehiculo> list, Vehiculo vehiculo, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = new JLabel();
            label.setText(vehiculo.getMatricula());
            return label;
        }
        
    }
}
