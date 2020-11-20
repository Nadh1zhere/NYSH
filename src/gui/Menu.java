/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Lenovo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listbook = new javax.swing.JButton();
        addbook1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 11, 66));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 11, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 310, 63));

        listbook.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        listbook.setForeground(new java.awt.Color(25, 11, 66));
        listbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/menu_squared_60px.png"))); // NOI18N
        listbook.setText("LIST ALL BOOKS ");
        listbook.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        listbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbookActionPerformed(evt);
            }
        });
        jPanel1.add(listbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 360, 100));

        addbook1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        addbook1.setForeground(new java.awt.Color(25, 11, 66));
        addbook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/plus_60px.png"))); // NOI18N
        addbook1.setText("ADD A BOOK     ");
        addbook1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addbook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbook1ActionPerformed(evt);
            }
        });
        jPanel1.add(addbook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 360, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/NSYH.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 410, 410));

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/close_window_48px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbook1ActionPerformed
        // TODO add your handling code here:
        Interfaceformulaire field = new Interfaceformulaire();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addbook1ActionPerformed

    private void listbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbookActionPerformed
        // TODO add your handling code here:
        /*DaoBook d = new DaoBook();
       Listbooks ls = new Listbooks();
        try {
            ls.show_books(d.listbooks());
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        Listbooks l = new Listbooks();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_listbookActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        MainMenu m = new  MainMenu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void runme() {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbook1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listbook;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}