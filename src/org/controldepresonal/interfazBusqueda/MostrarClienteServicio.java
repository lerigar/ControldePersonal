/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepresonal.interfazBusqueda;

import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class MostrarClienteServicio extends javax.swing.JDialog {

    /**
     * Creates new form MostrarClienteServicio
     */
    conector conexionactual;
    public MostrarClienteServicio(java.awt.Frame parent, boolean modal,conector conexionactual) {
        super(parent, modal);
        this.conexionactual = conexionactual;
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

        spClientesServicio = new javax.swing.JScrollPane();
        tClientesServicio = new javax.swing.JTable();
        btnClientesServicioSeleccionar = new javax.swing.JButton();
        btnClientesServicioGenerar = new javax.swing.JButton();
        btnClientesServicioSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tClientesServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"5656", "hhyhy"}
            },
            new String [] {
                "Número", "Nombre"
            }
        ));
        spClientesServicio.setViewportView(tClientesServicio);

        btnClientesServicioSeleccionar.setText("Seleccionar");
        btnClientesServicioSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesServicioSeleccionarActionPerformed(evt);
            }
        });

        btnClientesServicioGenerar.setText("Generar información");

        btnClientesServicioSalir.setText("Salir");
        btnClientesServicioSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesServicioSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spClientesServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientesServicioGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientesServicioSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientesServicioSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spClientesServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnClientesServicioSeleccionar)
                .addGap(18, 18, 18)
                .addComponent(btnClientesServicioGenerar)
                .addGap(18, 18, 18)
                .addComponent(btnClientesServicioSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesServicioSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesServicioSeleccionarActionPerformed
        int row = tClientesServicio.getSelectedRow();
        BusquedaElemento busquedaElemento = new BusquedaElemento(new javax.swing.JFrame(), false, conexionactual,Integer.parseInt(tClientesServicio.getValueAt(row, 0).toString()));
        busquedaElemento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesServicioSeleccionarActionPerformed

    private void btnClientesServicioSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesServicioSalirActionPerformed
        SeleccionarBusquedaElemento selecciona = new SeleccionarBusquedaElemento(new javax.swing.JFrame(), false, conexionactual);
        selecciona.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesServicioSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientesServicioGenerar;
    private javax.swing.JButton btnClientesServicioSalir;
    private javax.swing.JButton btnClientesServicioSeleccionar;
    private javax.swing.JScrollPane spClientesServicio;
    private javax.swing.JTable tClientesServicio;
    // End of variables declaration//GEN-END:variables
}
