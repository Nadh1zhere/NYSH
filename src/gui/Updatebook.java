/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DaoBook;
import entities.Book;
import java.io.File;

import java.io.IOException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class Updatebook extends javax.swing.JFrame {

    String pathimg;
    byte[] bytes;

    /**
     * Creates new form Updatebook
     */
    public Updatebook() {
        initComponents();
        
        id.setEditable(false);
        JOptionPane.showMessageDialog(null, "Please Select a file before you update!");
    }

//récupérer les données d'un livre
    public void recuperer(Book b) {
        id.setText(String.valueOf(b.getId()));
        title.setText(b.getTitle());
        price.setText(String.valueOf(b.getPrice()));
        author.setText(b.getAuthor());
        datechooser.setDate(java.sql.Date.valueOf(b.getReleaseDate()));

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
        jPanel2 = new javax.swing.JPanel();
        choosefile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        listbooks = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 11, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 11, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choosefile.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        choosefile.setForeground(new java.awt.Color(25, 11, 66));
        choosefile.setText("Choose file");
        choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosefileActionPerformed(evt);
            }
        });
        jPanel2.add(choosefile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("IMAGE:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("TITLE :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PRICE :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("AUTHOR :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 30));

        reset.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(25, 11, 66));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/sync_50px.png"))); // NOI18N
        reset.setText("RESET     ");
        reset.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 220, 60));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, 30));

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, 30));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 160, 30));

        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jPanel2.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, 30));

        update.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        update.setForeground(new java.awt.Color(25, 11, 66));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/edit_property_50px.png"))); // NOI18N
        update.setText("UPDATE   ");
        update.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 220, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("RELEASE DATE:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));
        jPanel2.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 340, 430));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UPDATE BOOK");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 340, 30));

        listbooks.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        listbooks.setForeground(new java.awt.Color(25, 11, 66));
        listbooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/previous_60px.png"))); // NOI18N
        listbooks.setText("PREVIOUS");
        listbooks.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        listbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbooksActionPerformed(evt);
            }
        });
        jPanel1.add(listbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 60));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/NSYH.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 430));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/close_window_48px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 510));

        setSize(new java.awt.Dimension(829, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbooksActionPerformed
        // TODO add your handling code here:
        Listbooks l = new Listbooks();
        l.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_listbooksActionPerformed
//Modification
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        try {
            
            // TODO add your handling code here:
            Book b = new Book();

            b.setTitle(title.getText());
            b.setPrice(Double.parseDouble(price.getText()));
            b.setAuthor(author.getText());

            Date selectedDate = (Date) datechooser.getDate();

            DateFormat osLocalizedDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String mydate = osLocalizedDateFormat.format(selectedDate);

            b.setReleaseDate(LocalDate.parse(mydate));
            b.setId(Integer.parseInt(id.getText()));

            try {
                bytes = Files.readAllBytes(Paths.get(pathimg));

            } catch (IOException ex) {
                Logger.getLogger(Updatebook.class.getName()).log(Level.SEVERE, null, ex);

            }

            b.setImg(bytes);

            DaoBook d = new DaoBook();
            d.updatebook(b);

            JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY");
        } catch (SQLException ex) {
            Logger.getLogger(Updatebook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Listbooks l = new Listbooks();
        l.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_updateActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
        id.setEditable(false);
    }//GEN-LAST:event_idActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        id.setText("");
        title.setText("");
        price.setText("");
        author.setText("");

    }//GEN-LAST:event_resetActionPerformed

//Image

    private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosefileActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "jpeg", "png", "gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if clicking save
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            pathimg = path;
            //if the user click on save
        } else if (result == JFileChooser.CANCEL_OPTION) {

            System.out.println("NO FILE SELECTED");
        }
    }//GEN-LAST:event_choosefileActionPerformed


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
            java.util.logging.Logger.getLogger(Updatebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updatebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updatebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updatebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updatebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JButton choosefile;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listbooks;
    private javax.swing.JTextField price;
    private javax.swing.JButton reset;
    private javax.swing.JTextField title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
