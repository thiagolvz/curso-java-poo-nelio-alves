//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

import java.util.Locale;
import java.util.Scanner;

public class S10V11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        double somaAlturaMulheres = 0;
        int numMulheres = 0;
        int numHomens = 0;

        for (int i = 0; i < n; i++) {
            // Maior e menor altura
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            // Contagem homens/mulheres e soma alturas mulheres
            if (generos[i] == 'F') {
                somaAlturaMulheres += alturas[i];
                numMulheres++;
            } else {
                numHomens++;
            }
        }

        double mediaAlturaMulheres = (numMulheres > 0) ? somaAlturaMulheres / numMulheres : 0;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d\n", numHomens);

        sc.close();
    }
}
