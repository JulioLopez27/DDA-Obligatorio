/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.celdas;

/**
 *
 * @author Bazzi Gonzalo / Cesar Julio / Paulos Sebastian
 */
public class CeldaVehiculo extends javax.swing.JPanel {

    /**
     * Creates new form CeldaVehiculo
     */
    public CeldaVehiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColor = new javax.swing.JLabel();
        jMatricula = new javax.swing.JLabel();
        jModelo = new javax.swing.JLabel();
        jMontoTotal = new javax.swing.JLabel();
        jTransitos = new javax.swing.JLabel();

        jColor.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jColor.setText("jLabel1");

        jMatricula.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jMatricula.setText("jLabel1");

        jModelo.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jModelo.setText("jLabel1");

        jMontoTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jMontoTotal.setText("jLabel1");

        jTransitos.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jTransitos.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jTransitos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jColor)
                .addComponent(jMatricula)
                .addComponent(jModelo)
                .addComponent(jMontoTotal)
                .addComponent(jTransitos))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jColor;
    public javax.swing.JLabel jMatricula;
    public javax.swing.JLabel jModelo;
    public javax.swing.JLabel jMontoTotal;
    public javax.swing.JLabel jTransitos;
    // End of variables declaration//GEN-END:variables
}
