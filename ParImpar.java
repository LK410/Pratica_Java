
import java.util.Scanner;

/*
2. Faça um programa em Java em que o usuário
digita um valor e informe se o número digitado
é Par ou Ímpar
 */
public class ParImpar {

    public static void main(String[] args) {

        int valor1;                    //variavel que vai  guardar o valor digitado pelo usuário.
        String condicao = "S";

        Scanner entrada = new Scanner(System.in);

        while (condicao.equalsIgnoreCase("S")) {

            System.out.println("Digite um numero :");
            valor1 = entrada.nextInt();

            if (valor1 % 2 == 0) {   // Se o resto da divisão for igual a 0 mostra a mensagem abaixo

                System.out.println("## O numero digitado é par.");
                System.out.println("                 ");
            } else {              //Se ela não for ,mostra que é impar
                System.out.println("## O numero digitado é Impar");
            }
            System.out.println("Deseja continuar?  [S] Sim ou  [N] Não?");
            condicao = entrada.next();
            System.out.println("                 ");
        }

    }
}
