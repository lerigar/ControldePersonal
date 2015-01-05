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
public class IncidenciaNueva extends javax.swing.JDialog {

    /**
     * Creates new form IncidenciaNueva
     */
    conector conexionactual;
    public IncidenciaNueva(java.awt.Frame parent, boolean modal,conector conexionactual) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        initComponents();
        setTitle("Nueva incidencia");
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
        lblIncidenciaNuevaFecha = new javax.swing.JLabel();
        dpIncidenciaNueva = new org.jdesktop.swingx.JXDatePicker();
        lblIncidenciaNuevaHora = new javax.swing.JLabel();
        txtIncidenciaNuevaHora = new javax.swing.JTextField();
        lblIncidenciaNuevaTipo = new javax.swing.JLabel();
        rbIncidenciaNuevaTipoD = new javax.swing.JRadioButton();
        rbIncidenciaNuevaM = new javax.swing.JRadioButton();
        lblIncidenciaNuevaActa = new javax.swing.JLabel();
        txtIncidenciaNuevaActa = new javax.swing.JTextField();
        lblIncidenciaNuevaCliente = new javax.swing.JLabel();
        txtIncidenciaNuevaCliente = new javax.swing.JTextField();
        lblIncidenciaNuevaServicio = new javax.swing.JLabel();
        txtIncidenciaNuevaServicio = new javax.swing.JTextField();
        lblIncidenciaNuevaSupervisor = new javax.swing.JLabel();
        txtIncidenciaNuevaSupervisor = new javax.swing.JTextField();
        lblIncidenciaNuevaTestimonioS = new javax.swing.JLabel();
        spIncidenciaNuevaTestimonioS = new javax.swing.JScrollPane();
        taIncidenciaNuevaTestimonioS = new javax.swing.JTextArea();
        lblIncidenciaNuevaTestimonioE = new javax.swing.JLabel();
        spIncidenciaNuevaTestimonioE = new javax.swing.JScrollPane();
        taIncidenciaNuevaTestimonioE = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblIncidenciaNuevaFecha.setText("Fecha:");

        lblIncidenciaNuevaHora.setText("Hora:");

        lblIncidenciaNuevaTipo.setText("Tipo:");

        rbIncidenciaNuevaTipoD.setText("Démerito");

        rbIncidenciaNuevaM.setText("Mérito");

        lblIncidenciaNuevaActa.setText("Acta administrativa:");

        lblIncidenciaNuevaCliente.setText("Cliente:");

        lblIncidenciaNuevaServicio.setText("Servicio:");

        lblIncidenciaNuevaSupervisor.setText("Supervisor:");

        lblIncidenciaNuevaTestimonioS.setText("Testimonio del Supervisor:");

        taIncidenciaNuevaTestimonioS.setColumns(20);
        taIncidenciaNuevaTestimonioS.setRows(5);
        spIncidenciaNuevaTestimonioS.setViewportView(taIncidenciaNuevaTestimonioS);

        lblIncidenciaNuevaTestimonioE.setText("Testimonio del Elemento:");

        taIncidenciaNuevaTestimonioE.setColumns(20);
        taIncidenciaNuevaTestimonioE.setRows(5);
        spIncidenciaNuevaTestimonioE.setViewportView(taIncidenciaNuevaTestimonioE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIncidenciaNuevaServicio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIncidenciaNuevaActa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIncidenciaNuevaActa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIncidenciaNuevaFecha)
                                    .addComponent(lblIncidenciaNuevaTipo)
                                    .addComponent(lblIncidenciaNuevaCliente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbIncidenciaNuevaTipoD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbIncidenciaNuevaM))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dpIncidenciaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblIncidenciaNuevaHora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIncidenciaNuevaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtIncidenciaNuevaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txtIncidenciaNuevaServicio)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIncidenciaNuevaSupervisor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIncidenciaNuevaSupervisor)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblIncidenciaNuevaTestimonioS)
                            .addGap(53, 53, 53)
                            .addComponent(lblIncidenciaNuevaTestimonioE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(spIncidenciaNuevaTestimonioS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(spIncidenciaNuevaTestimonioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaFecha)
                            .addComponent(dpIncidenciaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIncidenciaNuevaHora)
                            .addComponent(txtIncidenciaNuevaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaTipo)
                            .addComponent(rbIncidenciaNuevaTipoD)
                            .addComponent(rbIncidenciaNuevaM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaCliente)
                            .addComponent(txtIncidenciaNuevaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaServicio)
                            .addComponent(txtIncidenciaNuevaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaActa)
                            .addComponent(txtIncidenciaNuevaActa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaSupervisor)
                            .addComponent(txtIncidenciaNuevaSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIncidenciaNuevaTestimonioS)
                            .addComponent(lblIncidenciaNuevaTestimonioE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spIncidenciaNuevaTestimonioS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spIncidenciaNuevaTestimonioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private org.jdesktop.swingx.JXDatePicker dpIncidenciaNueva;
    private javax.swing.JLabel lblIncidenciaNuevaActa;
    private javax.swing.JLabel lblIncidenciaNuevaCliente;
    private javax.swing.JLabel lblIncidenciaNuevaFecha;
    private javax.swing.JLabel lblIncidenciaNuevaHora;
    private javax.swing.JLabel lblIncidenciaNuevaServicio;
    private javax.swing.JLabel lblIncidenciaNuevaSupervisor;
    private javax.swing.JLabel lblIncidenciaNuevaTestimonioE;
    private javax.swing.JLabel lblIncidenciaNuevaTestimonioS;
    private javax.swing.JLabel lblIncidenciaNuevaTipo;
    private javax.swing.JRadioButton rbIncidenciaNuevaM;
    private javax.swing.JRadioButton rbIncidenciaNuevaTipoD;
    private javax.swing.JScrollPane spIncidenciaNuevaTestimonioE;
    private javax.swing.JScrollPane spIncidenciaNuevaTestimonioS;
    private javax.swing.JTextArea taIncidenciaNuevaTestimonioE;
    private javax.swing.JTextArea taIncidenciaNuevaTestimonioS;
    private javax.swing.JTextField txtIncidenciaNuevaActa;
    private javax.swing.JTextField txtIncidenciaNuevaCliente;
    private javax.swing.JTextField txtIncidenciaNuevaHora;
    private javax.swing.JTextField txtIncidenciaNuevaServicio;
    private javax.swing.JTextField txtIncidenciaNuevaSupervisor;
    // End of variables declaration//GEN-END:variables
}
