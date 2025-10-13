//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

import java.util.Locale;
import java.util.Scanner;

public class S10V09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maiorIdade = 0;
        String maisVelho = "";

        for (int i = 0; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                maisVelho = nomes[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", maisVelho);

        sc.close();
    }
}
