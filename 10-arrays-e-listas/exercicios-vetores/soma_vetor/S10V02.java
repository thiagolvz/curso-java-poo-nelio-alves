//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class S10V02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0, media;

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for  (int i = 0; i < n; i++) {
            System.out.printf("%.2f ",vect[i]);
            
            soma += vect[i];
        }

        media = soma / n;
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}
