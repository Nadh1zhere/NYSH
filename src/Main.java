 



 

import dao.DaoBook;

import dao.DaoBook;
 
import entities.Book;

import java.sql.*;
import gui.*;
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nadh
 */
//Classe Main
public class Main {

    public static void main(String[] args) throws SQLException, InterruptedException, FileNotFoundException {
       /* 
        Interfaceformulaire interfaceajout = new Interfaceformulaire();
        
        interfaceajout.runme(); */
        
       Home h = new Home();
       h.runme();
        
        /*DaoBook d = new DaoBook();
        String dates ="2020-11-11";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(dates, formatter);
       
        Book b = new Book("title",10.2,"ramzi",localDate,"C:\\Users\\Lenovo\\Desktop\\NSYH.png");
        
        
        d.addBookwithimage(b);*/
     
        
        
      /*  String ld = "20/10/2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(ld, formatter);
        Book book = new Book("rashford",3.9,"manu",localDate);*/
        
      /*  
        DaoBook d = new DaoBook();
        d.deletebook(5);*/
        
        
       /* Scanner scannerInt = new Scanner(System.in);
        System.out.println("Veuillez saisir la quantitÃ© ");
        int quantite = scannerInt.nextInt();
        Scanner scannerFloat = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix unitaire");
        float prixUnitaire = scannerFloat.nextFloat();
        Utility utility = new Utility();
        System.out.println("Le prix total est " + utility.calculateTotalPrice(quantite, prixUnitaire));*/
        
      /*  
        int choix = 1;
        
        while (choix != 0) {
                
                           System.out.println("************************************************");
            System.out.println("************************************************");
            System.out.println("************************************************");
            System.out.println("Press 1 to list the books");
            System.out.println("Press 2 to add a book ");
            System.out.println("Press 3 to exit");
            System.out.println("************************************************");
            System.out.println("************************************************");
            System.out.println("************************************************");
                
                 Scanner scannerChoix = new Scanner(System.in);
                choix = scannerChoix.nextInt();
                switch (choix) {
                    case 1: //lister les books
                       DaoBook dB = new DaoBook();
                       List<Book> listbooks = dB.listbooks();
                       for (int i=0;i<listbooks.size();i++)
                           System.out.println(listbooks.get(i));
                       Thread. sleep(2000) ;
                       
                        break;
                        
                    case 2: //inserer via la console un nouveau alternant
                      System.out.println("Please type the title of the book");
                      Scanner scannerTitle = new Scanner(System.in);
                      String titleBook = scannerTitle.nextLine();
                      
                      
                      System.out.println("Please type the price of the book");
                      Scanner scannerPrice = new Scanner(System.in);
                      Double priceBook = scannerPrice.nextDouble();
                      
                      System.out.println("Please type the author of the book");
                      Scanner scannerAuthor = new Scanner(System.in);
                      String authorBook = scannerAuthor.nextLine();
                      
                      System.out.println("Please type the release date of the book");
                      Scanner scannerReleaseDate = new Scanner(System.in);
                      String releaseDateBook = scannerReleaseDate.nextLine();
                      //LocalDate d1 = java.sql.Date.valueOf(releaseDateBook);
                      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                       LocalDate localDate = LocalDate.parse(releaseDateBook, formatter);
                      
                      Book b1 = new Book (titleBook,priceBook,authorBook,localDate);
                        
                      DaoBook db1=new DaoBook();
                      db1.addBook(b1);
                      
                      System.out.println("Book created successfully");
                        
                        Thread. sleep(2000) ;
                       
                       
                       
                        break;
                        
                          case 0:   
                       
                            choix =0;
                        System.out.println("************************************************");
                            System.out.println("Au revoir à la prochaine ! 0");
                        System.out.println("************************************************");
                            break;
    }
}*/
            
    }
}