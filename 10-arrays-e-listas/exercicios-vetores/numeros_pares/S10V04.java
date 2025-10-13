//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

import java.util.Locale;
import java.util.Scanner;

public class S10V04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, nPares = 0;

        //Quantos numeros voce vai digitar? 6
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for  (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] =  sc.nextInt();
        }

        System.out.println();

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                nPares++;
            }
        }
        System.out.println();

        System.out.printf("QUANTIDADE DE PARES = %d", nPares);

        sc.close();
    }
}
