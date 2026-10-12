package estructura.de.datos.pkg2026;

import java.awt.Color;
import java.util.HashSet;

/**
 *
 * @author Luisc
 */
public class SaludarJF extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SaludarJF.class.getName());

    /**
     * Creates new form SaludarJF
     */
    public SaludarJF() {
        initComponents();
        
        /*inicializar componentes*/
        lblSaludo.setText("HOLA JAVA SWING");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        PanelWIN = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        btnSaludar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelWIN.setBackground(new java.awt.Color(0, 0, 0));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(255, 102, 102));
        lblSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaludo.setText("Hola");

        btnSaludar.setBackground(new java.awt.Color(255, 0, 51));
        btnSaludar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSaludar.setForeground(new java.awt.Color(255, 255, 255));
        btnSaludar.setText("Saludar");
        btnSaludar.addActionListener(this::btnSaludarActionPerformed);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addActionListener(this::txtNombreActionPerformed);

        javax.swing.GroupLayout PanelWINLayout = new javax.swing.GroupLayout(PanelWIN);
        PanelWIN.setLayout(PanelWINLayout);
        PanelWINLayout.setHorizontalGroup(
            PanelWINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWINLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(PanelWINLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelWINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaludar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addContainerGap())
        );
        PanelWINLayout.setVerticalGroup(
            PanelWINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWINLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSaludar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelWIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelWIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludarActionPerformed
        // TODO add your handling code here:
        
        //Inilcia el click
        PanelWIN.setBackground(Color.CYAN); // Usa RGB personalizadol
        lblSaludo.setSize(20, 20); // Esto cambia el tamaño del JLabel, no la fuenteb
        btnSaludar.setBackground(Color.magenta);
        
        
        String nombre = txtNombre.getText();
        lblSaludo.setText("HOLA " + nombre.toUpperCase());
        //Termina el click
    }//GEN-LAST:event_btnSaludarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SaludarJF().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelWIN;
    private javax.swing.JButton btnSaludar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
