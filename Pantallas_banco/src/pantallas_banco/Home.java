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
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home1
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        btnsalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textobtn2 = new javax.swing.JLabel();
        textobtn3 = new javax.swing.JLabel();
        textobtn4 = new javax.swing.JLabel();
        textobtn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 63, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalir.setForeground(new java.awt.Color(0, 0, 119));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salir.png"))); // NOI18N
        btnsalir.setBorderPainted(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 350, -1));

        jButton1.setBackground(new java.awt.Color(224, 127, 181));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 0, 9)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cuenta.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        jButton2.setBackground(new java.awt.Color(224, 127, 181));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 0, 9)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mas-reciente.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 60));

        jButton3.setBackground(new java.awt.Color(224, 127, 181));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 0, 9)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dinero.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, 60));

        jButton4.setBackground(new java.awt.Color(224, 127, 181));
        jButton4.setFont(new java.awt.Font("Arial Narrow", 0, 9)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/transferencia-bancaria.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 60));

        textobtn2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        textobtn2.setForeground(new java.awt.Color(117, 198, 173));
        textobtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textobtn2.setText("Transferencias");
        jPanel1.add(textobtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, 20));

        textobtn3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        textobtn3.setForeground(new java.awt.Color(117, 198, 173));
        textobtn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textobtn3.setText("Saldo");
        jPanel1.add(textobtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 20));

        textobtn4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        textobtn4.setForeground(new java.awt.Color(117, 198, 173));
        textobtn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textobtn4.setText("Actividades recientes");
        jPanel1.add(textobtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 150, 20));

        textobtn1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        textobtn1.setForeground(new java.awt.Color(117, 198, 173));
        textobtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textobtn1.setText("Informacion cuenta");
        jPanel1.add(textobtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/f4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 60, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/f5.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Detalles_de_la_cuenta abrir = new Detalles_de_la_cuenta();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Inicio_de_sesion abrir = new Inicio_de_sesion();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tansferir abrir = new Tansferir();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Actividades_Recientes abrir = new Actividades_Recientes();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Informacion_bancaria abrir = new Informacion_bancaria();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textobtn1;
    private javax.swing.JLabel textobtn2;
    private javax.swing.JLabel textobtn3;
    private javax.swing.JLabel textobtn4;
    // End of variables declaration//GEN-END:variables
}
