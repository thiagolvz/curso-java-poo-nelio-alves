/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159 */

import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        double radio = sc.nextDouble();
        double area = pi * Math.pow(radio, 2);

        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}
