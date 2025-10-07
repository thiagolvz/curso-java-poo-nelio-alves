/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B. */

import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        double a  = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangle = a * c / 2;
        double circle = pi * Math.pow(c, 2);
        double trapeze = (a + b) * c / 2;
        double square = Math.pow(b, 2);
        double rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZE: %.3f%n", trapeze);
        System.out.printf("SQUARE: %.3f%n", square);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }
}
