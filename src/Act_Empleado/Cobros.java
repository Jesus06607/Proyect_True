/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_Empleado;

import SQL.Controllers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author martin
 */
public class Cobros extends javax.swing.JFrame {

    /**
     * Creates new form Cobros
     */
    public Cobros() {
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

        Tipos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_clave = new javax.swing.JTextField();
        txt_Entrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Salida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb_Horas = new javax.swing.JRadioButton();
        rb_Dias = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_Total = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 410));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 10, 255));
        jLabel1.setText("Cobros de hospedaje");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 20, 210, 30);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 80, 80, 30);

        txt_clave.setEditable(false);
        getContentPane().add(txt_clave);
        txt_clave.setBounds(200, 120, 90, 30);

        txt_Entrada.setEditable(false);
        getContentPane().add(txt_Entrada);
        txt_Entrada.setBounds(200, 160, 90, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(125, 43, 109));
        jLabel3.setText("Clave del nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 180, 30);

        txt_Salida.setEditable(false);
        getContentPane().add(txt_Salida);
        txt_Salida.setBounds(200, 200, 90, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 43, 109));
        jLabel4.setText("Fecha de salida:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 200, 150, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 43, 109));
        jLabel5.setText("Precio de Locker:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 240, 160, 30);

        txt_Precio.setEditable(false);
        getContentPane().add(txt_Precio);
        txt_Precio.setBounds(200, 240, 90, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(125, 43, 109));
        jLabel11.setText("Fecha de entrada:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 160, 160, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cobros"));
        jPanel1.setLayout(null);

        Tipos.add(rb_Horas);
        rb_Horas.setForeground(new java.awt.Color(255, 110, 0));
        rb_Horas.setText("Por horas");
        rb_Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_HorasActionPerformed(evt);
            }
        });
        jPanel1.add(rb_Horas);
        rb_Horas.setBounds(20, 30, 110, 30);

        Tipos.add(rb_Dias);
        rb_Dias.setForeground(new java.awt.Color(255, 76, 0));
        rb_Dias.setText("Por dias");
        rb_Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_DiasActionPerformed(evt);
            }
        });
        jPanel1.add(rb_Dias);
        rb_Dias.setBounds(130, 30, 100, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 1, 97));
        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 90, 30);

        txt_cantidad.setText("0");
        jPanel1.add(txt_cantidad);
        txt_cantidad.setBounds(90, 70, 90, 30);

        jButton2.setText("Total:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 110, 70, 27);

        txt_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TotalActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Total);
        txt_Total.setBounds(90, 110, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 180, 250, 150);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(12, 6, 98));
        jLabel6.setText("Costos de lockers");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 10, 140, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 17, 154));
        jLabel7.setText("Por  hora: $80.00");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 40, 140, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 8, 131));
        jLabel8.setText("Por dia:    $1200.00");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 70, 160, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(470, 60, 220, 110);
        getContentPane().add(txt_Buscar);
        txt_Buscar.setBounds(200, 80, 90, 34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int contador=0;
        String clave="", entrada="", salida="", precio="";
        
                ResultSet rs1 = Controllers.mostrardatos(" Reservacion ", " Clave_turist, F_Entrada, F_Salida, P_Locker ", " Clave_turist = '"+txt_Buscar.getText()+"'" );
                    try{
               while(rs1.next()){
                   contador++;
                   clave       = rs1.getString("Clave_turist");
                   entrada     = rs1.getString("F_Entrada");
                   salida       = rs1.getString("F_Salida");
                   precio       = rs1.getString("P_Locker");
               }
         
         } catch (SQLException ex) {
            Logger.getLogger(Cobros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if(contador>0){
             txt_clave.setText(clave);
             txt_Entrada.setText(entrada);
             txt_Salida.setText(salida);
             txt_Precio.setText(precio);
         }
        else{
            System.out.println("No hay");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rb_HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_HorasActionPerformed

        
        
    }//GEN-LAST:event_rb_HorasActionPerformed

    private void rb_DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_DiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_DiasActionPerformed

    private void txt_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String n1 =txt_Precio.getText();
        String n2 =txt_cantidad.getText();
        
        
        if(rb_Horas.isSelected()){
        
        int c=80;
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int r = c*b;
        r= r+a;
         txt_Total.setText("Su total es: "+r);
        
         JOptionPane.showMessageDialog(null, "Su total a pagar es: "+r);
        }else 
            if(rb_Dias.isSelected()){
                int c=1200;
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int r = c*b;
                r= r+a;
                 txt_Total.setText("Su total es: "+r);
        
         JOptionPane.showMessageDialog(null, "Su total a pagar es: "+r);
        }
        
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
            java.util.logging.Logger.getLogger(Cobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cobros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Tipos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rb_Dias;
    private javax.swing.JRadioButton rb_Horas;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Entrada;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Salida;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_clave;
    // End of variables declaration//GEN-END:variables
}
