
import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        // 
        int temps, heure, munite, second, resteHeure, resteMunite, resteSeconde; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre les temps en seconde : ");
        temps = scan.nextInt();
       
        // Heure 
        heure = temps / 3600;
        resteHeure = temps % 3600;

        // Munite
        munite = resteHeure / 60;
        resteMunite = resteHeure % 60;

        // Seconde
        resteSeconde = resteMunite % 60;

        // Affichage
        System.out.println("Affichage :"+ heure + " Heure " + munite +" munite et " + resteSeconde + " Seconde." );

    }
}
