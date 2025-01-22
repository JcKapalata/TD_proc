
import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        int nbr_depart, N;
        System.out.print("Entre un nombre de depart : ");
        Scanner scanner = new Scanner(System.in);
        nbr_depart = scanner.nextInt();

        System.out.print("Combien de nombre precedent voullez vous Afficher : ");
        N = scanner.nextInt();

        System.out.print("Valeur : " );
        for ( int i = 1; i <= N; i++) {
            int resultat = nbr_depart - i;
            System.out.print( resultat +", ");
        }
    }
}
