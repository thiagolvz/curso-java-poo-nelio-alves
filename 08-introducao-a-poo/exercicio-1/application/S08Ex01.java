/* Fazer um programa para ler os valores da largura e altura de um retângulo.
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
Usar uma classe como mostrado no projeto ao lado. */

package application;

import entities2.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class S08Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());

        sc.close();
    }
}
