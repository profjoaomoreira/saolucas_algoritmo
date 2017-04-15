/*6)Escreva um algoritmo para determinar se um número A é divisível por um outro número B. Esses valores devem ser fornecidos pelo usuário. */
package lstaexerciciosilvana;

import java.util.Scanner;

public class AdivisivelPorB {

    public static void main(String[] args) {
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero A");
        num1 = teclado.nextDouble();
        System.out.println("Digite o numero B");
        num2 = teclado.nextDouble();

        if (num1 % num2 == 0) {
            System.out.println("O valor de A eh divisivel por B");
        } else {
            System.out.println("O valor de A nao eh divisivel por B");
        }
    }
}