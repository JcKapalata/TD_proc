import java.util.Scanner;

public class exercice6 {

    public static void main(String[] args){ 
        System.out.println("Equation Second degre");

        System.out.print("Entre la valeur de a : ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Entre la valeur de b : ");
        double b = scanner.nextDouble();
        System.out.print("Entre la valeur de c : ");
        double c = scanner.nextDouble();

        discriminant(a, b, c);
        resultat(a, b, c);
    }

    public static  double  discriminant(double a, double b, double c){ 
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public static void resultat (double a, double b, double c){
        double delta = discriminant(a, b, c);
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les solutions sont x1 = " + x1 + " et x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("La solution est x = " + x);
        } else {
            System.out.println("Il n'y a pas de solution réelle.");
        }
    }
}
