import java.util.Scanner;
import java.util.Locale;

public class Problem1010 {
    public static void main(String[] args) {
        // entrada de dados
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        // variavel(processo)
        int codPeca1 = input.nextInt();
        int qtdPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();

        int codPeca2 = input.nextInt();
        int qtdPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double custoTotal = qtdPeca1 * qtdPeca2 * valorPeca1 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$%.2f%n", custoTotal);
    }
}