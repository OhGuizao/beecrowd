import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // entrada de dados
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        // Diferença dos numeros
        int DIFERENCA = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}