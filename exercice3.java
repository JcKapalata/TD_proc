
import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        int nbr1, nbr2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre le nombre1 : ");
        nbr1 = scanner.nextInt();
        System.out.print("Entre le nombre2 : ");
        nbr2 = scanner.nextInt();

        System.out.print("Choisisser l'opereateur +, - , * , / : ");
        Scanner scan = new Scanner(System.in);
        String operateur = scan.nextLine();

        if (operateur.equalsIgnoreCase("+")) {
            int doubleSom = (nbr1 + nbr2) * 2;
            System.out.println("La reponse est : " + doubleSom);
        } else if (operateur.equalsIgnoreCase("-")) {
            int doubleSom = (nbr1 - nbr2) * 2;
            System.out.println("La reponse est : " + doubleSom);
        } else if (operateur.equalsIgnoreCase("*")) {
            int doubleSom = (nbr1 * nbr2) * 2;
            System.out.println("La reponse est : " + doubleSom);
        } else if (operateur.equalsIgnoreCase("/")) {
            int doubleSom = (nbr1 / nbr2) * 2;
            System.out.println("La reponse est : " + doubleSom);
        }
    } 
}