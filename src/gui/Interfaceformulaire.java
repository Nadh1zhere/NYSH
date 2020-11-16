/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import DAO.DaoBook;
import entities.Book;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Interfaceformulaire extends javax.swing.JFrame {
    int result;
    /**
     * Creates new form Interfaceformulaire
     */
    public Interfaceformulaire() {
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
        menu = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Buttonajouter = new javax.swing.JButton();
        author = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 11, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(25, 11, 66));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/home_60px.png"))); // NOI18N
        menu.setText("MENU");
        menu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        reset.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(25, 11, 66));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/sync_50px.png"))); // NOI18N
        reset.setText("Reset      ");
        reset.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 200, 60));

        Buttonajouter.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Buttonajouter.setForeground(new java.awt.Color(25, 11, 66));
        Buttonajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/plus_60px.png"))); // NOI18N
        Buttonajouter.setText("Add Book");
        Buttonajouter.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Buttonajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonajouterActionPerformed(evt);
            }
        });
        jPanel1.add(Buttonajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 200, 60));

        author.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        author.setOpaque(false);
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 230, 40));

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setOpaque(false);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 230, 40));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date.setOpaque(false);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 230, 40));

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title.setOpaque(false);
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 230, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ADD A BOOK");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Release Date:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 330, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 80, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 60, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Title :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 60, 40));

        jLabel2.setForeground(new java.awt.Color(25, 11, 66));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setAutoscrolls(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 600));
        jLabel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabel2ComponentMoved(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 400, 470));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/NSYH.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void ButtonajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonajouterActionPerformed
        // TODO add your handling code here:
        
        String titre = title.getText();
        String auteur = author.getText();
        String prixs = price.getText();
        double prix = Double.parseDouble(prixs);
        String dates = date.getText();

        //creating daobook instance
        DaoBook dbook = new DaoBook();
        // creating a book
        Book newbook = new Book();
        //setting book's proprities
        newbook.setTitle(titre);
        newbook.setAuthor(auteur);
        newbook.setPrice(prix);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(dates, formatter);
        newbook.setReleaseDate(localDate);
        
        
        try {
            // calling daobook
            
            result=dbook.addBook(newbook);
            if(result==1){
                JOptionPane.showMessageDialog(null,"Your book is added!");
                Menu field = new Menu();
                field.setVisible(true);
                setVisible(false);
            }else{
                 JOptionPane.showMessageDialog(null,"Error please check your information!");
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_ButtonajouterActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        title.setText("");
        author.setText("");
        price.setText("");
        date.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
         Menu m = new Menu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void jLabel2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentMoved

    /**
     * @param args the command line arguments
     */
    public static void runme() {
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
            java.util.logging.Logger.getLogger(Interfaceformulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaceformulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaceformulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaceformulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaceformulaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonajouter;
    private javax.swing.JTextField author;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField price;
    private javax.swing.JButton reset;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
