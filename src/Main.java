
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nadh
 */
public class Main {

    public static void main(String[] args) {

        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Veuillez saisir la quantitÃ© ");
        int quantite = scannerInt.nextInt();

        Scanner scannerFloat = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix unitaire");
        float prixUnitaire = scannerFloat.nextFloat();

        Utility utility = new Utility();

        System.out.println("Le prix total est " + utility.calculateTotalPrice(quantite, prixUnitaire));

    }
}
