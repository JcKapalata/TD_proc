public class exercice9 {
    public static void main(String[] args) {
        // Initialisation des matrices1
        int[][] matrice1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Initialisation des matrices2
        int[][] matrice2 = {
            {17, 18, 19, 20},
            {21, 22, 23, 24},
            {25, 26, 27, 28},
            {29, 30, 31, 32}
        };

        // Affichage des matrices1
        System.out.print("Matrice 1:");
        AffichageMatrice(matrice1);
        System.out.println("\n");

        // Affichage des matrices2
        System.out.println("Matrice 2:");
        AffichageMatrice(matrice2);
        System.out.print("\n");

        // Transposition de la matrice 2
        int[][] transposeMatrice2 = transposeMatrice(matrice2);
        System.out.print("\n");

        // Affichage de la matrice transposée
        System.out.println("Transposed Matrice 2:");
        AffichageMatrice(transposeMatrice2);
        System.out.print("\n");

        // Multiplication des matrices
        int[][] resultatMatrice = multi_Matrices(matrice1, transposeMatrice2);
        System.out.print("\n");

        // Affichage du résultat
        System.out.println("Resultat Matrice:");
        AffichageMatrice(resultatMatrice);
        System.out.print("\n");
    }

    // Fonction pour afficher une matrice
    public static void AffichageMatrice(int[][] matrice) {
        for (int[] row : matrice) {
            for (int element : row) {
                System.out.print(element + " \t");
            }
            System.out.println();
        }
    }

    // Fonction pour transposer une matrice
    public static int[][] transposeMatrice(int[][] matrice) {
        int[][] transpose = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                transpose[j][i] = matrice[i][j];
            }
        }
        return transpose;
    }

    // Fonction pour multiplier deux matrices
    public static int[][] multi_Matrices(int[][] matrice1, int[][] matrice2) {
        int[][] result = new int[matrice1.length][matrice2[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice2[0].length; j++) {
                for (int k = 0; k < matrice1[0].length; k++) {
                    result[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }
        return result;
    }
}

