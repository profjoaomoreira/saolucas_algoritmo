/*8)Construa um algoritmo que indique se um número digitado está compreendido entre 20 e 90 ou não (20 e 90 não estão na faixa de valores). */
package lstaexerciciosilvana;
import java.util.Scanner;
public class NumeroEntreVinteNoventa {
    public static void main(String[] args) {
        
        double num, tot;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");       
        num = teclado.nextDouble();
        if ((num >=20) && (num <=90)){
            System.out.println("este número esta na faixa compreendida entre 20 e 90");
        }else{
            System.out.println("este número nao esta na faixa entre 20 e 90");
        }
    }
}