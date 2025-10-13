//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Locale;
import java.util.Scanner;

public class S10V08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, numPares = 0;
        double media = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] numInteiros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numInteiros[i] = sc.nextInt();

            if (numInteiros[i] % 2 == 0) {
                media += numInteiros[i];
                numPares++;
            }
        }

        if (numPares == 0) {
            System.out.print("NENHUM NUMERO PAR");
        } else {
            media = media / numPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }

        sc.close();
    }
}
