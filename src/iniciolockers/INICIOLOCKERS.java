/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciolockers;

import Act_Empleado.Login_empleado;
import Users.Register_users;
import Users.client;
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
        this.setTitle("Sa.H.Lo");
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/icono.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 550));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Inicio de sesión");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 50, 145, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 70, 310, 310);

        btn2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Entrar como usuario");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(20, 250, 220, 40);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Créditos: Jesús Martín Hernández Hernández & ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 410, 360, 50);

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
        jLabel5.setBounds(380, 390, 500, 40);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 300, 130, 40);

        jLabel9.setBackground(new java.awt.Color(0, 102, 0));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Juni wit's Pel ju'ni ejatalab que,u wits'nal ka'l");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 410, 450, 60);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("Felipe de Jesús Zamora Baldazo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 440, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 510);

        jMenu1.setText("Sesion Personal");

        jMenuItem1.setText("Administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Empleado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        client frm = new client();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LOGIN frm= new LOGIN();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Login_empleado frm= new Login_empleado();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Register_users frm= new Register_users();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void  botones(){
    //btn1.setOpaque(false);
    //btn1.setContentAreaFilled(false);
   // btn1.setBorderPainted(true);
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
    private javax.swing.JButton btn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
