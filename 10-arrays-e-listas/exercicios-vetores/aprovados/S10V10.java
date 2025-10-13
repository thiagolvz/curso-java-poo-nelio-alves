//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

import java.util.Locale;
import java.util.Scanner;

public class S10V10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            media[i] += (nota1[i] + nota2[i]) / 2;

            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for  (int i = 0; i < n; i++) {
            if (media[i] >= 6) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
