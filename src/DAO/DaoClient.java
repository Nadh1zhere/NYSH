/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DaoCommande.fMoinsUn;
import static dao.DaoCommande.resbook;
import entities.Client;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
//Classe DaoClient sous le package dao
public class DaoClient {

    //Methode qui permet d'ajouter un client
    public static int addclient(Client c) throws SQLException{
       
      
        Connection conn = null;
        PreparedStatement st = null;
        int result = 0;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            String sql = "insert into client (nom,prenom,email,tel,adresse) values(?,?,?,?,?)";
            st = conn.prepareStatement(sql);

            st.setString(1, c.getNom());
            st.setString(2, c.getPrenom());
            st.setString(3, c.getEmail());
            st.setString(4, c.getTel());
            st.setString(5, c.getAdresse());
            result = st.executeUpdate();
            if (result == 1) {
                System.out.println("INSERTED SUCCESSFULLY");
            } else {
                System.out.println("ERROR CHECK YOUR CODE");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            st.close();
            conn.close();
        }
        return result;
    }
}
