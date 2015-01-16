/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfazAsistencia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class AsistenciaExportar extends javax.swing.JDialog {

    /**
     * Creates new form AsistenciaExportar
     */
    conector conexionactual;
    public AsistenciaExportar(java.awt.Frame parent, boolean modal,conector conexionactual) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        initComponents();
        setTitle("Exportar a Excel");
        inicializaFechas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFechaInicio = new javax.swing.JLabel();
        dpFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        lblFechaFinal = new javax.swing.JLabel();
        dpFechaFinal = new org.jdesktop.swingx.JXDatePicker();
        cbElemento = new javax.swing.JComboBox();
        btnSeleccionar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFechaInicio.setText("Fecha inicial:");

        lblFechaFinal.setText("Fecha final:");

        cbElemento.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameElementos()));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnTodos.setText("Todos");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFechaInicio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblFechaFinal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSeleccionar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInicio)
                    .addComponent(dpFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaFinal)
                    .addComponent(dpFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTodos)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String nombreElemento = cbElemento.getSelectedItem().toString();
        String fechaInicio = dateFormat.format(dpFechaInicio.getDate());
        fechaInicio = arreglaFecha(fechaInicio);
        String fechaFin = dateFormat.format(dpFechaFinal.getDate());
        fechaFin = arreglaFecha(fechaFin);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    
    private String arreglaFecha(String fecha){
        String[] temp = fecha.split("/");
        switch(temp[1]){
            case "01":
                temp[1] = "1";
            break;
            case "02":
                temp[1] = "2";
            break;
            case "03":
                temp[1] = "3";
            break;
            case "04":
                temp[1] = "4";
            break;
            case "05":
                temp[1] = "5";
            break;
            case "06":
                temp[1] = "6";
            break;
            case "07":
                temp[1] = "7";
            break;
            case "08":
                temp[1] = "8";
            break;
            case "09":
                temp[1] = "9";
            break;
            case "10":
                temp[1] = "10";
            break;
            case "11":
                temp[1] = "11";
            break;
            case "12":
                temp[1] = "12";
            break;
        }
        return temp[0]+"/"+temp[1]+"/"+temp[2];
    }
    
    private void inicializaFechas(){
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Calendar calendario = Calendar.getInstance();
            String fechaInicio = Integer.toString(calendario.get(Calendar.DATE))+"/"+Integer.toString(calendario.get(Calendar.MONTH)+1)+"/"+Integer.toString(calendario.get(Calendar.YEAR));
            Date inicio = formatter.parse(fechaInicio);
            dpFechaInicio.setDate(inicio);
            dpFechaFinal.setDate(inicio);
        } catch (ParseException ex) {
            Logger.getLogger(AsistenciaExportar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox cbElemento;
    private org.jdesktop.swingx.JXDatePicker dpFechaFinal;
    private org.jdesktop.swingx.JXDatePicker dpFechaInicio;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicio;
    // End of variables declaration//GEN-END:variables
}