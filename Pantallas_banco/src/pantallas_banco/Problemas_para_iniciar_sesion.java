/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas_banco;

/**
 *
 * @author fvarg
 */
public class Problemas_para_iniciar_sesion extends javax.swing.JFrame {

    /**
     * Creates new form Problemas_para_iniciar_sesion
     */
    public Problemas_para_iniciar_sesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        intruccion = new javax.swing.JLabel();
        varcorreo = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btncontraseña = new javax.swing.JButton();
        imgfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fondo.setBackground(new java.awt.Color(159, 100, 216));
        fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(1, 0, 39));
        titulo.setText("Recuperar contraseña");
        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 39, 230, 36));

        contenedor.setBackground(new java.awt.Color(106, 46, 205));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        intruccion.setFont(new java.awt.Font("Comfortaa", 1, 10)); // NOI18N
        intruccion.setForeground(new java.awt.Color(1, 0, 39));
        intruccion.setText("Ingresa el correo electrónico asociado a la cuenta.");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(intruccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varcorreo))
                .addGap(19, 19, 19))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(intruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(varcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        fondo.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 93, -1, -1));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/atras.png"))); // NOI18N
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        fondo.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 528, 70, -1));

        btncontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/candado.png"))); // NOI18N
        btncontraseña.setBorderPainted(false);
        btncontraseña.setContentAreaFilled(false);
        btncontraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btncontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, -1));

        imgfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Hw1.png"))); // NOI18N
        fondo.add(imgfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 380, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Problemas_para_iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problemas_para_iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problemas_para_iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problemas_para_iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problemas_para_iniciar_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btncontraseña;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imgfondo;
    private javax.swing.JLabel intruccion;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField varcorreo;
    // End of variables declaration//GEN-END:variables
}
