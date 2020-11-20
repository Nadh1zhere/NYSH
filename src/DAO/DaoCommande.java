/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Book;
import entities.Commande;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class DaoCommande {

    public static String fMoinsUn(ArrayList<Book> lb) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < lb.size(); i++) {
            s.append(lb.get(i).getId());
            s.append(",");
        }

        return s.toString();
    }

    public static ArrayList<Book> f(StringBuilder s) throws SQLException {
        ArrayList<Book> lb = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();

        String[] numbers = s.toString().split(",");
        for (String number : numbers) {
            li.add(Integer.valueOf(number));
        }

        for (int i = 0; i < li.size(); i++) {
            lb.add(DaoBook.getmybook(li.get(i)));
        }
        return lb;
    }

    public static int add(ArrayList<Book> lb) throws SQLException {
        Connection conn = null;
        PreparedStatement st = null;
        int result = 0;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            //System.out.println(conn + " Connected successfully");

            String sql = "insert into commande (date_commande,prix,detail,id_client) values(?,?,?,?)";
            st = conn.prepareStatement(sql);

            st.setDate(1, Date.valueOf(LocalDate.now()));
            st.setDouble(2, resbook(lb));
            st.setString(3, fMoinsUn(lb));
            st.setInt(4, 1);
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

    // fonction pour tester l'ajout d'un commande manuellement
   /* public static int add() throws SQLException {
     StringBuilder s = new StringBuilder("1,2,3");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
     System.out.println(conn + " Connected successfully");
     PreparedStatement st = null;
     String sql = "insert into commande (date_commande,prix,detail,id_client) values(?,?,?,?)";
     st = conn.prepareStatement(sql);

     String dates = "2020-11-11";
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
     //convert String to LocalDate
     LocalDate localDate = LocalDate.parse(dates, formatter);
     ArrayList<Book> lb = DaoBook.listbooks();

     Commande c = new Commande(java.sql.Date.valueOf(localDate), 10.3, lb, 1);

     st.setDate(1, Date.valueOf(LocalDate.now()));
     st.setDouble(2, resbook(lb));
     st.setString(3, s.toString());
     st.setInt(4, 1);
     int result = st.executeUpdate();
     if (result == 1) {
     System.out.println("INSERTED SUCCESSFULLY");
     } else {
     System.out.println("ERROR CHECK YOUR CODE");
     }
     st.close();
     conn.close();
     return result;
     }*/
    //methode qui calcule la somme des book séléctionner 
    public static double resbook(ArrayList<Book> b) {
        double resbook = 0.0;
        for (int i = 0; i < b.size(); i++) {
            resbook += b.get(i).getPrice();
        }
        return resbook;
    }

    public static ArrayList<Commande> listcommand() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ArrayList<Commande> listcom = new ArrayList<>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");

            st = conn.createStatement();
            String sql = "select id,date_commande,prix,detail from commande";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Commande newcom = new Commande();
                newcom.setId(rs.getInt("id"));
                newcom.setPrix(Double.parseDouble(rs.getString("prix")));
                LocalDate date = rs.getDate("date_commande").toLocalDate();
                newcom.setDatecommande(java.sql.Date.valueOf(date));
                newcom.setDetail(rs.getString("detail"));
                listcom.add(newcom);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            st.close();
            conn.close();
        }
        return listcom;
    }

    public static void main(String[] args) throws SQLException {
        
    }
}
