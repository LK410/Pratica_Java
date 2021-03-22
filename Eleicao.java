
import java.util.Scanner;

public class Eleicao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int totalVoto;
        int bn = 0;
        Integer candi1 = 0;
        int candi2 = 0;

        while (opcao != -1) {
            System.out.println("  Escolha um opcão  abaixo de voto : ");
            System.out.println("                                       ");
            System.out.println(" -1  Encerrar Eleição   ");
            System.out.println("  0  Brancos e Nulos    ");
            System.out.println("  1  Candidato  1            ");
            System.out.println("  2  Canditado  2  ");

            opcao = entrada.nextInt();

            if (opcao == 0) {
                System.out.println(" Voce votou Branco e Nulo");

                bn = bn + 1;
            }
            if (opcao == 1) {

                System.out.println(" Você votou no candidato : 1");

                candi1 = candi1 + 1;
            }

            if (opcao == 2) {

                System.out.println(" Você votou  no candidato : 2 ");

                candi2 = candi2 + 1;
            }

            if (opcao == -1) {

                System.out.println(" Você encerrou o programa.");
                System.out.println("                           ");
                System.out.println(" CONTAGEM  DOS VOTOS: ");

                totalVoto = bn + candi1 + candi2;

                System.out.println("  O numero de brancos e Nulos foi de " + bn + " voto(s)");
                System.out.println("  O Candidato 1 recebeu " + candi1 + " voto(s) ");
                System.out.println("  O candidato 2 recebeu " + candi2 + " voto(s)");
                System.out.println(" Total de Votos :" + totalVoto + " voto(s)");
            }

        }

    }
}
