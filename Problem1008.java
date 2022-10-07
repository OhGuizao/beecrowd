import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // entrada de dados
        Scanner leitor = new Scanner(System.in);

        // variavel(processo)
        int funcionarios = leitor.nextInt();
        int horas = leitor.nextInt();
        double valorPorHora = leitor.nextDouble();
        double salario = horas * valorPorHora;
        // saida
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f", salario));

    }

}