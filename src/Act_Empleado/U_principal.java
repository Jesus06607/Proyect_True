/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act_Empleado;

import SQL.Controllers;
import iniciolockers.LOGIN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import tables_datas.data_table;

/**
 *
 * @author martin
 */
public class U_principal extends javax.swing.JFrame {

    /**
     * Creates new form U_principal
     */
    public U_principal() {
        initComponents();
        Datas();
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
        txt_Lugar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_catalogo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("Catalogo de lockers");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(279, 16, 250, 30);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("Lugar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 120, 60, 32);
        getContentPane().add(txt_Lugar);
        txt_Lugar.setBounds(210, 120, 140, 30);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad de lockers");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 149, 30);
        getContentPane().add(txt_cantidad);
        txt_cantidad.setBounds(210, 160, 140, 30);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setText("Inserte el lugar guardado para asignarle una cantidad de lockers   ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 780, 36);

        table_catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_catalogo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 120, 300, 100);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 210, 120, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/back.png"))); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 212, 97, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_U_Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 790, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void Datas(){
      //Tabla de datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id_Lugar");
        modelo.addColumn("Cantidad");
        table_catalogo.setModel(modelo);
        
        String[] datos = new String[2];

        ResultSet rs2 = Controllers.mostrardatos("Catalogo", "id_Lugar, cantidad", "1=1");
        try {
            
            while (rs2.next()) {
                datos[0] = rs2.getString("id_Lugar");
                datos[1] = rs2.getString("Cantidad");
                modelo.addRow(datos);
            }
            table_catalogo.setModel(modelo);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(data_table.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena1, cadena2;
        cadena1 = txt_Lugar.getText();
        cadena2 = txt_cantidad.getText();

        if (Controllers.addData(" Catalogo ", "id_Lugar, cantidad", " '" + cadena1 + "', '" + cadena2 + "' ")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo correctamente \n", "FELICIDADES!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
       
        Datas();
        }
      
        this.txt_Lugar.setText("");
        this.txt_cantidad.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Empleado frm= new Empleado();
        frm.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(U_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_catalogo;
    private javax.swing.JTextField txt_Lugar;
    private javax.swing.JTextField txt_cantidad;
    // End of variables declaration//GEN-END:variables
}
