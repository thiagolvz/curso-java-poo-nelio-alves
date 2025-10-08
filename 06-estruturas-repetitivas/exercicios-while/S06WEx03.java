/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */

import java.util.Scanner;

public class S06WEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, cod = 0;

        while (cod != 4) {
            System.out.println("Selecione o tipo de combustível abastecido:");
            System.out.println("1. Alcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");

            cod = sc.nextInt();

            switch (cod) {
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3:
                    diesel ++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Código inválido! Digite um novo código:");
            }
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
