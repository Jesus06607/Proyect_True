/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import SQL.Controllers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tables_datas.data_table;

/**
 *
 * @author martin
 */
public class client extends javax.swing.JFrame {

    /**
     * Creates new form client
     */
    public client() {
        initComponents();
        Lugares();
        Lockers();
        Empleado();
        //variables de tablas 
        tb1.setVisible(false);
        tb2.setVisible(false);
        tb3.setVisible(false);
        Lb1.setVisible(false);
        Lb2.setVisible(false);
        Lb3.setVisible(false);
                
                
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
        btn_Reservar = new javax.swing.JButton();
        txt_empleado = new javax.swing.JTextField();
        txt_entrada = new javax.swing.JTextField();
        txt_salida = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Lb1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        Lb2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        TG1 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        Lb3 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        txt_lugar = new javax.swing.JTextField();
        txt_locker = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Lugar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 130, 80, 40);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Locker:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 180, 90, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Ingrese su clave:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 130, 30);

        jLabel4.setText("Fecha de entrada:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 110, 150, 30);

        jLabel5.setText("Fecha de salida:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 150, 150, 30);

        btn_Reservar.setText("Reservar");
        btn_Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReservarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Reservar);
        btn_Reservar.setBounds(660, 110, 100, 40);
        getContentPane().add(txt_empleado);
        txt_empleado.setBounds(200, 220, 120, 34);
        getContentPane().add(txt_entrada);
        txt_entrada.setBounds(500, 110, 110, 34);
        getContentPane().add(txt_salida);
        txt_salida.setBounds(500, 150, 110, 34);
        getContentPane().add(txt_precio);
        txt_precio.setBounds(500, 190, 110, 34);

        jLabel6.setText("Precio de locker: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 190, 150, 30);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("Seleccione el empleado:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 220, 200, 30);

        jButton2.setText("Cancelar");
        getContentPane().add(jButton2);
        jButton2.setBounds(660, 150, 100, 40);

        jButton3.setText("Salir");
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 190, 100, 30);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel8.setText("Reservaciones de lockers");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 10, 280, 40);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("Realize su reservacion:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 60, 240, 30);

        Lb1.setText("Catalogo de lugares ");
        getContentPane().add(Lb1);
        Lb1.setBounds(30, 300, 160, 17);

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 250, 110);

        Lb2.setText("Catalogo  de lockers");
        getContentPane().add(Lb2);
        Lb2.setBounds(370, 300, 150, 20);

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tb2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(290, 320, 300, 110);

        TG1.setText("Ver  menu de informacion:");
        TG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TG1ActionPerformed(evt);
            }
        });
        getContentPane().add(TG1);
        TG1.setBounds(330, 250, 210, 40);

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tb3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(610, 320, 180, 110);

        Lb3.setText("Catalogo de empleados");
        getContentPane().add(Lb3);
        Lb3.setBounds(610, 300, 190, 17);
        getContentPane().add(txt_clave);
        txt_clave.setBounds(200, 100, 120, 34);
        getContentPane().add(txt_lugar);
        txt_lugar.setBounds(200, 140, 120, 34);
        getContentPane().add(txt_locker);
        txt_locker.setBounds(200, 180, 120, 34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void Lugares(){
              //Tabla de datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("clave");
        modelo.addColumn("Nombre");
        tb1.setModel(modelo);
        
        String[] datos = new String[2];
        
        ResultSet rs2 = Controllers.mostrardatos("Lugares", "clave, Nombre", "1=1");
        try {
            
            while (rs2.next()) {
                datos[0] = rs2.getString("clave");
                datos[1] = rs2.getString("Nombre");
                modelo.addRow(datos);
            }
            tb1.setModel(modelo);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(data_table.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    void Lockers(){
          //Tabla de datos
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Capacidad");
        tb2.setModel(modelo);
        
        String[] datos = new String[4];
    
        ResultSet rs2 = Controllers.mostrardatos("Lokers", "clave, Nombre, Precio, Capacidad", "1=1");
        try {
            
            while (rs2.next()) {
                datos[0] = rs2.getString("clave");
                datos[1] = rs2.getString("Nombre");
                datos[2] = rs2.getString("Precio");
                datos[3] = rs2.getString("Capacidad");
                modelo.addRow(datos);
            }
            tb2.setModel(modelo);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(data_table.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    void Empleado(){
      DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("clave");
        modelo.addColumn("Nombre");
        tb3.setModel(modelo);
        
        String[] datos = new String[2];
        
        ResultSet rs2 = Controllers.mostrardatos("Usuarios", "clave, Nombre", "1=1");
        try {
            
            while (rs2.next()) {
                datos[0] = rs2.getString("clave");
                datos[1] = rs2.getString("Nombre");
                modelo.addRow(datos);
            }
            tb3.setModel(modelo);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(data_table.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
    }
    
    private void TG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TG1ActionPerformed

        if (TG1.isSelected()) {
            tb1.setVisible(true);
            tb2.setVisible(true);
            tb3.setVisible(true);
            Lb1.setVisible(true);
            Lb2.setVisible(true);
            Lb3.setVisible(true);
        } else {
            tb1.setVisible(false);
            tb2.setVisible(false);
            tb3.setVisible(false);
            Lb1.setVisible(false);
            Lb2.setVisible(false);
            Lb3.setVisible(false);
        }
    }//GEN-LAST:event_TG1ActionPerformed

    private void btn_ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReservarActionPerformed
        String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6, cadena7;
        
        cadena1 = txt_clave.getText();
        cadena2 = txt_lugar.getText();
        cadena3 = txt_locker.getText();
        cadena4 = txt_empleado.getText();
        cadena5 = txt_entrada.getText();
        cadena6 = txt_salida.getText();
        cadena7 = txt_precio.getText();
        
        
        if (txt_clave.getText().equals("")
            || (txt_lugar.getText().equals("")
                || (txt_locker.getText().equals(""))
                || (txt_empleado.getText().equals(""))
                || (txt_entrada.getText().equals(""))
                || (txt_salida.getText().equals(""))
                || (txt_precio.getText().equals("")))) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_lugar.requestFocus();
        } else if (Controllers.addData(" Reservacion ", " Clave_turist, Clave_lugar, Clave_locker, Clave_Users, F_Entrada, F_Salida, P_Locker", " '" + cadena1 + "', '" + cadena2 + "', '" + cadena3 + "', '" + cadena4 + "', '" + cadena5 + "', '" + cadena6 + "', '" + cadena7 + "' ")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Su reservacion esta lista \n", "FELICIDADES!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
       
        this.txt_clave.setText("");
        this.txt_lugar.setText("");
        this.txt_locker.setText("");
        this.txt_empleado.setText("");
        this.txt_entrada.setText("");
        this.txt_salida.setText("");
        this.txt_precio.setText("");
        
    }//GEN-LAST:event_btn_ReservarActionPerformed

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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb1;
    private javax.swing.JLabel Lb2;
    private javax.swing.JLabel Lb3;
    private javax.swing.JToggleButton TG1;
    private javax.swing.JButton btn_Reservar;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_empleado;
    private javax.swing.JTextField txt_entrada;
    private javax.swing.JTextField txt_locker;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_salida;
    // End of variables declaration//GEN-END:variables
}