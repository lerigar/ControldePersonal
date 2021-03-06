/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfazClienteServicios;

import javax.swing.JComboBox;
import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class NuevoCliente extends javax.swing.JDialog {

    /**
     * Creates new form NuevoCliente
     */
    conector conexionactual;
    public NuevoCliente(java.awt.Frame parent, boolean modal,conector conexionactual){
        super(parent, modal);
        this.conexionactual = conexionactual;
        initComponents();
        setTitle("Nuevo Cliente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spNuevoCliente = new javax.swing.JScrollPane();
        pNuevoCliente = new javax.swing.JPanel();
        lblClienteNombre = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblGiro = new javax.swing.JLabel();
        txtGiro = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtNombreComercial = new javax.swing.JTextField();
        lblNombreComercial = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        tpDatosCliente = new javax.swing.JTabbedPane();
        pGenerales = new javax.swing.JPanel();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        lblExterior = new javax.swing.JLabel();
        txtNumeroExterior = new javax.swing.JTextField();
        lblInterior = new javax.swing.JLabel();
        txtNumeroInterior = new javax.swing.JTextField();
        lblColonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblCodPostal = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        cbAltaCIESP = new javax.swing.JCheckBox();
        lblHorario = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        cbEstados = new javax.swing.JComboBox();
        lblMunicipio = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox();
        lblTelefonos = new javax.swing.JLabel();
        txtTelefonos = new javax.swing.JTextField();
        lblRepresentante = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        lblRepTelOficina = new javax.swing.JLabel();
        txtRepTelOficina = new javax.swing.JTextField();
        lblRepTelCelular = new javax.swing.JLabel();
        txtRepTelCelular = new javax.swing.JTextField();
        lblRepCorreo = new javax.swing.JLabel();
        txtRepCorreo = new javax.swing.JTextField();
        lblEncargado = new javax.swing.JLabel();
        txtEncargado = new javax.swing.JTextField();
        lblEncTelOficina = new javax.swing.JLabel();
        txtEncTelOficina = new javax.swing.JTextField();
        lblEncTelCelular = new javax.swing.JLabel();
        txtEncTelCelular = new javax.swing.JTextField();
        lblEncCorreo = new javax.swing.JLabel();
        txtEncCorreo = new javax.swing.JTextField();
        lblServiciosInicio = new javax.swing.JLabel();
        dpInicioServicios = new org.jdesktop.swingx.JXDatePicker();
        lblVigenciaContrato = new javax.swing.JLabel();
        dpVigenciaServicios = new org.jdesktop.swingx.JXDatePicker();
        lblComentarios = new javax.swing.JLabel();
        txtComentarios = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnContrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblClienteNombre.setText("Cliente:");

        lblGiro.setText("Giro:");

        lblRFC.setText("RFC:");

        lblNombreComercial.setText("Nombre Comercial:");

        lblRazonSocial.setText("Razón Social:");

        lblDomicilio.setText("Domicilio:");

        lblExterior.setText("No. Exterior:");

        lblInterior.setText("No. Interior:");

        lblColonia.setText("Colonia:");

        lblCodPostal.setText("Código Postal:");

        cbAltaCIESP.setText("Alta CIESP");

        lblHorario.setText("Horario:");

        lblEstado.setText("Estado:");

        cbEstados.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameEstadosRepublica()));
        cbEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadosActionPerformed(evt);
            }
        });

        lblMunicipio.setText("Municipio:");

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige un municipio" }));

        lblTelefonos.setText("Teléfonos:");

        lblRepresentante.setText("Representante legal:");

        lblRepTelOficina.setText("Teléfono de Oficina:");

        lblRepTelCelular.setText("Celular:");

        lblRepCorreo.setText("Correo:");

        lblEncargado.setText("Encargado de seguridad:");

        lblEncTelOficina.setText("Teléfono de Oficina:");

        lblEncTelCelular.setText("Celular");

        lblEncCorreo.setText("Correo:");

        lblServiciosInicio.setText("Inicio de servicios:");

        lblVigenciaContrato.setText("Vigencia de contrato:");

        lblComentarios.setText("Comentarios:");

        javax.swing.GroupLayout pGeneralesLayout = new javax.swing.GroupLayout(pGenerales);
        pGenerales.setLayout(pGeneralesLayout);
        pGeneralesLayout.setHorizontalGroup(
            pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGeneralesLayout.createSequentialGroup()
                        .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pGeneralesLayout.createSequentialGroup()
                                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDomicilio)
                                    .addComponent(lblColonia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtDomicilio)))
                            .addGroup(pGeneralesLayout.createSequentialGroup()
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEstados, 0, 201, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pGeneralesLayout.createSequentialGroup()
                                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pGeneralesLayout.createSequentialGroup()
                                        .addComponent(lblExterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblInterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pGeneralesLayout.createSequentialGroup()
                                        .addComponent(lblCodPostal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pGeneralesLayout.createSequentialGroup()
                                        .addComponent(lblHorario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbAltaCIESP)))
                            .addGroup(pGeneralesLayout.createSequentialGroup()
                                .addComponent(lblMunicipio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pGeneralesLayout.createSequentialGroup()
                        .addComponent(lblTelefonos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGeneralesLayout.createSequentialGroup()
                        .addComponent(lblRepresentante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRepTelOficina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepTelOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRepTelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGeneralesLayout.createSequentialGroup()
                        .addComponent(lblRepCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGeneralesLayout.createSequentialGroup()
                        .addComponent(lblEncTelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEncTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEncCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEncCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGeneralesLayout.createSequentialGroup()
                        .addComponent(lblServiciosInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpInicioServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVigenciaContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpVigenciaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pGeneralesLayout.createSequentialGroup()
                            .addComponent(lblComentarios)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtComentarios))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pGeneralesLayout.createSequentialGroup()
                            .addComponent(lblEncargado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblEncTelOficina)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEncTelOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        pGeneralesLayout.setVerticalGroup(
            pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeneralesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExterior)
                    .addComponent(txtNumeroExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInterior)
                    .addComponent(txtNumeroInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAltaCIESP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColonia)
                    .addComponent(lblCodPostal)
                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorario)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(lblMunicipio)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRepresentante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRepTelOficina)
                        .addComponent(txtRepTelOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRepTelCelular)
                        .addComponent(txtRepTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEncargado)
                    .addComponent(lblEncTelOficina)
                    .addComponent(txtEncTelOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEncTelCelular)
                    .addComponent(lblEncCorreo)
                    .addComponent(txtEncCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpInicioServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiciosInicio)
                    .addComponent(lblVigenciaContrato)
                    .addComponent(dpVigenciaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComentarios))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tpDatosCliente.addTab("Datos generales", pGenerales);

        btnRegistrar.setText("Registrar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnContrato.setText("Generar Contrato");

        javax.swing.GroupLayout pNuevoClienteLayout = new javax.swing.GroupLayout(pNuevoCliente);
        pNuevoCliente.setLayout(pNuevoClienteLayout);
        pNuevoClienteLayout.setHorizontalGroup(
            pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpDatosCliente)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNuevoClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pNuevoClienteLayout.createSequentialGroup()
                        .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreComercial)
                            .addComponent(lblClienteNombre)
                            .addComponent(lblRazonSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreComercial)
                            .addComponent(txtNombreCliente)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pNuevoClienteLayout.createSequentialGroup()
                                .addComponent(lblGiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiro))
                            .addGroup(pNuevoClienteLayout.createSequentialGroup()
                                .addComponent(lblRFC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pNuevoClienteLayout.setVerticalGroup(
            pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNuevoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteNombre)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiro)
                    .addComponent(txtGiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreComercial)
                    .addComponent(txtNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazonSocial)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tpDatosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegistrar)
                    .addComponent(btnContrato))
                .addContainerGap())
        );

        spNuevoCliente.setViewportView(pNuevoCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spNuevoCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spNuevoCliente)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadosActionPerformed
        JComboBox cbREF = (JComboBox) evt.getSource();
        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel(conexionactual.dameMunicipios(cbREF.getSelectedItem().toString())));
    }//GEN-LAST:event_cbEstadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContrato;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cbAltaCIESP;
    private javax.swing.JComboBox cbEstados;
    private javax.swing.JComboBox cbMunicipio;
    private org.jdesktop.swingx.JXDatePicker dpInicioServicios;
    private org.jdesktop.swingx.JXDatePicker dpVigenciaServicios;
    private javax.swing.JLabel lblClienteNombre;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEncCorreo;
    private javax.swing.JLabel lblEncTelCelular;
    private javax.swing.JLabel lblEncTelOficina;
    private javax.swing.JLabel lblEncargado;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblExterior;
    private javax.swing.JLabel lblGiro;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblInterior;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombreComercial;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblRepCorreo;
    private javax.swing.JLabel lblRepTelCelular;
    private javax.swing.JLabel lblRepTelOficina;
    private javax.swing.JLabel lblRepresentante;
    private javax.swing.JLabel lblServiciosInicio;
    private javax.swing.JLabel lblTelefonos;
    private javax.swing.JLabel lblVigenciaContrato;
    private javax.swing.JPanel pGenerales;
    private javax.swing.JPanel pNuevoCliente;
    private javax.swing.JScrollPane spNuevoCliente;
    private javax.swing.JTabbedPane tpDatosCliente;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEncCorreo;
    private javax.swing.JTextField txtEncTelCelular;
    private javax.swing.JTextField txtEncTelOficina;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtGiro;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreComercial;
    private javax.swing.JTextField txtNumeroExterior;
    private javax.swing.JTextField txtNumeroInterior;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRepCorreo;
    private javax.swing.JTextField txtRepTelCelular;
    private javax.swing.JTextField txtRepTelOficina;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtTelefonos;
    // End of variables declaration//GEN-END:variables
}
