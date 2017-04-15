/*
2)Escreva um algoritmo para determinar se um dado número (recebido através do teclado) é POSITIVO, NEGATIVO ou NULO.
 */
package lstaexerciciosilvana;

import java.util.Scanner;

public class PositivoNegativoNulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para determinar se é positivo, negativo ou nulo: ");
        double num;
        num = teclado.nextDouble();

        if (num > 0) {
            System.out.println("este número é positivo");
        }
        if (num == 0) {
            System.out.println("este número é nulo");
        }
        if (num < 0) {
            System.out.println("este número é negativo");
        }
    }
}
