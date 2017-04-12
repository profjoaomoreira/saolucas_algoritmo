package menoroumaior;

import java.util.Scanner;

public class MenorOuMaior {

    public static void main(String[] args) {

               double ano = 2017;
        double nasc = 1975;
        double idade;

 Scanner teclado = new Scanner (System.in);
    System.out.println("Digite o ano que voce nasceu: ");
    nasc = teclado.nextDouble();        
        
        idade = ano - nasc;

        if (idade >= 21) {
            System.out.println("Voce tem "+idade+ " voce eh maior de idade");
        } 
        if (idade < 21) {
            System.out.println("Voce tem "+idade+ " voce eh menor de idade");
        }
    }
}