/*
5)Escreva um algoritmo que leia um número e imprima a raiz quadrada do número caso ele seja positivo ou igual a zero e o quadrado do número caso ele seja negativo. raizq(valor) - Retorna a raiz quadrada do valor.
 */
package lstaexerciciosilvana;
import java.util.Scanner;
public class RaizQuadrada {
    public static void main(String[] args) {
        double num1, num2, tot;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = teclado.nextDouble();
        
        if (num1 >=0) {
            System.out.print(" o valor da raiz da " +num1+ " eh: "+(Math.sqrt(num1)));
            
        } else {
            System.out.print(" o numero quadrado de "+num1+ "eh "+(Math.pow(num1,2)));
            
           
        }
    }
}
