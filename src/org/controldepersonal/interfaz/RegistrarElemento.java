/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controldepersonal.interfaz;

/**
 *
 * @author Miguel
 */
public class RegistrarElemento extends javax.swing.JDialog {

    private static void DISPOSE_ON_CLOSE(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form RegistrarElemento
     */
    public RegistrarElemento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Registro de Elemento");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spRegistroElemento = new javax.swing.JScrollPane();
        pRegistroElemento = new javax.swing.JPanel();
        tpRegistroElemento = new javax.swing.JTabbedPane();
        pDatosPersonales = new javax.swing.JPanel();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pBotones = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pRegistroElemento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pDatosPersonales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblApellidoPaterno.setText("Apellido Paterno");

        lblApellidoMaterno.setText("Apellido Materno");

        lblNombre.setText("Nombre");

        javax.swing.GroupLayout pDatosPersonalesLayout = new javax.swing.GroupLayout(pDatosPersonales);
        pDatosPersonales.setLayout(pDatosPersonalesLayout);
        pDatosPersonalesLayout.setHorizontalGroup(
            pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblApellidoPaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblApellidoMaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        pDatosPersonalesLayout.setVerticalGroup(
            pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPaterno)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoMaterno)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(381, Short.MAX_VALUE))
        );

        tpRegistroElemento.addTab("Datos Personales", pDatosPersonales);

        pBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pRegistroElementoLayout = new javax.swing.GroupLayout(pRegistroElemento);
        pRegistroElemento.setLayout(pRegistroElementoLayout);
        pRegistroElementoLayout.setHorizontalGroup(
            pRegistroElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpRegistroElemento)
            .addGroup(pRegistroElementoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRegistroElementoLayout.setVerticalGroup(
            pRegistroElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistroElementoLayout.createSequentialGroup()
                .addComponent(tpRegistroElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        spRegistroElemento.setViewportView(pRegistroElemento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spRegistroElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spRegistroElemento, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarElemento dialog = new RegistrarElemento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pDatosPersonales;
    private javax.swing.JPanel pRegistroElemento;
    private javax.swing.JScrollPane spRegistroElemento;
    private javax.swing.JTabbedPane tpRegistroElemento;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
