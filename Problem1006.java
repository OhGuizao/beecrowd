import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // entrada de dados
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // variavel
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double MEDIA = (A * 2 + B * 3 + C * 5) / 10.0;
        // saida
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}