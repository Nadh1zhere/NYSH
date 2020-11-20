/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.time.*;
import java.util.*;

/**
 *
 * @author Lenovo
 */
//Class DaoBook sous le package dao
public class DaoBook {

    //Methode qui permet de modifier un livre 
    public void updatebook(Book book) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        PreparedStatement st = null;

        String sql = "UPDATE book SET title = ?,price = ?,author = ?,releaseDate = ? ,image= ? where id= ?";
        st = conn.prepareStatement(sql);
        st.setString(1, book.getTitle());
        st.setDouble(2, book.getPrice());
        st.setString(3, book.getAuthor());
        st.setDate(4, java.sql.Date.valueOf(book.getReleaseDate()));
        st.setBytes(5, book.getImg());
        st.setInt(6, book.getId());

        int result = st.executeUpdate();
        if (result == 1) {
            System.out.println("Data has been modified Successfully");
        } else {
            System.out.println("failed to update data ! error!");
        }
        st.close();
        conn.close();
    }

    //Methode qui permet de supprimer un livre
    public int deletebook(int id) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        PreparedStatement st = null;
        String sql = "delete from book where id = ? ";
        st = conn.prepareStatement(sql);
        st.setInt(1, id);
        int result = st.executeUpdate();

        st.close();
        conn.close();
        return result;
    }

    //Methode qui permet d'ajouter un livre sans image
    public int addBook(Book book) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        System.out.println(conn + " Connected successfully");

        PreparedStatement st = null;
        String sql = "insert into book (title,price,author,releaseDate) values(?,?,?,?)";
        st = conn.prepareStatement(sql);
        st.setString(1, book.getTitle());
        st.setDouble(2, book.getPrice());
        st.setString(3, book.getAuthor());
        st.setDate(4, java.sql.Date.valueOf(book.getReleaseDate()));
        int result = st.executeUpdate();
        if (result == 1) {
            System.out.println("INSERTED SUCCESSFULLY");
        } else {
            System.out.println("ERROR CHECK YOUR CODE");
        }
        st.close();
        conn.close();
        return result;
    }

    //Methode qui permet d'ajouter un live avec image
    public int addBookwithimage(Book book) throws SQLException, FileNotFoundException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        System.out.println(conn + " Connected successfully");

        PreparedStatement st = null;
        String sql = "insert into book (title,price,author,releaseDate,image) values(?,?,?,?,?)";
        st = conn.prepareStatement(sql);
        st.setString(1, book.getTitle());
        st.setDouble(2, book.getPrice());
        st.setString(3, book.getAuthor());
        st.setDate(4, java.sql.Date.valueOf(book.getReleaseDate()));
        String pathimg = book.getImage();
        InputStream in = new FileInputStream(pathimg);
        st.setBlob(5, in);
        int result = st.executeUpdate();
        if (result == 1) {
            System.out.println("INSERTED SUCCESSFULLY");
        } else {
            System.out.println("ERROR CHECK YOUR CODE");
        }
        st.close();
        conn.close();
        return result;
    }

    //Methode qui permet de lister les livres
    public static ArrayList<Book> listbooks() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");

        Statement st = conn.createStatement();
        String sql = "select * from book";
        ResultSet rs = st.executeQuery(sql);

        ArrayList<Book> listbooks = new ArrayList();
        while (rs.next()) {
            Book newbook = new Book();
            newbook.setId(rs.getInt("id"));
            newbook.setTitle(rs.getString("title"));
            newbook.setPrice(rs.getDouble("price"));
            newbook.setAuthor(rs.getString("author"));
            LocalDate date = rs.getDate("releaseDate").toLocalDate();
            newbook.setReleaseDate(date);
            newbook.setImg(rs.getBytes("image"));
            listbooks.add(newbook);
        }
        st.close();
        conn.close();
        return listbooks;
    }

    //Methode qui permet de retourner les attributs d'un livre à partir de son id (PK)
    public static Book getmybook(int id) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        Book newbook = new Book();
        Statement st = conn.createStatement();
        String sql = "select * from book where id= " + id;
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            newbook.setId(rs.getInt("id"));
            newbook.setTitle(rs.getString("title"));
            newbook.setPrice(rs.getDouble("price"));
            newbook.setAuthor(rs.getString("author"));
            LocalDate date = rs.getDate("releaseDate").toLocalDate();
            newbook.setReleaseDate(date);
            newbook.setImg(rs.getBytes("image"));
        }
        return newbook;
    }

}
