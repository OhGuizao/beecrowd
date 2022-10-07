import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
        //entrada de A e B
        double A = input.nextDouble();
        double B = input.nextDouble();
        //formula da media
        double MEDIA =((A*3.5)+(B*7.5))/11.0;
        //saida de dados
        System.out.printf("MEDIA = %.5f%n", MEDIA);