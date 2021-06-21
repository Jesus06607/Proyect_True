/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciolockers;

import Administrador.Principal;
import SQL.Controllers;
import java.util.UUID;
import javax.swing.ImageIcon;

/**
 *
 * @author FZVercetti
 */
public class LOCKERS extends javax.swing.JFrame {

    /**
     * Creates new form LOCKERS
     */
    public LOCKERS() {
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

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_fadquisicion = new javax.swing.JTextField();
        txt_clave = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_capacidad = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_estatus = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        btnContraseña = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_lokers.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese la información");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 240, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 60, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Capacidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 60, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de adquisición");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estatus");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 60, 30));
        getContentPane().add(txt_fadquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 110, 30));
        getContentPane().add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 90, 30));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 220, 30));

        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 110, 30));
        getContentPane().add(txt_capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 30));

        txt_color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_colorKeyTyped(evt);
            }
        });
        getContentPane().add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 110, 30));

        txt_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estatusActionPerformed(evt);
            }
        });
        txt_estatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estatusKeyTyped(evt);
            }
        });
        getContentPane().add(txt_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 110, 30));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 130, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/back.png"))); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 130, 40));

        jLabel11.setText("Contraseña:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 90, 30));
        getContentPane().add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, -1));

        btnContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/contraseña_1.png"))); // NOI18N
        btnContraseña.setText("Generar contraseña");
        btnContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(btnContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_lokers.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped

    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped

    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_colorKeyTyped

    }//GEN-LAST:event_txt_colorKeyTyped

    private void txt_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estatusActionPerformed

    private void txt_estatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estatusKeyTyped

    }//GEN-LAST:event_txt_estatusKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8 ;

        cadena1 = txt_clave.getText();
        cadena2 = txt_nombre.getText();
        cadena3 = txt_precio.getText();
        cadena4 = txt_capacidad.getText();
        cadena5 = txt_color.getText();
        cadena6 = txt_estatus.getText();
        cadena7 = txt_fadquisicion.getText();
        cadena8 = txt_contra.getText();

        if (txt_clave.getText().equals("")
                || (txt_nombre.getText().equals("")
                || (txt_precio.getText().equals(""))
                || (txt_capacidad.getText().equals(""))
                || (txt_color.getText().equals(""))
                || (txt_estatus.getText().equals(""))
                || (txt_fadquisicion.getText().equals("")))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        } else if (Controllers.addData(" Lokers ", " clave, Nombre, Precio, Capacidad, Color, Estatus, Fecha_Adq, Contraseña ", " '" + cadena1 + "', '" + cadena2 + "', '" + cadena3 + "', '" + cadena4 + "', '" + cadena5 + "', '" + cadena6 + "', '" + cadena7 + "', '" + cadena8 + "' ")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo correctamente \n", "FELICIDADES!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        //Esto sirve para que despues de ingresar los datos se pongan vacios 
        this.txt_clave.setText("");
        this.txt_nombre.setText("");
        this.txt_precio.setText("");
        this.txt_capacidad.setText("");
        this.txt_color.setText("");
        this.txt_estatus.setText("");
        this.txt_fadquisicion.setText("");
        this.txt_contra.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Separador frm= new Separador();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraseñaActionPerformed
        // generar contraseña alfanumerica
        String clave =  UUID.randomUUID().toString().toUpperCase().substring(0,5);
        //Reflejar la clave en la etiqueta
        txt_contra.setText(clave);
    }//GEN-LAST:event_btnContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(LOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOCKERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOCKERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContraseña;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_capacidad;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_fadquisicion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
