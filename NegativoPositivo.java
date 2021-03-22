import java.util.Scanner;

/*
1. Faça um programa em Java em que o usuário
digita um valor e imprima:
– Se positivo: “O valor digitado é positivo”.
– Caso contrário: “O valor digitado é negativo”.
*/

public class NegativoPositivo {
    
    public static void main(String[] args) {
        
         int valor1;
        Scanner entrada =new Scanner (System.in);
        System.out.println("Digite um valor :");
        valor1=entrada.nextInt();
       
        if (valor1 > 0 ) {
            System.out.println("O numero é Positivo + ");
        }
        else {
            System.out.println(" O numero " + valor1 + " é Negativo - ");
        }
    }
}
