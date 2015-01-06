/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepresonal.interfazBusqueda;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class SeleccionarBusquedaElemento extends javax.swing.JDialog {

    /**
     * Creates new form BuscarElemento
     */
    conector conexionactual;
    public SeleccionarBusquedaElemento(java.awt.Frame parent, boolean modal,conector conexionactual) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        initComponents();
        setTitle("Busqueda de Personal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        btnBuscarNumero = new javax.swing.JButton();
        btnBuscarApellido = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        btnMostrarActivos = new javax.swing.JButton();
        btnMostrarClienteServicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        panelBuscarServicioCliente = new javax.swing.JPanel();
        lblClienteServicio = new javax.swing.JLabel();
        cbClienteServicio = new javax.swing.JComboBox();
        btnBuscarClienteServicio = new javax.swing.JButton();
        panelBuscarApellido = new javax.swing.JPanel();
        lblBuscarApellido = new javax.swing.JLabel();
        txtBuscarApellido = new javax.swing.JTextField();
        btnApellidoBuscar = new javax.swing.JButton();
        panelBuscarNumero = new javax.swing.JPanel();
        lblBuscarNumero = new javax.swing.JLabel();
        txtBuscarNumero = new javax.swing.JTextField();
        btnNumeroBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        btnBuscarNumero.setText("Por número");
        btnBuscarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNumeroActionPerformed(evt);
            }
        });

        btnBuscarApellido.setText("Por apellido");
        btnBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarApellidoActionPerformed(evt);
            }
        });

        btnMostrarTodos.setText("Mostrar todos");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });

        btnMostrarActivos.setText("Mostrar activos");
        btnMostrarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActivosActionPerformed(evt);
            }
        });

        btnMostrarClienteServicio.setText("Mostrar por Cliente/Servicio");
        btnMostrarClienteServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClienteServicioActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnBuscarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnMostrarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarClienteServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarNumero)
                    .addComponent(btnBuscarApellido)
                    .addComponent(btnMostrarTodos))
                .addGap(18, 18, 18)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarActivos)
                    .addComponent(btnMostrarClienteServicio)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelOpciones.setLayout(new java.awt.CardLayout());

        lblClienteServicio.setText("Selecciona el Cliente/Servicio:");

        btnBuscarClienteServicio.setText("Buscar");

        javax.swing.GroupLayout panelBuscarServicioClienteLayout = new javax.swing.GroupLayout(panelBuscarServicioCliente);
        panelBuscarServicioCliente.setLayout(panelBuscarServicioClienteLayout);
        panelBuscarServicioClienteLayout.setHorizontalGroup(
            panelBuscarServicioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarServicioClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClienteServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbClienteServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarServicioClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarClienteServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        panelBuscarServicioClienteLayout.setVerticalGroup(
            panelBuscarServicioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarServicioClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarServicioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteServicio)
                    .addComponent(cbClienteServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarClienteServicio)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelOpciones.add(panelBuscarServicioCliente, "panelBuscarServicioCliente");

        lblBuscarApellido.setText("Ingresa los apellidos del elemento:");

        txtBuscarApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarApellidoKeyTyped(evt);
            }
        });

        btnApellidoBuscar.setText("Buscar");
        btnApellidoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApellidoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarApellidoLayout = new javax.swing.GroupLayout(panelBuscarApellido);
        panelBuscarApellido.setLayout(panelBuscarApellidoLayout);
        panelBuscarApellidoLayout.setHorizontalGroup(
            panelBuscarApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarApellidoLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panelBuscarApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBuscarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarApellidoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnApellidoBuscar)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        panelBuscarApellidoLayout.setVerticalGroup(
            panelBuscarApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarApellidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBuscarApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApellidoBuscar)
                .addContainerGap())
        );

        panelOpciones.add(panelBuscarApellido, "panelBuscarApellido");

        lblBuscarNumero.setText("Ingresa el número del elemento:");

        txtBuscarNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarNumeroKeyTyped(evt);
            }
        });

        btnNumeroBuscar.setText("Buscar");
        btnNumeroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarNumeroLayout = new javax.swing.GroupLayout(panelBuscarNumero);
        panelBuscarNumero.setLayout(panelBuscarNumeroLayout);
        panelBuscarNumeroLayout.setHorizontalGroup(
            panelBuscarNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarNumeroLayout.createSequentialGroup()
                .addGroup(panelBuscarNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarNumeroLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblBuscarNumero))
                    .addGroup(panelBuscarNumeroLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(panelBuscarNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNumeroBuscar)
                            .addComponent(txtBuscarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        panelBuscarNumeroLayout.setVerticalGroup(
            panelBuscarNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNumeroBuscar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelOpciones.add(panelBuscarNumero, "panelBuscarNumero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNumeroActionPerformed
        CardLayout card = (CardLayout) panelOpciones.getLayout();
        card.show(panelOpciones, "panelBuscarNumero");
    }//GEN-LAST:event_btnBuscarNumeroActionPerformed

    private void btnBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarApellidoActionPerformed
        CardLayout card = (CardLayout) panelOpciones.getLayout();
        card.show(panelOpciones, "panelBuscarApellido");
    }//GEN-LAST:event_btnBuscarApellidoActionPerformed

    private void txtBuscarApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarApellidoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != 'ñ' && car != 'Ñ' && car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú' && car != 'Á' && car != 'É' && car != 'Í' && car != 'Ó' && car != 'Ú' && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        if (Character.isLetter(car)) {
            evt.setKeyChar(Character.toUpperCase(car));
        }
    }//GEN-LAST:event_txtBuscarApellidoKeyTyped

    private void txtBuscarNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNumeroKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarNumeroKeyTyped

    private void btnApellidoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApellidoBuscarActionPerformed
        if(txtBuscarApellido.getText().isEmpty())
            JOptionPane.showMessageDialog(panelOpciones, "Ingresa una opción válida");
        else{
            BusquedaElementoMultiple busquedaMultiple = new BusquedaElementoMultiple(new javax.swing.JFrame(), false, conexionactual,txtBuscarApellido.getText());
            busquedaMultiple.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnApellidoBuscarActionPerformed

    private void btnNumeroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroBuscarActionPerformed
        if(txtBuscarNumero.getText().isEmpty())
            JOptionPane.showMessageDialog(panelOpciones, "Ingresa una opción válida");
        else{
            BusquedaElemento busquedaElemento = new BusquedaElemento(new javax.swing.JFrame(), false, conexionactual, Integer.parseInt(txtBuscarNumero.getText()));
            busquedaElemento.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnNumeroBuscarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        BusquedaTodos busquedaTodos = new BusquedaTodos(new javax.swing.JFrame(), false, conexionactual);
        busquedaTodos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnMostrarClienteServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClienteServicioActionPerformed
        CardLayout card = (CardLayout) panelOpciones.getLayout();
        card.show(panelOpciones, "panelBuscarServicioCliente");
    }//GEN-LAST:event_btnMostrarClienteServicioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActivosActionPerformed
        MostrarElementosActivos activos = new MostrarElementosActivos(new javax.swing.JFrame(), false, conexionactual);
        activos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApellidoBuscar;
    private javax.swing.JButton btnBuscarApellido;
    private javax.swing.JButton btnBuscarClienteServicio;
    private javax.swing.JButton btnBuscarNumero;
    private javax.swing.JButton btnMostrarActivos;
    private javax.swing.JButton btnMostrarClienteServicio;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnNumeroBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbClienteServicio;
    private javax.swing.JLabel lblBuscarApellido;
    private javax.swing.JLabel lblBuscarNumero;
    private javax.swing.JLabel lblClienteServicio;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBuscarApellido;
    private javax.swing.JPanel panelBuscarNumero;
    private javax.swing.JPanel panelBuscarServicioCliente;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextField txtBuscarApellido;
    private javax.swing.JTextField txtBuscarNumero;
    // End of variables declaration//GEN-END:variables
}