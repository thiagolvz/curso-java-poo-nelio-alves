//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Locale;
import java.util.Scanner;

public class S10V07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double media = 0;

        System.out.print("Quantos numeros vai ter o vetor? ");
        n = sc.nextInt();

        double[] numReais = new double[n];

        for  (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numReais[i] = sc.nextDouble();
            media += numReais[i];
        }

        media  = media / n;

        System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < n; i++){
            if (numReais[i] < media){
                System.out.printf("%.1f%n", numReais[i]);
            }
        }
        sc.close();
    }
}
