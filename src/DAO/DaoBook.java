/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.time.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DaoBook {

    public void updatebook(Book book) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        PreparedStatement st = null;
        
        String sql = "UPDATE book SET title = ?,price = ?,author = ?,releaseDate = ? where id= ?";
        st = conn.prepareStatement(sql);
        st.setString(1, book.getTitle());
        st.setDouble(2, book.getPrice());
        st.setString(3, book.getAuthor());
        st.setDate(4, java.sql.Date.valueOf(book.getReleaseDate()));
        st.setInt(5, book.getId());
        int result = st.executeUpdate();
        if (result == 1) {
            System.out.println("Data has been modified Successfully");
        } else {
            System.out.println("failed to update data ! error!");
        }
        st.close();
        conn.close();
    }
    public int deletebook(int id) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        PreparedStatement st = null;
        String sql = "delete from book where id = ? ";
        st = conn.prepareStatement(sql);
        st.setInt(1,id);
        int result = st.executeUpdate();
       
        st.close();
        conn.close();
        return result;
    }
    

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
        String pathimg=book.getImage();
        InputStream  in = new FileInputStream(pathimg);
        st.setBlob(5,in);
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

    public ArrayList<Book> listbooks() throws SQLException {
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
            newbook.setImage(rs.getString("image"));
            listbooks.add(newbook);
        }
        st.close();
        conn.close();
        return listbooks;
    }
    public Book getmybook(int id) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        Book newbook = new Book();
        Statement st = conn.createStatement();
        String sql = "select * from book where id= "+id;
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            newbook.setId(rs.getInt("id"));
            newbook.setTitle(rs.getString("title"));
            newbook.setPrice(rs.getDouble("price"));
            newbook.setAuthor(rs.getString("author"));
            LocalDate date = rs.getDate("releaseDate").toLocalDate();
            newbook.setReleaseDate(date);
        }
        return newbook;
    }


}