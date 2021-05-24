/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciolockers;

import javax.swing.ImageIcon;

/**
 *
 * @author Fzvercetti
 */
public class INICIOLOCKERS extends javax.swing.JFrame {

    /**
     * Creates new form INICIOLOCKERS
     */
    public INICIOLOCKERS() {
        initComponents();
        botones();
        this.setTitle("Sistema de Lockers de Ciudad Valles");
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/icono.png")).getImage());
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 550));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Felipe de Jesús Zamora Baldazo & Jesús Martín Hernandez Hernandez");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 480, 540, 20);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Inicio de sesión");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 50, 145, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 70, 310, 310);

        btn1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Administrador");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(50, 210, 140, 40);

        btn2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Entrar como usuario");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(10, 280, 220, 40);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Créditos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 440, 80, 40);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Sa.H.Lo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 10, 130, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/login.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 80, 100, 120);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Cada flor es un alma que florece en la naturaleza");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 410, 500, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 900, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        LOGIN frm= new LOGIN();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    public void  botones(){
    btn1.setOpaque(false);
    btn1.setContentAreaFilled(false);
    btn1.setBorderPainted(true);
    btn2.setOpaque(false);
    btn2.setContentAreaFilled(false);
    btn2.setBorderPainted(false);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(INICIOLOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIOLOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIOLOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIOLOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIOLOCKERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
