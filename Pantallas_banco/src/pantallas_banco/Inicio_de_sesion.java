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
public class Inicio_de_sesion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_de_sesion
     */
    public Inicio_de_sesion() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        pass = new javax.swing.JPasswordField();
        viewpass = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        btninicio = new javax.swing.JButton();
        viewusu = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        crearcuenta = new javax.swing.JLabel();
        crearcuenta1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 100, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        pass.setText("jPasswordField1");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 302, 234, 31));

        viewpass.setEditable(false);
        viewpass.setBackground(new java.awt.Color(0, 0, 119));
        viewpass.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        viewpass.setForeground(new java.awt.Color(255, 255, 255));
        viewpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viewpass.setText("Contraseña");
        viewpass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(viewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 253, 234, 31));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, 60));

        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/login.png"))); // NOI18N
        btninicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btninicio.setBorderPainted(false);
        btninicio.setContentAreaFilled(false);
        btninicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });
        jPanel1.add(btninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 361, 230, 50));

        viewusu.setEditable(false);
        viewusu.setBackground(new java.awt.Color(0, 0, 119));
        viewusu.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        viewusu.setForeground(new java.awt.Color(255, 255, 255));
        viewusu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viewusu.setText("Usuario");
        viewusu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewusu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(viewusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 143, 234, 31));

        usuario.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 192, 234, 28));

        crearcuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        crearcuenta.setForeground(new java.awt.Color(106, 46, 205));
        crearcuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearcuenta.setText("¿Olvidaste tu contraseña?");
        crearcuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(crearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 240, 20));

        crearcuenta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        crearcuenta1.setForeground(new java.awt.Color(106, 46, 205));
        crearcuenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearcuenta1.setText("Crear Cuenta");
        crearcuenta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(crearcuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 240, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninicioActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_de_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninicio;
    private javax.swing.JLabel crearcuenta;
    private javax.swing.JLabel crearcuenta1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField viewpass;
    private javax.swing.JTextField viewusu;
    // End of variables declaration//GEN-END:variables
}
