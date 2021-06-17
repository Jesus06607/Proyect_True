/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciolockers;

import SQL.Controllers;
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
        this.setTitle("Sa.H.Lo");
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
        txt_Lugar = new javax.swing.JTextField();
        txt_Turista = new javax.swing.JTextField();
        txt_Loker = new javax.swing.JTextField();
        txt_Usuario = new javax.swing.JTextField();
        txt_Inicio = new javax.swing.JTextField();
        txt_Final = new javax.swing.JTextField();
        txt_Renta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 535));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLAVE DE LUGAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 120, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLAVE DE TURISTA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(37, 120, 140, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLAVE DE LOCKER ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 180, 150, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLAVE DE USUARIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 240, 140, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE INICIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 300, 120, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA DE FIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 350, 100, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INGRESO DE RENTA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(28, 410, 150, 30);
        getContentPane().add(txt_Lugar);
        txt_Lugar.setBounds(180, 60, 160, 30);
        getContentPane().add(txt_Turista);
        txt_Turista.setBounds(180, 120, 160, 30);
        getContentPane().add(txt_Loker);
        txt_Loker.setBounds(180, 180, 160, 30);
        getContentPane().add(txt_Usuario);
        txt_Usuario.setBounds(180, 240, 160, 30);
        getContentPane().add(txt_Inicio);
        txt_Inicio.setBounds(180, 300, 160, 30);
        getContentPane().add(txt_Final);
        txt_Final.setBounds(180, 350, 160, 30);
        getContentPane().add(txt_Renta);
        txt_Renta.setBounds(180, 410, 160, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese los datos de la renta");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 0, 290, 40);

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Guardar.png"))); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar);
        btn_Guardar.setBounds(330, 460, 140, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/back.png"))); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 460, 90, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_rentas.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 600, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        
                String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7;

        cadena1 = txt_Lugar.getText();
        cadena2 = txt_Turista.getText();
        cadena3 = txt_Loker.getText();
        cadena4 = txt_Usuario.getText();
        cadena5 = txt_Inicio.getText();
        cadena6 = txt_Final.getText();
        cadena7 = txt_Renta.getText();

        if (txt_Lugar.getText().equals("")
                || (txt_Turista.getText().equals("")
                || (txt_Loker.getText().equals(""))
                || (txt_Usuario.getText().equals(""))
                || (txt_Inicio.getText().equals(""))
                || (txt_Final.getText().equals(""))
                || (txt_Renta.getText().equals("")))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_Turista.requestFocus();
        } else if (Controllers.addData(" Rentas ", " Clave_Lugar, Clave_Turistas, Clave_Locker, Clave_Usuario, Fecha_Inicio, Fecha_Fin, Ingresos_Renta ", " '" + cadena1 + "', '" + cadena2 + "', '" + cadena3 + "', '" + cadena4 + "', '" + cadena5 + "', '" + cadena6 + "', '" + cadena7 + "' ")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo correctamente \n", "FELICIDADES!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        //Esto sirve para que despues de ingresar los datos se pongan vacios 
        this.txt_Lugar.setText("");
        this.txt_Turista.setText("");
        this.txt_Loker.setText("");
        this.txt_Usuario.setText("");
        this.txt_Inicio.setText("");
        this.txt_Final.setText("");
        this.txt_Renta.setText("");
        
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

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
    private javax.swing.JButton btn_Guardar;
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
    private javax.swing.JTextField txt_Final;
    private javax.swing.JTextField txt_Inicio;
    private javax.swing.JTextField txt_Loker;
    private javax.swing.JTextField txt_Lugar;
    private javax.swing.JTextField txt_Renta;
    private javax.swing.JTextField txt_Turista;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
