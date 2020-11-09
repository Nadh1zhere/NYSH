/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Book;
import java.sql.*;
import java.time.*;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class DaoBook {

    public void addBook(Book book) throws SQLException {

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

    }

    public List<Book> listbooks() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
     
        Statement st = conn.createStatement();
        String sql = "select * from book";
        ResultSet rs = st.executeQuery(sql);
        
        List <Book> listbooks= new ArrayList();
        while(rs.next())
        {
            Book newbook = new Book();
            newbook.setId(rs.getInt("id"));
            newbook.setTitle(rs.getString("title"));
            newbook.setPrice(rs.getDouble("price"));
            newbook.setAuthor(rs.getString("author"));
            LocalDate date = rs.getDate("releaseDate").toLocalDate();
            newbook.setReleaseDate(date);
            listbooks.add(newbook);
        }
        return listbooks;
    }
    
   
}
