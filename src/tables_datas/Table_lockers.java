/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables_datas;

import SQL.Controllers;
import Administrador.Principal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martin
 */
public class Table_lockers extends javax.swing.JFrame {

    /**
     * Creates new form Table_lockers
     */
    public Table_lockers() {
        initComponents();
           this.setTitle("Sa.H.Lo");
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/icono.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo= new DefaultTableModel();
       
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Color");
        modelo.addColumn("Estatus");
        modelo.addColumn("Fecha de Adq");
        table_locker.setModel(modelo);
        
         String []datos = new String [7];
        
        ResultSet rs2 = Controllers.mostrardatos("Lokers", "clave, Nombre, Precio, Capacidad, Color, Estatus, Fecha_Adq", "1=1");
        try {
            while(rs2.next()){
                
                //System.out.println(rs2.getString("Nombre"));
                
                datos[0]=rs2.getString("clave");
                datos[1]=rs2.getString("Nombre");
                datos[2]=rs2.getString("Precio");
                datos[3]=rs2.getString("Capacidad");
                datos[4]=rs2.getString("Color");
                datos[5]=rs2.getString("Estatus");
                datos[6]=rs2.getString("Fecha_Adq");
                modelo.addRow(datos);
            }
            table_locker.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(data_table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_locker = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbfondo_lockers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 400));
        getContentPane().setLayout(null);

        table_locker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_locker);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 930, 210);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lockers");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 0, 160, 70);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 320, 120, 40);

        lbfondo_lockers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo_table_lockers.jpg"))); // NOI18N
        getContentPane().add(lbfondo_lockers);
        lbfondo_lockers.setBounds(0, 0, 970, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Principal frm= new Principal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Table_lockers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_lockers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_lockers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_lockers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_lockers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbfondo_lockers;
    private javax.swing.JTable table_locker;
    // End of variables declaration//GEN-END:variables
}
