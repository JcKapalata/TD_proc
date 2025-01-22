
import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        // Declaration de variable
        int nb1, nb2, nb3;

        System.out.print("Entre un nombre 1 : ");
        Scanner scn = new Scanner(System.in);
        nb1 = scn.nextInt();
        System.out.print("Entre un nombre 2 : ");
        nb2 = scn.nextInt();

        if( nb1 * nb2 < 0) {
            System.out.println("Le produit est negative");
            nb3 = nb1;
            nb1 = nb2;
            nb2 = nb3;

            // Affichage
            System.out.println("Apre echange : nombre1 " + nb1 +" et nombre2 "+nb2);
        } else{
            nb3 = nb1;
            int nb4 = nb2;
            // Affectation du produit
            nb1 = nb3 * nb4;
            nb2 = nb3 + nb4;

            // Affichage
            System.out.println("Valeur nombre1 : "+ nb1);
            System.out.println("Valeur nombre2 :"+ nb2);
        }

    }
}

