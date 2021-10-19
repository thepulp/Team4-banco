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
public class Actividades_Recientes extends javax.swing.JFrame {

    /**
     * Creates new form Actividades_Recientes
     */
    public Actividades_Recientes() {
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
        btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        Titulo = new javax.swing.JLabel();
        btnretiros = new javax.swing.JButton();
        btndepositos = new javax.swing.JButton();
        Numeros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(159, 100, 216));
        fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 5, 10, 5, new java.awt.Color(0, 0, 0)));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/atras.png"))); // NOI18N
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        fondo.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 80, 60));

        lista.setBackground(new java.awt.Color(106, 46, 205));
        lista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista.setForeground(new java.awt.Color(1, 0, 39));
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "11 octubre 2021", "Paypal *Steam Games     $-499", " ", " ", "8 de octubre", "Pago Cuenta de Tercero $42", "Pago Cuenta de Tercero $100", " ", " ", "1 de octubre", "Paypal Spotify Ab           $-115", " ", " ", "26 de septiembre", "Pago Cuenta de Tercero$400" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 300));

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 0, 39));
        Titulo.setText("Ultimos Movimientos:");
        fondo.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, 149, 28));

        btnretiros.setBackground(new java.awt.Color(0, 0, 119));
        btnretiros.setForeground(new java.awt.Color(255, 255, 255));
        btnretiros.setText("No.Retiros");
        fondo.add(btnretiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, 40));

        btndepositos.setBackground(new java.awt.Color(0, 0, 119));
        btndepositos.setForeground(new java.awt.Color(255, 255, 255));
        btndepositos.setText("No.Depositos");
        fondo.add(btndepositos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 110, 40));

        Numeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Numeros.setForeground(new java.awt.Color(1, 0, 39));
        Numeros.setText("No.");
        fondo.add(Numeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 60, 20));

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
            java.util.logging.Logger.getLogger(Actividades_Recientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividades_Recientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividades_Recientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividades_Recientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividades_Recientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Numeros;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btndepositos;
    private javax.swing.JButton btnretiros;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
