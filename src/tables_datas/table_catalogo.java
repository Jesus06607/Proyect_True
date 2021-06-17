/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables_datas;

import SQL.Controllers;
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
public class table_catalogo extends javax.swing.JFrame {

    /**
     * Creates new form table_catalogo
     */
    public table_catalogo() {
        initComponents();
        this.setTitle("Sa.H.Lo");
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/icono.png")).getImage());
        this.setResizable(false);
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_catalogo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        table_catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_catalogo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 452, 375);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel1.setText("Catálogo de lockers");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 0, 400, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(table_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table_catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_catalogo;
    // End of variables declaration//GEN-END:variables
}