/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfazAsistencia;

import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class AsistenciaServicio extends javax.swing.JDialog {

    /**
     * Creates new form AsistenciaServicio
     */
    conector conexionactual;
    private final DefaultTableModel modeloAsistencia;
    private final String Asistencia = "A";
    private final String Justificada = "J";
    private final String Falta = "F";
    private final String nombreServicio;
    public AsistenciaServicio(java.awt.Frame parent, boolean modal,conector conexionactual,String nombreCliente,String nombreServicio) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        this.nombreServicio = nombreServicio;
        initComponents();
        setTitle("Asistencia por Servicio");
        modeloAsistencia = (DefaultTableModel)tAsistenciaServicio.getModel();
        llenaTabla();
        obtenFecha(nombreCliente,nombreServicio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        spAsistenciaServicio = new javax.swing.JScrollPane();
        tAsistenciaServicio = new javax.swing.JTable();
        txtFecha = new javax.swing.JTextField();
        btnAsistencia = new javax.swing.JButton();
        btnFalta = new javax.swing.JButton();
        btnJustificada = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblServicio = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tAsistenciaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Elemento"
            }
        ));
        spAsistenciaServicio.setViewportView(tAsistenciaServicio);

        txtFecha.setEnabled(false);

        btnAsistencia.setText("Asistencia");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });

        btnFalta.setText("Falta");
        btnFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaltaActionPerformed(evt);
            }
        });

        btnJustificada.setText("Justificar");
        btnJustificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJustificadaActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar a Excel");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        lblCliente.setText("Cliente:");

        txtCliente.setEnabled(false);

        lblServicio.setText("Servicio:");

        txtServicio.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spAsistenciaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnJustificada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServicio)
                    .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnAsistencia)
                        .addGap(33, 33, 33)
                        .addComponent(btnJustificada)
                        .addGap(48, 48, 48)
                        .addComponent(btnFalta)
                        .addGap(42, 42, 42)
                        .addComponent(btnExportar)
                        .addGap(38, 38, 38)
                        .addComponent(btnSalir))
                    .addComponent(spAsistenciaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        int row = tAsistenciaServicio.getSelectedRow();
        if(row >= 0){
            String nombreEmpleado = modeloAsistencia.getValueAt(row, 0).toString();
            int id_empleado = conexionactual.buscaIDElemento(nombreEmpleado);
            String fecha = txtFecha.getText();
            if(conexionactual.registraAsistencia(id_empleado,fecha,Asistencia)){
                JOptionPane.showMessageDialog(rootPane, "Asistencia registrada");                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "La asistencia ya ha sido tomada");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona al Elemento");
        }
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void btnFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaltaActionPerformed
        int row = tAsistenciaServicio.getSelectedRow();
        if(row >= 0){
            String nombreEmpleado = modeloAsistencia.getValueAt(row, 0).toString();
            int id_empleado = conexionactual.buscaIDElemento(nombreEmpleado);
            String fecha = txtFecha.getText();
            if(conexionactual.registraAsistencia(id_empleado, fecha, Falta)){
                JOptionPane.showMessageDialog(rootPane, "Asistencia registrada");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "La asistencia ya ha sido tomada");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona al Elemento");
        }
    }//GEN-LAST:event_btnFaltaActionPerformed

    private void btnJustificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJustificadaActionPerformed
        int row = tAsistenciaServicio.getSelectedRow();
        if(row >= 0){
            String nombreEmpleado = modeloAsistencia.getValueAt(row, 0).toString();
            int id_empleado = conexionactual.buscaIDElemento(nombreEmpleado);
            AsistenciaJustificada justificada = new AsistenciaJustificada(new javax.swing.JFrame(), false, conexionactual,id_empleado,Justificada);
            justificada.setVisible(true);            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona al Elemento");
        }
        
    }//GEN-LAST:event_btnJustificadaActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        AsistenciaExportar exportar = new AsistenciaExportar(new javax.swing.JFrame(), false, conexionactual);
        exportar.setVisible(true);
    }//GEN-LAST:event_btnExportarActionPerformed

    private void obtenFecha(String nombreCliente,String nombreServicio){
        txtCliente.setText(nombreCliente.toUpperCase());
        txtServicio.setText(nombreServicio.toUpperCase());
        Calendar calendario = Calendar.getInstance();
        txtFecha.setText(Integer.toString(calendario.get(Calendar.DATE))+"/"+Integer.toString(calendario.get(Calendar.MONTH)+1)+"/"+Integer.toString(calendario.get(Calendar.YEAR)));
    }
    
    private void llenaTabla(){
        String[] elementos;
        elementos = conexionactual.dameElementos(nombreServicio);
        for (String elemento : elementos) {
            modeloAsistencia.addRow(new Object[]{elemento});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnFalta;
    private javax.swing.JButton btnJustificada;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JScrollPane spAsistenciaServicio;
    private javax.swing.JTable tAsistenciaServicio;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtServicio;
    // End of variables declaration//GEN-END:variables
}
