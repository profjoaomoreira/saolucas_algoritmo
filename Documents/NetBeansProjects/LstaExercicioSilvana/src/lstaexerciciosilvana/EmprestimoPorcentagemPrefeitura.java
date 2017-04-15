/*7)A prefeitura de Porto Alegre abriu uma linha de crédito para os funcionários. O valor máximo  da prestação não poderá ultrapassar 30% do salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação, e informar se o empréstimo pode ou não ser concedido. */
package lstaexerciciosilvana;
import java.util.Scanner;
public class EmprestimoPorcentagemPrefeitura {
    public static void main(String[] args) {
     
        double salario, vpres, procent, totdesc, parcela, prestacao, total;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario: ");
        salario = teclado.nextDouble();
        System.out.println("Digite o valor que pretende pagar de prestacao: ");
        prestacao = teclado.nextDouble();

        totdesc = ((salario * 30)/100);
        System.out.println("O valor do seu salario eh "+salario);
        System.out.println("O valor do desconto permitido eh "+totdesc);
        System.out.println("O valor que pretendo pagar eh "+prestacao);
        
        
        if (totdesc <= prestacao){
            System.out.println("Seu emprestimo foi autorizado");
            
        }else{
            System.out.println("Seu emprestimo foi negado");
        
        }
        
    }
}