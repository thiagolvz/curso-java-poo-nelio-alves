/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double val1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double val2 = sc.nextDouble();

        double total = val1 * num1 + val2 * num2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
