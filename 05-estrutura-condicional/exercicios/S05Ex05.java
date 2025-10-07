/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.util.Locale;
import java.util.Scanner;

public class S05Ex05 {
    public  static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod =  sc.nextInt();
        int quant = sc.nextInt();
        double preco = 0;

        switch (cod) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("Código inválido");
        }

        if (preco > 0) {
            System.out.printf("Total: R$ %.2f%n", quant * preco);
        }

        sc.close();
    }
}
