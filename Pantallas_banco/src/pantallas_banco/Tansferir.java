/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas_banco;

import Clases.Usuario;
import Clases.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author fvarg
 */
public class Tansferir extends javax.swing.JFrame {

    int contador = 0;

    /**
     * Creates new form Tansferir
     */
    public Tansferir() {
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

        Grupo_Box = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        instruccion = new javax.swing.JLabel();
        txtbeneficiario = new javax.swing.JLabel();
        beneficio = new javax.swing.JTextField();
        txtnumero = new javax.swing.JLabel();
        beneficiario1 = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        TransferirBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(61, 63, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(1, 0, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/atras.png"))); // NOI18N
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 528, 70, -1));

        titulo.setBackground(new java.awt.Color(1, 0, 39));
        titulo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(117, 198, 173));
        titulo.setText("Depositar por transferencia");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 21, 277, 42));

        instruccion.setFont(new java.awt.Font("Arial Narrow", 3, 13)); // NOI18N
        instruccion.setForeground(new java.awt.Color(240, 217, 206));
        instruccion.setText("Rellena los siguientes cuadros de informacion para completar.");
        jPanel1.add(instruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 340, 48));

        txtbeneficiario.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        txtbeneficiario.setForeground(new java.awt.Color(117, 198, 173));
        txtbeneficiario.setText("Beneficiario:");
        jPanel1.add(txtbeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 128, -1, -1));

        beneficio.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        beneficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beneficioActionPerformed(evt);
            }
        });
        jPanel1.add(beneficio, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 147, 273, 39));

        txtnumero.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        txtnumero.setForeground(new java.awt.Color(117, 198, 173));
        txtnumero.setText("Numero de tarjeta:");
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 211, -1, -1));

        beneficiario1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jPanel1.add(beneficiario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 235, 273, 39));

        txtcantidad.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(117, 198, 173));
        txtcantidad.setText("Cantidad:");
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 292, -1, -1));

        cantidad.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 316, 273, 39));

        TransferirBtn.setBackground(new java.awt.Color(224, 127, 181));
        TransferirBtn.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        TransferirBtn.setText("Completar Transferencia");
        TransferirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransferirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TransferirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 273, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/f6.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 190, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Home abrir = new Home();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void TransferirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferirBtnActionPerformed

        String bf = beneficio.getText();
        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);
        int posicion = Usuario.verificarTransicion(bf);
        if (posicion == -1) {
            JOptionPane.showMessageDialog(this, "Beneficiario es incorrecto");
        } else {
            String deposito1 = cantidad.getText();
            double deposito2 = Double.parseDouble(deposito1);
            Cuenta1.depositar(deposito2);
            JOptionPane.showMessageDialog(this, "deposito exitoso");
            contador++;
        }


    }//GEN-LAST:event_TransferirBtnActionPerformed

    private void beneficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beneficioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beneficioActionPerformed

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
            java.util.logging.Logger.getLogger(Tansferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tansferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tansferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tansferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tansferir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_Box;
    private javax.swing.JButton TransferirBtn;
    private javax.swing.JTextField beneficiario1;
    private javax.swing.JTextField beneficio;
    private javax.swing.JButton btn1;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel instruccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtbeneficiario;
    private javax.swing.JLabel txtcantidad;
    private javax.swing.JLabel txtnumero;
    // End of variables declaration//GEN-END:variables
}
