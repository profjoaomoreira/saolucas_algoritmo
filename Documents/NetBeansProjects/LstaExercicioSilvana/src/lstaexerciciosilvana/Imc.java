/*10) Construa um algoritmo para determinar se o indivíduo esta com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo. Ou seja, a situação do peso é determinada pela tabela abaixo: */
package lstaexerciciosilvana;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        double peso, alt,imc;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = teclado.nextDouble();

        System.out.println("Digite sua altura: ");
        alt = teclado.nextDouble();

        imc = peso / (alt * alt);
        

        if (imc < 20) {
            System.out.println("voce esta abaixo do peso!");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("voce esta com peso normal!");
        } else if (imc >= 25 && imc <= 30) {
            System.out.println("voce esta com sobre peso!");
        } else if (imc >= 30 && imc <= 40) {
            System.out.println("voce esta obso!");
        } else {
            System.out.println("voce esta com obsidade morbida");
        }
    }
}
