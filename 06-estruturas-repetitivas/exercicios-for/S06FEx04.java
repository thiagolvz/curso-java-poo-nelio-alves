/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

import java.util.Locale;
import java.util.Scanner;

public class S06FEx04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        for  (int i = 1; i <= n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) {
                System.out.println("Divisão impossível");
            } else {
                System.out.printf("%.1f%n", x / y);
            }
        }

        sc.close();
    }
}
