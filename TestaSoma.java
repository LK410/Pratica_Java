
import java.util.Scanner;
 class TestaSoma {
 public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);  // Programa para Somar 2 valores 

       System.out.println("Digite um valor:");
        Integer valor1 = entrada.nextInt();
       System.out.println("Digite um segundo valor:");
        Integer valor2 = entrada.nextInt();  //Declarando váriaveis

   
        System.out.println("O valor da soma é " + Operacoes.SomarValores(valor1,valor2)); //Mostrando o valor da soma

    }

}



