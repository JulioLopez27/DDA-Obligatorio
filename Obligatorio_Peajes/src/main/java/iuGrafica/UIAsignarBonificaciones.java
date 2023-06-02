/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuGrafica;

import Exceptions.PeajesException;
import Interfaces.ComboBasicoRenderer;
import Observer.Observable;
import Observer.Observer;
import Servicios.Fachada;
import dominio.Bonificable;
import dominio.Bonificacion;
import dominio.Puesto;
import dominio.UsuarioPropietario;
import iuGrafica.celdas.CeldaAsignarBonificacion;
import java.awt.Component;
import java.awt.Frame;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Digital
 */
public class UIAsignarBonificaciones extends javax.swing.JDialog implements Observer {

    private UsuarioPropietario usuarioEncontrado;

    /**
     * Creates new form AsignarBonificaciones
     */
    public UIAsignarBonificaciones(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jComboBonificaciones.setRenderer(new ComboBasicoRenderer());
        jComboPuestos.setRenderer(new ComboBasicoRenderer());
        jListBonificaciones.setCellRenderer(new DetalleBonificacionRenderer());
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
        jTable1 = new javax.swing.JTable();
        jComboBonificaciones = new javax.swing.JComboBox();
        jComboPuestos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabelNombrePropietario = new javax.swing.JLabel();
        jButtonAsignar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListBonificaciones = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar bonificaciones");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Bonificaciones:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Puestos:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Cedula:");

        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Propietario:");

        jLabelNombrePropietario.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N

        jButtonAsignar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAsignar.setText("Asignar");
        jButtonAsignar.setAutoscrolls(true);
        jButtonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarActionPerformed(evt);
            }
        });

        jButtonCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jListBonificaciones);

        jLabel6.setText("Bonificacion");

        jLabel7.setText("Puesto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextCedula)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar))
                            .addComponent(jComboPuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBonificaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(145, 145, 145)
                                .addComponent(jLabel7)
                                .addGap(71, 71, 71))
                            .addComponent(jButtonCerrar)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAsignar)
                        .addGap(289, 289, 289))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelNombrePropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAsignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCerrar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        buscarPropietario();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarActionPerformed
        asignarBonificacion();
    }//GEN-LAST:event_jButtonAsignarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsignar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JComboBox jComboBonificaciones;
    private javax.swing.JComboBox jComboPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNombrePropietario;
    private javax.swing.JList jListBonificaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCedula;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificar(Observable origen, Object evento) {
        //ToDo ACTUALIZAR BONIFICACION PUESTO
    }

    private void inicializar() {
        cargarBonificaciones();
        cargarPuestos();
    }

    private void cargarBonificaciones() {
        List<Bonificable> tiposBonificacion = Fachada.getInstancia().getTiposBonificacion();
        for (Bonificable b : tiposBonificacion) {
            jComboBonificaciones.addItem(b);
        }
    }

    public void cargarPuestos() {
        List<Puesto> puestos = Fachada.getInstancia().getPuestos();
        for (Puesto p : puestos) {
            jComboPuestos.addItem(p);
        }
    }

    private void buscarPropietario() {
        String cedula = jTextCedula.getText();
        try {
            UsuarioPropietario usuarioPropietario = Fachada.getInstancia().buscarPropietario(cedula);

            this.usuarioEncontrado = usuarioPropietario;
            List<Bonificacion> bonificacionesUsuario = usuarioPropietario.getBonificaciones();
            jLabelNombrePropietario.setText(usuarioPropietario.getNombre());
            cargarListaBonificaciones(bonificacionesUsuario);
        } catch (PeajesException pe) {
            JOptionPane.showMessageDialog(this, pe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarListaBonificaciones(List<Bonificacion> bonificacionesUsuario) {
        jListBonificaciones.setListData(bonificacionesUsuario.toArray());
    }

    //todo refactorizar
    private void asignarBonificacion() {
        Bonificable tipoBonificacionSeleccionada = (Bonificable) jComboBonificaciones.getSelectedItem();
        Puesto puestoSeleccionado = (Puesto) jComboPuestos.getSelectedItem();
        Bonificacion bonificacionAAsignar = new Bonificacion(tipoBonificacionSeleccionada, puestoSeleccionado);
        try {
            Fachada.getInstancia().asignarBonificacion(this.usuarioEncontrado, bonificacionAAsignar);
            buscarPropietario();
        } catch (PeajesException pe) {
            JOptionPane.showMessageDialog(this, pe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public class DetalleBonificacionRenderer implements ListCellRenderer<Bonificacion> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Bonificacion> list, Bonificacion bonificacion, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaAsignarBonificacion celdaBonificacion = new CeldaAsignarBonificacion();
            celdaBonificacion.jBonificacion.setText(bonificacion.getNombre());
            celdaBonificacion.jPuesto.setText(bonificacion.getPuesto().getNombre());
            return celdaBonificacion;
        }

    }
}
