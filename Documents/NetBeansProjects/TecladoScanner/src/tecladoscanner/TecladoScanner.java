package tecladoscanner;

import java.util.Scanner;

public class TecladoScanner {
public static void main(String[] args) {
    //aqui declaramos as variaveis que serao usadas
    String nome;
    //a linha abaixo cria o objeto teclado que sera 
    //utilizado pela classe Scanner
    
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite o seu nome: ");
    // a linha abaixo captura o que foi digitado e armazena
    //na variavel nome
    
    nome = teclado.nextLine();
    System.out.println(nome);
    
}
}
