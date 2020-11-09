/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.*;

/**
 *
 * @author Nadh
 */
public class Book {
    
    
    private int id;
    private String title;
    private double price;
    private String author;
    private LocalDate releaseDate;

    public Book(int id, String title, double price, String author, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
    }
     public Book(String title, double price, String author, LocalDate releaseDate) {
        
        this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
    }
    public Book(){}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    
    
    
    

    
    
    
    
    
}
