/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciolockers;

import SQL.Conexion;
import SQL.Controllers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author under305
 */
public class NewJFrame extends javax.swing.JFrame {
   
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_sexo = new javax.swing.JTextField();
        txt_clave = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_Buscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 110, 70, 30);

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 83, 15);

        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_contra);
        txt_contra.setBounds(150, 150, 227, 30);

        jLabel4.setText("Estatus");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 200, 54, 15);

        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_status);
        txt_status.setBounds(150, 190, 227, 30);

        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 250, 62, 15);

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono);
        txt_telefono.setBounds(150, 240, 227, 30);

        jLabel6.setText("Correo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 290, 48, 15);

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_correo);
        txt_correo.setBounds(150, 290, 227, 30);

        jLabel7.setText("Sexo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 340, 34, 15);

        jLabel1.setText("Clave");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 80, 38, 15);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 120, 55, 15);

        txt_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_sexo);
        txt_sexo.setBounds(150, 330, 227, 30);

        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });
        getContentPane().add(txt_clave);
        txt_clave.setBounds(150, 70, 227, 30);

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(150, 110, 227, 30);

        btn_update.setText("Actualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(480, 110, 110, 30);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(490, 70, 90, 30);

        txt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Buscar);
        txt_Buscar.setBounds(390, 70, 98, 30);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(13, 10, 250));
        jLabel8.setText("INSERTE LA INFORMACION REQUERIDA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 10, 300, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_rentas.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 670, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7;

        cadena1 = txt_clave.getText();
        cadena2 = txt_nombre.getText();
        cadena3 = txt_contra.getText();
        cadena4 = txt_status.getText();
        cadena5 = txt_telefono.getText();
        cadena6 = txt_correo.getText();
        cadena7 = txt_sexo.getText();

        if (txt_clave.getText().equals("")
                || (txt_nombre.getText().equals("")
                || (txt_contra.getText().equals(""))
                || (txt_status.getText().equals(""))
                || (txt_telefono.getText().equals(""))
                || (txt_correo.getText().equals(""))
                || (txt_sexo.getText().equals("")))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        } else if (Controllers.addData(" Usuarios ", " clave, Nombre, Contraseña, Estatus, Telefono, Correo, Sexo ", " '" + cadena1 + "', '" + cadena2 + "', '" + cadena3 + "', '" + cadena4 + "', '" + cadena5 + "', '" + cadena6 + "', '" + cadena7 + "' ")) {
            System.out.println("Los valores han sido agregados a la base de datos ");
        }
        //Esto sirve para que despues de ingresar los datos se pongan vacios 
        this.txt_clave.setText("");
        this.txt_nombre.setText("");
        this.txt_contra.setText("");
        this.txt_telefono.setText("");
        this.txt_status.setText("");
        this.txt_correo.setText("");
        this.txt_sexo.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexoActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if(Controllers.updateData("Usuarios", " Nombre='" +txt_nombre.getText()+ "', clave='"+txt_clave.getText()+"', Contraseña='"+txt_contra.getText()+"', Estatus='"+txt_status.getText()+"', Telefono='"+txt_telefono.getText()+"', Correo='"+txt_correo.getText()+"', Sexo='"+txt_sexo.getText()+"'", "clave='"+txt_clave.getText()+"'")){
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
        }else{
            JOptionPane.showMessageDialog(null, "Error en la Actualizacion");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Apartamos un contador para ver si hay resultados
        int contador=0;
        String clave="", nombre="", contra="", estatus="", telefono="", correo="", sexo="";
        //A partir de aquí, después de introducir el código, checamos la existencia en la base de datos con el controller.
        ResultSet rs1 = Controllers.mostrardatos(" Usuarios ", " clave, Nombre, Contraseña, Estatus, Telefono, Correo, Sexo ", " clave = '"+txt_Buscar.getText()+"'" );
        try {
            while(rs1.next()){
                contador++;
                clave       = rs1.getString("clave");
                nombre      = rs1.getString("Nombre");
                contra      = rs1.getString("Contraseña");
                estatus     = rs1.getString("Estatus");
                telefono    = rs1.getString("Telefono");
                correo      = rs1.getString("Correo");
                sexo        = rs1.getString("Sexo");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(contador>0){
            txt_clave.setText(clave);
            txt_nombre.setText(nombre);
            txt_contra.setText(contra);
            txt_status.setText(estatus);
            txt_telefono.setText(telefono);
            txt_correo.setText(correo);
            txt_sexo.setText(sexo);
        }else{
            System.out.println("No hay");
        }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_sexo;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
