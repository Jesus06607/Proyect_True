/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import SQL.Controllers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tables_datas.Table_Lugares;
import tables_datas.Table_lockers;

/**
 *
 * @author martin
 */
public class Mod_Locker extends javax.swing.JFrame {

    /**
     * Creates new form Mod_Locker
     */
    public Mod_Locker() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_Buscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnContraseña = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("       Informacion de lockers");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 10, 340, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 97, 60, 23);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 140, 70, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 180, 70, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Capacidad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 220, 100, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 260, 60, 20);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Adquisición");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 340, 180, 20);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estatus");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 300, 80, 20);
        getContentPane().add(txt_fadquisicion);
        txt_fadquisicion.setBounds(209, 335, 140, 30);
        getContentPane().add(txt_clave);
        txt_clave.setBounds(209, 95, 90, 30);

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(210, 140, 220, 30);

        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_precio);
        txt_precio.setBounds(209, 175, 130, 30);
        getContentPane().add(txt_capacidad);
        txt_capacidad.setBounds(209, 215, 140, 30);

        txt_color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_colorKeyTyped(evt);
            }
        });
        getContentPane().add(txt_color);
        txt_color.setBounds(209, 255, 140, 30);

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
        getContentPane().add(txt_estatus);
        txt_estatus.setBounds(209, 295, 140, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opciones"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/insert.png"))); // NOI18N
        btn_guardar.setText("Insertar mas");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/back.png"))); // NOI18N
        jButton2.setText("Ir al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 40));

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/recarga.png"))); // NOI18N
        btn_update.setText("Actualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 40));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search12.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, 40));
        jPanel1.add(txt_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/search_much.png"))); // NOI18N
        jButton1.setText("Consultar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 40));

        btnContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/contraseña_1.png"))); // NOI18N
        btnContraseña.setText("Generar contraseña");
        btnContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, 90, 290, 340);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 370, 110, 30);
        getContentPane().add(txt_contra);
        txt_contra.setBounds(210, 370, 140, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_mod_locker.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 890, 480);

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

        String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7;

        cadena1 = txt_clave.getText();
        cadena2 = txt_nombre.getText();
        cadena3 = txt_precio.getText();
        cadena4 = txt_capacidad.getText();
        cadena5 = txt_color.getText();
        cadena6 = txt_estatus.getText();
        cadena7 = txt_fadquisicion.getText();

        if (txt_clave.getText().equals("")
            || (txt_nombre.getText().equals("")
                || (txt_precio.getText().equals(""))
                || (txt_capacidad.getText().equals(""))
                || (txt_color.getText().equals(""))
                || (txt_estatus.getText().equals(""))
                || (txt_fadquisicion.getText().equals("")))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        } else if (Controllers.addData(" Lokers ", " clave, Nombre, Precio, Capacidad, Color, Estatus, Fecha_Adq ", " '" + cadena1 + "', '" + cadena2 + "', '" + cadena3 + "', '" + cadena4 + "', '" + cadena5 + "', '" + cadena6 + "', '" + cadena7 + "' ")) {
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
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal frm= new Principal();
            frm.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
          //Apartamos un contador para ver si hay resultados
        int contador=0;
        String clave="", nombre="", precio="", capacidad="", color="", estatus="", fadquisicion="", contraseña="";
        //A partir de aquí, después de introducir el código, checamos la existencia en la base de datos con el controller.
        ResultSet rs1 = Controllers.mostrardatos(" Lokers ", " clave, Nombre, Precio, Capacidad, Color, Estatus, Fecha_Adq, Contraseña  ", " clave = '"+txt_Buscar.getText()+"'" );
        try {
            while(rs1.next()){
                contador++;
                clave       = rs1.getString("clave");
                nombre      = rs1.getString("Nombre");
                precio      = rs1.getString("Precio");
                capacidad     = rs1.getString("Capacidad");
                color    = rs1.getString("Color");
                estatus      = rs1.getString("Estatus");
                fadquisicion        = rs1.getString("Fecha_Adq");
                contraseña = rs1.getString("Contraseña");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Mod_Locker.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(contador>0){
            txt_clave.setText(clave);
            txt_nombre.setText(nombre);
            txt_precio.setText(precio);
            txt_capacidad.setText(capacidad);
            txt_color.setText(color);
            txt_estatus.setText(estatus);
            txt_fadquisicion.setText(fadquisicion);
            txt_contra.setText(contraseña);
        }else{
            System.out.println("No hay");
            JOptionPane.showMessageDialog(null, "No se encontro");

        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       if(Controllers.updateData("Lokers", " clave='" +txt_clave.getText()+ "', Nombre='"+txt_nombre.getText()+"', Precio='"+txt_precio.getText()+"', Capacidad='"+txt_capacidad.getText()+"', Color='"+txt_color.getText()+"', Estatus='"+txt_estatus.getText()+"', Fecha_Adq='"+txt_fadquisicion.getText()+"', Contraseña='"+txt_contra.getText()+"'", "clave='"+txt_clave.getText()+"'")){
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
        }else{
            JOptionPane.showMessageDialog(null, "Error en la Actualizacion");
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Table_lockers frm= new Table_lockers();
            frm.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mod_Locker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mod_Locker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mod_Locker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mod_Locker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mod_Locker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContraseña;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Buscar;
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
