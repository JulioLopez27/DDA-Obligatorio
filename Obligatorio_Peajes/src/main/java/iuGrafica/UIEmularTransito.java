/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuGrafica;

import Exceptions.PeajesException;
import Interfaces.ComboBasicoRenderer;
import Servicios.Fachada;
import dominio.Bonificacion;
import dominio.Puesto;
import dominio.Tarifa;
import dominio.Transito;
import dominio.UsuarioPropietario;
import dominio.Vehiculo;
import iuGrafica.celdas.CeldaEmularTransito;
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
public class UIEmularTransito extends javax.swing.JDialog {

    /**
     * Creates new form EmularTransito
     */
    public UIEmularTransito(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jListTarifas.setCellRenderer(new DetalleTarifasRenderer());
        jComboPuestos.setRenderer(new ComboBasicoRenderer());
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

        jComboPuestos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        jButtonRegistrarTransito = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTarifas = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDatosTransito = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emular transito");

        jComboPuestos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPuestosItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Puestos:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tarifas:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese matricula:");

        jButtonRegistrarTransito.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarTransito.setText("Registrar");
        jButtonRegistrarTransito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarTransitoActionPerformed(evt);
            }
        });

        jButtonCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListTarifas);

        jLabel4.setText("Categoría");

        jLabel5.setText("Monto");

        jTextPaneDatosTransito.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        jScrollPane1.setViewportView(jTextPaneDatosTransito);

        jLabel6.setText("Datos del tránsito:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCerrar)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboPuestos, 0, 375, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(134, 134, 134))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRegistrarTransito))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistrarTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarTransitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarTransitoActionPerformed
        registrarTransito();
    }//GEN-LAST:event_jButtonRegistrarTransitoActionPerformed

    private void jComboPuestosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPuestosItemStateChanged
        cargarTarifasDePuesto();
    }//GEN-LAST:event_jComboPuestosItemStateChanged

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonRegistrarTransito;
    private javax.swing.JComboBox jComboPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jListTarifas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextPane jTextPaneDatosTransito;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        cargarComboPuestos();
    }

    private void cargarComboPuestos() {
        List<Puesto> puestos = Fachada.getInstancia().getPuestos();
        for (Puesto p : puestos) {
            jComboPuestos.addItem(p);
        }
    }

    private void cargarTarifasDePuesto() {
        Puesto puestoSeleccionado = (Puesto) jComboPuestos.getSelectedItem();
        jListTarifas.setListData(puestoSeleccionado.getTarifas().toArray());
    }

    private void registrarTransito() {
        Puesto puestoSeleccionado = (Puesto) jComboPuestos.getSelectedItem();
        try{
            Vehiculo vehiculoEncontrado = Fachada.getInstancia().buscarVehiculo(jTextMatricula.getText());
            Transito transitoAAgregar = new Transito(vehiculoEncontrado, puestoSeleccionado);
            Transito transitoAgregado = Fachada.getInstancia().agregar(transitoAAgregar); //TODO REVISAR SI PODEMOS MOSTRAR LA VARIABLE transitoAAgregar
            mostrarDatosDeTransito(transitoAgregado);
        }catch (PeajesException pe){
            JOptionPane.showMessageDialog(this, pe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //ToDo Mandar notificacion
    }

    private void mostrarDatosDeTransito(Transito transitoAgregado) {
        String nombreBonificacion = (transitoAgregado.getBonificacion() != null) ? transitoAgregado.getBonificacion().getNombre() : "No tiene"; 
        String datosTransito = "Nombre de Propietario: " + transitoAgregado.getUsuarioPropietario().getNombre() + "\r\n" +
                "Categoría de vehículo: " + transitoAgregado.getVehiculo().getCategoria().getNombre() + "\r\n" +
                "Bonificación: " + nombreBonificacion + "\r\n" +
                "Costo del tránsito: " + transitoAgregado.getMontoPagado() + "\r\n" +
                "Saldo disponible: " + transitoAgregado.getUsuarioPropietario().getCuenta().getSaldo();
        jTextPaneDatosTransito.setText(datosTransito);
    }

    public class DetalleTarifasRenderer implements ListCellRenderer<Tarifa> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Tarifa> list, Tarifa tarifa, int index, boolean isSelected, boolean cellHasFocus) {
            CeldaEmularTransito celdaEmularTransito = new CeldaEmularTransito();
            celdaEmularTransito.jCategoria.setText(tarifa.getCategoria().getNombre());
            celdaEmularTransito.jMonto.setText("" + tarifa.getMonto());
            return celdaEmularTransito;
        }

    }
    
}
