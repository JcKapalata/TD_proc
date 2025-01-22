import java.util.Scanner;

public class exercice8 {
    public static void main(String[] args) {
        // Initialisation du tableau  4x5 avec des valeurs aléatoires comprises entre 0 et 49
        int[][] tableau = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tableau[i][j] = (int) (Math.random() * 50); 
            }
        }

        // Affichage du tableau
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t");
            }
            System.out.println();
        }

        // Lecture de l'entier n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier: ");
        int n = scanner.nextInt();
        scanner.close();

        // Vérification de la présence de n dans le tableau
        boolean chercher = false;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] == n) {
                    chercher = true;
                    break;
                }
            }
            if (chercher) {
                break;
            }
        }

        // Affichage du résultat
        if (chercher) {
            System.out.println("Le nombre " + n + " se trouve dans le tableau.");
        } else {
            System.out.println("Le nombre " + n + " ne se trouve pas dans le tableau.");
        }
    }
}
