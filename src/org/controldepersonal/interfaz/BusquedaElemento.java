/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfaz;

import org.controldepersonal.conector.conector;

/**
 *
 * @author Miguel
 */
public class BusquedaElemento extends javax.swing.JDialog {

    /**
     * Creates new form BusquedaElemento
     */
    private String apellidoElemento = "";
    private int numeroElemento= 0;
    conector conexionactual;
    public BusquedaElemento(java.awt.Frame parent, boolean modal,conector conexionactual,int numeroElemento) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        this.numeroElemento = numeroElemento;
        initComponents();
        setTitle("Busqueda de Personal");
        System.out.println(this.numeroElemento);
    }
    
    public BusquedaElemento(java.awt.Frame parent, boolean modal,conector conexionactual,String apellidoElemento) {
        super(parent, modal);
        this.conexionactual = conexionactual;
        this.apellidoElemento = apellidoElemento;
        initComponents();
        setTitle("Busqueda de Personal");
        System.out.println(this.apellidoElemento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
