/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Commande {

    private int id;
    private Date datecommande;
    private double prix;
    private ArrayList<Book> listbooks;
    private int idC;
    private String detail;

    public Commande(Date datecommande, double prix, int idC, String detail) {
        this.datecommande = datecommande;
        this.prix = prix;
        this.idC = idC;
        this.detail = detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public Commande(int id, Date datecommande, double prix, ArrayList<Book> listbooks, int idC) {
        this.id = id;
        this.datecommande = datecommande;
        this.prix = prix;
        this.listbooks = listbooks;
        this.idC = idC;
    }
    public Commande(Date datecommande, double prix, ArrayList<Book> listbooks, int idC) {
        
        this.datecommande = datecommande;
        this.prix = prix;
        this.listbooks = listbooks;
        this.idC = idC;
    }
    public Commande(){}

    public int getId() {
        return id;
    }

    public Date getDatecommande() {
        return datecommande;
    }

    public double getPrix() {
        return prix;
    }

    public ArrayList<Book> getListbooks() {
        return listbooks;
    }

    public int getIdC() {
        return idC;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatecommande(Date datecommande) {
        this.datecommande = datecommande;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setListbooks(ArrayList<Book> listbooks) {
        this.listbooks = listbooks;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", datecommande=" + datecommande + ", prix=" + prix + ", listbooks=" + listbooks + ", idC=" + idC + '}'+ ", detail=" +detail;
    }
    
    
}
