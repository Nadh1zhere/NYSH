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
    private String image;
    private byte[] img;

    public Book(String title, double price, String author, LocalDate releaseDate, byte[] img) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
        this.img = img;
    }

    
    public Book(int id, String title, double price, String author, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
    }
     public Book(int id, String title, double price, String author, LocalDate releaseDate,String image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
        this.image=image;
    }
     public Book(String title, double price, String author, LocalDate releaseDate) {
        
        this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
    }
     public Book(String title, double price, String author, LocalDate releaseDate,String image){
          this.title = title;
        this.price = price;
        this.author = author;
        this.releaseDate = releaseDate;
        this.image=image;
     }
     
    public Book(){}

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
    public String getImage(){
         return image;
        }
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
    public void setImage(String image){
        this.image=image;
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

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", price=" + price + ", author=" + author + ", releaseDate=" + releaseDate + '}';
    }
    
    
    
    
    

    
    
    
    
    
}
