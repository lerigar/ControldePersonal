/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfazAsistencia;

import javax.swing.JComboBox;
import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class AsistenciaSeleccionaElemento extends javax.swing.JDialog {

    /**
     * Creates new form AsistenciaSeleccionaElemento
     */
    conector conexionactual;
    public AsistenciaSeleccionaElemento(java.awt.Frame parent, boolean modal,conector conexionactual) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        initComponents();
        setTitle("Selecciona Elemento");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAsistenciaCliente = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox();
        lblAsistenciaServicio = new javax.swing.JLabel();
        cbServicios = new javax.swing.JComboBox();
        lblAsistenciaElemento = new javax.swing.JLabel();
        cbElemento = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAsistenciaCliente.setText("Cliente:");

        cbClientes.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameClientes()));
        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        lblAsistenciaServicio.setText("Servicio:");

        cbServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServiciosActionPerformed(evt);
            }
        });

        lblAsistenciaElemento.setText("Elemento:");

        cbElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElementoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAsistenciaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAsistenciaServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAsistenciaElemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbElemento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsistenciaCliente)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsistenciaServicio)
                    .addComponent(cbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsistenciaElemento)
                    .addComponent(cbElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElementoActionPerformed
        btnBuscar.setEnabled(true);        
    }//GEN-LAST:event_cbElementoActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbServicios.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameServicios(cbREF.getSelectedItem().toString())));        
    }//GEN-LAST:event_cbClientesActionPerformed

    private void cbServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServiciosActionPerformed
        JComboBox cbREF2 = (JComboBox) evt.getSource();
        cbElemento.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameElemento(cbREF2.getSelectedItem().toString())));
    }//GEN-LAST:event_cbServiciosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombreServicio = cbServicios.getSelectedItem().toString();
        String apellidoElemento = cbElemento.getSelectedItem().toString();
        System.out.println(nombreServicio+" "+apellidoElemento);
        AsistenciaElemento asistencia = new AsistenciaElemento(new javax.swing.JFrame(), false, conexionactual,nombreServicio, apellidoElemento);
        asistencia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox cbClientes;
    private javax.swing.JComboBox cbElemento;
    private javax.swing.JComboBox cbServicios;
    private javax.swing.JLabel lblAsistenciaCliente;
    private javax.swing.JLabel lblAsistenciaElemento;
    private javax.swing.JLabel lblAsistenciaServicio;
    // End of variables declaration//GEN-END:variables
}