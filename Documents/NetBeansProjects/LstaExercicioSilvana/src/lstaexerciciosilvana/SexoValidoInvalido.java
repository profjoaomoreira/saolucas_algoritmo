/*
3)Elabore um algoritmo que leia do teclado o sexo de uma pessoa. Se o sexo digitado for M ou F, escrever na tela “Sexo válido!”. Caso contrário, informar “Sexo inválido!”., fiz uma implementacao permitindo escolher o sexo ou definir invalido
 */
package lstaexerciciosilvana;

import java.util.Scanner;

public class SexoValidoInvalido {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite M para masculino e F para feminino");
        String sexo;
        sexo = teclado.nextLine();

        if (("M".equals(sexo)) || ("m".equals(sexo))) {
            System.out.println("Você eh do sexo Masculino ou seja é um homem");
        } else if (("F".equals(sexo)) || ("f".equals(sexo))) {
            System.out.println("Você eh do sexo Feminino ou seja é uma mulher");

        } else {

            System.out.println("Não consegui definir seu sexo");
        }
    }
}
