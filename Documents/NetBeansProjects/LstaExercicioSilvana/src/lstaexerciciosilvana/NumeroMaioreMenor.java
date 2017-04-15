/*9)Criar um algoritmo que leia dois números e imprima o quadrado do menor número e a raiz quadrada do maior número. */
package lstaexerciciosilvana;

import java.util.Scanner;

public class NumeroMaioreMenor {

    public static void main(String[] args) {
        double num1, num2, tot;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Digite um numero: ");
        num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println(" O valor "+num1+ " eh maior que " + num2 + " e portanto o valor da raiz do quadrado de "+num1+ " eh "+(Math.sqrt(num1)));
            System.out.print("E o numero quadrado de " + num2 + "eh " + (Math.pow(num2, 2)));
        }

        if (num2 > num1) {
            System.out.println(" O valor " + num1 + "eh menor que " + num2 + " e portanto o valor da raiz de num2 eh " + (Math.sqrt(num2)));
            System.out.print(" E o numero quadrado de " + num1 + " eh " + (Math.pow(num1, 2)));
        }

    }
}
