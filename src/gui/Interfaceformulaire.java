/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import dao.DaoBook;
import entities.Book;
import java.awt.event.ActionEvent;
import java.io.File;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Lenovo
 */
public class Interfaceformulaire extends javax.swing.JFrame {
    int result;
    String pathimg;
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
        datechooser = new com.toedter.calendar.JDateChooser();
        choosefile = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Buttonajouter = new javax.swing.JButton();
        title1 = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 11, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 230, 30));

        choosefile.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        choosefile.setForeground(new java.awt.Color(25, 11, 66));
        choosefile.setText("Choose file");
        choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosefileActionPerformed(evt);
            }
        });
        jPanel1.add(choosefile, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 140, 30));

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
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 200, 60));

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
        jPanel1.add(Buttonajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 200, 60));

        title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title1.setOpaque(false);
        title1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                title1ActionPerformed(evt);
            }
        });
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 230, 40));

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

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Release Date:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 330, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ADD A BOOK");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Image :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 260, 40));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 450, 470));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/NSYH.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 390, 410));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 500));

        setSize(new java.awt.Dimension(894, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed
//Ajout livre
    private void ButtonajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonajouterActionPerformed
        // TODO add your handling code here:
        
    
        // TODO add your handling code here:
        
        String titre = title1.getText();
        String auteur = author.getText();
        String prixs = price.getText();
        double prix = Double.parseDouble(prixs);
        
        
        Date selectedDate = (Date) datechooser.getDate();
        
        
        
        DateFormat osLocalizedDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String mydate = osLocalizedDateFormat.format(selectedDate);
        System.out.println("---------");
        System.out.println(mydate);
        
        System.out.println(mydate);
        //creating daobook instance
        DaoBook dbook = new DaoBook();
        // creating a book
        Book newbook = new Book();
        //setting book's proprities
        newbook.setTitle(titre);
        newbook.setAuthor(auteur);
        newbook.setPrice(prix);
     
        //convert String to LocalDate
        
        
        newbook.setReleaseDate(LocalDate.parse(mydate));
        newbook.setImage(pathimg);
      
            try {
                // calling daobook

                result=dbook.addBookwithimage(newbook);
            } catch (Exception ex) {
                Logger.getLogger(Interfaceformulaire.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(result==1){
                JOptionPane.showMessageDialog(null,"Your book is added!");
                Menu field = new Menu();
                field.setVisible(true);
                setVisible(false);
            }else{
                 JOptionPane.showMessageDialog(null,"Error please check your information!");
            }
        
        
        
    
    }//GEN-LAST:event_ButtonajouterActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
   
        author.setText("");
        price.setText("");
        
        title1.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void jLabel2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentMoved

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void title1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_title1ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosefileActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","jpeg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if clicking save
        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            pathimg = path;
               //if the user click on save
        }else if(result ==JFileChooser.CANCEL_OPTION){
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
    public static void main() {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaceformulaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonajouter;
    private javax.swing.JTextField author;
    private javax.swing.JButton choosefile;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField price;
    private javax.swing.JButton reset;
    private javax.swing.JTextField title1;
    // End of variables declaration//GEN-END:variables
}