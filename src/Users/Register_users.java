package Users;


import Administrador.Principal;
import SQL.Controllers;
import iniciolockers.INICIOLOCKERS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Register_users extends javax.swing.JFrame {

    /**
     * Creates new form Register_users
     */
    public Register_users() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_nacion = new javax.swing.JTextField();
        txt_sexo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese sus datos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 30, 200, 39);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLAVE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 90, 58, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 130, 80, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 180, 96, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIRECCION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 230, 104, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EDAD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 280, 51, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NACIONALIDAD");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 330, 141, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SEXO");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 380, 49, 30);
        getContentPane().add(txt_clave);
        txt_clave.setBounds(180, 90, 290, 30);
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(180, 130, 290, 30);
        getContentPane().add(txt_telefono);
        txt_telefono.setBounds(180, 180, 290, 30);
        getContentPane().add(txt_direccion);
        txt_direccion.setBounds(180, 230, 290, 30);
        getContentPane().add(txt_edad);
        txt_edad.setBounds(180, 280, 290, 30);

        txt_nacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nacionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nacion);
        txt_nacion.setBounds(180, 330, 290, 30);
        getContentPane().add(txt_sexo);
        txt_sexo.setBounds(180, 380, 290, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 430, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/back.png"))); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 430, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7;

        cadena1 = txt_clave.getText();
        cadena2 = txt_nombre.getText();
        cadena3 = txt_telefono.getText();
        cadena4 = txt_direccion.getText();
        cadena5 = txt_edad.getText();
        cadena6 = txt_nacion.getText();
        cadena7 = txt_sexo.getText();

        if (txt_clave.getText().equals("")
            || (txt_nombre.getText().equals("")
                || (txt_telefono.getText().equals(""))
                || (txt_direccion.getText().equals(""))
                || (txt_edad.getText().equals(""))
                || (txt_nacion.getText().equals(""))
                || (txt_sexo.getText().equals("")))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        } else if (Controllers.addData(" Turistas ", " clave, Nombre, Telefono, Direccion, Edad, Nacionalidad, Sexo ", " '" + cadena1 + "', '" + cadena2 + "', '" + cadena3 + "', '" + cadena4 + "', '" + cadena5 + "', '" + cadena6 + "', '" + cadena7 + "' ")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo correctamente \n", "FELICIDADES!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        //Esto sirve para que despues de ingresar los datos se pongan vacios
        this.txt_clave.setText("");
        this.txt_nombre.setText("");
        this.txt_telefono.setText("");
        this.txt_direccion.setText("");
        this.txt_edad.setText("");
        this.txt_nacion.setText("");
        this.txt_sexo.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        INICIOLOCKERS frm= new INICIOLOCKERS();
        frm.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Register_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nacion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_sexo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
