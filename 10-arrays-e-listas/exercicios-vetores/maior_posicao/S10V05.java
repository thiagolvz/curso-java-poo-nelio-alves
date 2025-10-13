//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

import java.util.Locale;
import java.util.Scanner;

public class S10V05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicaoMaior = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double maiorValor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.2f%n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicaoMaior);

        sc.close();
    }
}

