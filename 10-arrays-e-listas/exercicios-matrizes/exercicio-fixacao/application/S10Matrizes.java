/* Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class S10Matrizes {
    public  static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x  = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                        System.out.printf("Position %d,%d: \n",  i, j);

                    if (j > 0) {
                        System.out.printf("Left: %d%n", matriz[i][j - 1]);
                    }

                    if (j < n - 1) {
                        System.out.printf("Right: %d%n", matriz[i][j + 1]);
                    }

                    if (i > 0) {
                        System.out.printf("Up: %d%n", matriz[i - 1][j]);
                    }

                    if (i < m - 1) {
                        System.out.printf("Down: %d%n", matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
