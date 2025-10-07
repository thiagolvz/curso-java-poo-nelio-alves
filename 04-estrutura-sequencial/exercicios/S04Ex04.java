/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais. */

import java.util.Scanner;
import java.util.Locale;

public class S04Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salary = valorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d%n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
