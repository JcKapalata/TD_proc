
import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        int nbr;
        System.out.print("Entre un nombre : ");
        Scanner scanner = new Scanner(System.in);
        nbr = scanner.nextInt();

        int somme = 0;
        int resultat = 0;
        while (somme <= nbr) {
            resultat = (resultat + somme);
            somme ++;

            if (resultat >= nbr) {
                break;
            }
        }
        System.out.println("\n Le resultat est : "+ resultat);
    }
}
