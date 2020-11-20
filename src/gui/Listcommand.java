/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;



import dao.DaoBook;
import dao.DaoCommande;
import entities.Commande;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Listcommand extends javax.swing.JFrame {

    /**
     * Creates new form Listcommand
     */
    public Listcommand() {
        initComponents();
        try {
            show_commands();
        } catch (SQLException ex) {
            Logger.getLogger(Listcommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//listes commandes
    public void show_commands() throws SQLException {
        DaoCommande d = new DaoCommande();
        ArrayList<Commande> listbook = d.listcommand();
        DefaultTableModel model = (DefaultTableModel) jTable_display_books1.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listbook.size(); i++) {
            row[0] = listbook.get(i).getId();
            row[1] = listbook.get(i).getPrix();
            row[2] = listbook.get(i).getDatecommande();
            row[3] = listbook.get(i).getDetail();
            model.addRow(row);
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
        jTable_display_books = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_display_books1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        comdet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable_display_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITLE", "PRICE", "AUTHOR", "RELEASE_DATE", "IMAGE"
            }
        ));
        jScrollPane1.setViewportView(jTable_display_books);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 11, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_display_books1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRICE", "DATE", "DETAIL"
            }
        ));
        jScrollPane2.setViewportView(jTable_display_books1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 520, 380));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST COMMAND");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 340, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/NSYH.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, 360));

        menu.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(25, 11, 66));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/previous_60px.png"))); // NOI18N
        menu.setText("PREVIOUS");
        menu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        comdet.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        comdet.setForeground(new java.awt.Color(25, 11, 66));
        comdet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/more_60px.png"))); // NOI18N
        comdet.setText("COMMAND DETAILS   ");
        comdet.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        comdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comdetActionPerformed(evt);
            }
        });
        jPanel1.add(comdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 360, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/close_window_48px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Menu2 m = new Menu2();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed
//envoyer les informations d'une commande à l'interface detail commande
    private void comdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comdetActionPerformed
        
        int row = jTable_display_books1.getSelectedRow();
        String value = jTable_display_books1.getModel().getValueAt(row, 0).toString();
        String pricevalue = jTable_display_books1.getModel().getValueAt(row, 1).toString();
        String datevalue = jTable_display_books1.getModel().getValueAt(row, 2).toString();
        String detailvalue = jTable_display_books1.getModel().getValueAt(row, 3).toString();
       
        int idx = Integer.parseInt(value);
        double price = Double.parseDouble(pricevalue);
        Date date1 = java.sql.Date.valueOf(datevalue);
        Commande mc = new Commande();
        mc.setId(idx);
        mc.setDatecommande(date1);
        mc.setDetail(detailvalue);
        mc.setPrix(price);

        Detailcommand m = new Detailcommand();
        m.recuperer(mc);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_comdetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Listcommand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listcommand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listcommand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listcommand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listcommand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comdet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_display_books;
    private javax.swing.JTable jTable_display_books1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
