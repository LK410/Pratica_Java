
import java.util.Scanner;

public class ConversaoMedida {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Celsius = 0;
        float Mili = 25.4f;
        float Fahren = 0;    // Declarando as variáveis e seus tipos, que vão ser ultilizadas no programa abaixo.
        float Pole = 0;
        float opcao1, opcao2 = 0, opcao3 = 0, opcao4 = 0;
        int TiOpçao = 0;
        String condicao = "S";

        while (condicao.equalsIgnoreCase("S")) {     // Enquanto essa opção for S , o while vai continuar exibndo o Menu

            System.out.println(" ### Bem vindo ao Conversor ###");
            System.out.println("[1]Celsius - > Farenhit ");
            System.out.println("[2] Farenhit - > Celsius ");  // Menu comforme foi exibido no enunciado da questão.
            System.out.println("[3]Milimetros - > Polegadas ");
            System.out.println("[4]Polegadas - > Milimetros ");

            System.out.println("Informe a opção desejada : ");
            int TiOpcao = entrada.nextInt(); // Recebe do teclado a opção desejada pelo uusário

            if (TiOpcao == 1) {  // Se a opção  digitada for  um 1  ,ele vai executar esse bloco

                System.out.println("Informe a temperatura em Celsius :");
                Celsius = entrada.nextInt(); // Recebe a temperatura em Celsius  Digitada pelo usuário
                opcao1 = (Celsius * (9 / 5) + 32); // Faz a conversão

                System.out.println(" A temperatura " + Celsius + " Equivale a " + opcao1 + "  em Farenheit ");
                //Exibe na tela concatenando  o valor em Celsius Digitado , mais o calculo que a opção 1 gerou
                System.out.println(" Deseja Continuar ? [S}im ou [N]ao");
                condicao = entrada.next();
            }

            
            
            if (TiOpcao == 2) {
                System.out.println(" Informe a temperatura em  Fahrenrit :");
                Fahren = entrada.nextFloat();
                opcao2 = ((Fahren - 32) * 5 / 9);

                System.out.println("A Temperatura "  + Fahren + " Fahrenrit ,equivale a " + opcao2 + " em Celsius ");
              
                System.out.println(" Deseja Continuar ? [S}im ou [N]ao");
                condicao = entrada.next();
            }
            if (TiOpcao == 3) {

                System.out.println(" Informe  o Milimentros : ");
                Mili = entrada.nextFloat();

                System.out.println(" O Milimetro " + Mili + " Equivale a " + opcao3 + "em Polegadas");
                
                System.out.println(" Deseja Continuar ? [S}im ou [N]ao");
                condicao = entrada.next();
            }

            
            if (TiOpcao == 4) {

                System.out.println("Informe a polegada : ");
                Pole = entrada.nextInt();
                opcao4 = (Pole * Mili);

                System.out.println("A polegada" + Pole + " Equivale a " + opcao4 + "em Milimetros");

                System.out.println(" Deseja Continuar ? [S}im ou [N]ao");
                condicao = entrada.next();

            }
          
        }

        System.out.println(" ### Programa Encerrado  ####");

        opcao1 = ((Celsius * 9 / 5) + 32); //Conversão de Celsius para Fareheint
        opcao2 = ((Fahren - 32) * 5 / 9);  // Conversão de Farehient para Celsius
        opcao3 = (Mili / Pole);           // Conversão de Milimetros para Polegadas
        opcao4 = (Pole * Mili ); //Conversão Polegadas para Milimetros

      
        
    }
}
