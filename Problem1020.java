import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // entrada de dados
        Scanner input = new Scanner(System.in);

        // variavel
        int qtdTotalDias = input.nextInt();

        int qtdAnos = qtdTotalDias / 365;
        qtdTotalDias = qtdTotalDias % 365;

        int qtdMeses = qtdTotalDias / 30;
        qtdTotalDias = qtdTotalDias % 30;

        int qtdDias = qtdTotalDias;
        // saida
        System.out.printf("%d ano(s)%n", qtdAnos);
        System.out.printf("%d mes(es)%n", qtdMeses);
        System.out.printf("%d dia(s)%n", qtdDias);
    }
}