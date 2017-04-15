/*
3)Elabore um algoritmo que leia do teclado o sexo de uma pessoa. Se o sexo digitado for M ou F, escrever na tela “Sexo válido!”. Caso contrário, informar “Sexo inválido!”., fazer como esta no texto
 */
package lstaexerciciosilvana;

import java.util.Scanner;

public class SexoValido {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite M para masculino e F para feminino");
        String sexo;
        sexo = teclado.nextLine();

        if (("M".equals(sexo)) || ("F".equals(sexo))) {
            System.out.println("Sexo Valido");
        } else {

            System.out.println("Sexo invalido");
        }
    }
}
