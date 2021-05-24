/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciolockers;

import javax.swing.ImageIcon;

/**
 *
 * @author Araceli
 */
public class RENTAS extends javax.swing.JFrame {

    /**
     * Creates new form RENTAS
     */
    public RENTAS() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cv_Lugar = new javax.swing.JTextField();
        cv_Turista = new javax.swing.JTextField();
        cv_Loker = new javax.swing.JTextField();
        cv_usuario = new javax.swing.JTextField();
        finicio = new javax.swing.JTextField();
        ffin = new javax.swing.JTextField();
        ing_renta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("CLAVE DE LUGAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 65, 120, 20);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("CLAVE DE TURISTA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(57, 120, 120, 30);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("CLAVE DE LOCKER ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 180, 120, 30);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("CLAVE DE USUARIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 240, 130, 30);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("FECHA DE INICIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(61, 300, 120, 30);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("FECHA DE FIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 350, 100, 30);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("INGRESO DE RENTA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(48, 410, 130, 30);
        getContentPane().add(cv_Lugar);
        cv_Lugar.setBounds(180, 60, 310, 30);
        getContentPane().add(cv_Turista);
        cv_Turista.setBounds(180, 120, 310, 30);
        getContentPane().add(cv_Loker);
        cv_Loker.setBounds(180, 180, 320, 30);
        getContentPane().add(cv_usuario);
        cv_usuario.setBounds(180, 240, 310, 30);
        getContentPane().add(finicio);
        finicio.setBounds(180, 300, 310, 30);
        getContentPane().add(ffin);
        ffin.setBounds(180, 350, 300, 30);
        getContentPane().add(ing_renta);
        ing_renta.setBounds(180, 410, 310, 30);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("INGRESE DATOS DE LA RENTA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 0, 200, 40);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 460, 90, 40);

        jButton2.setText("Ir al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 460, 90, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_rentas.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 590, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RENTAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cv_Loker;
    private javax.swing.JTextField cv_Lugar;
    private javax.swing.JTextField cv_Turista;
    private javax.swing.JTextField cv_usuario;
    private javax.swing.JTextField ffin;
    private javax.swing.JTextField finicio;
    private javax.swing.JTextField ing_renta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
