/*
4)Construir um algoritmo que leia dois números e efetue sua adição. Caso o valor da adição for maior que 20, este deverá ser apresentado somando-se a ele mais 10. Caso o valor da adição for menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
 */
package lstaexerciciosilvana;

import java.util.Scanner;

public class SomaNumerica {

    public static void main(String[] args) {
        
        double num1, num2, tot;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = teclado.nextDouble();
                
        System.out.println("Digite o segundo numero: ");
        num2 = teclado.nextDouble();
        
        tot = num1+num2;

        if (tot >= 20) {
            System.out.print(" O valor total eh "+tot);
            System.out.println(" + 10 o valor fica: "+(tot+10));
        } else {
            System.out.print(" o valor total eh "+tot);
            System.out.println(" - 5 o valor fica: "+(tot-5));
        }
    }
}
