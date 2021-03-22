
import java.util.Scanner;
import javax.swing.JOptionPane;

class NotasMedias {

    public static void main(Strings[] args) {

        Scanner entrada = new Scanner(System.in);  // Programa para Somar 2 valores 

        int valor1;
        int valor2; //Declarando váriaveis
        int media;

        Strings mensagem;

        mensagem = JOptionPane.showInputDialog("Digite um valor:");
        JOptionPane.showMessageDialog(null, mensagem);

        System.out.println("Digite um segundo valor:");
        valor2 = entrada.nextInt();  //Recebendo valor 2

        media = valor1 + valor2; //Variavel Soma recebendo o valor1 + valor2

        System.out.println("O valor da soma é " + media); //Mostrando o valor da soma

    }

}
