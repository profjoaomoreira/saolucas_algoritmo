/*
1)Construa um algoritmo que determine e imprima se um dado número inteiro (recebido através do teclado) é PAR ou ÍMPAR.
 */
package lstaexerciciosilvana;

import java.util.Scanner;

public class ParImparIfElse {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para determinar se é par ou impar: ");
        double num, tot;
        num = teclado.nextDouble();

        if (num % 2 == 0) {
            System.out.println("este número é par");
        } else {
            System.out.println("este número é impar");
        }
    }
}
