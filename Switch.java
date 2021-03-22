import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
       
         
        int valor1,
            valor2,
             soma,       
           dividir, // Iniciando as váriavés para ultilizar.
          subtrair,
          multiplicar,  
          operacao;
        
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o valor 1:");    //Digitando o valor1
        valor1=entrada.nextInt();                      //Recebendo o Valor1
        System.out.println("Digite o valor 2:");   //Digitando o valor2
        valor2=entrada.nextInt();                 //Recebendo o valor2
        
     
        
       soma = valor1+valor2;
       subtrair =valor1 - valor2;
       multiplicar = valor1 * valor2;     // Bloco mostrando o que faz e o que recebe cada variavél
       dividir = valor1 / valor2;
       
       metodoSwitch obj = new  metodoSwitch();
       
       obj.exibirMenu();
       
       
       
        switch(operacao) {
  
            case 1:  
                
           System.out.println("##A opção selecionada foi Soma");           //Se a opção selecionada for 1,mostrra essa
                System.out.println("#### Resultado da soma é  "  +soma);
                                                                           
            break;
            case 2:
           System.out.println("A opção selecionada foi Subtração");
                System.out.println("#### Resultado da subtração é "+ subtrair);
           break;
           case 3:
           System.out.println(" A opção selecionada foi Multiplicação");
               System.out.println("#### Resultado da Multiplicação " + multiplicar);
            break;
            case 4:
           System.out.println("A opção selecionada foi Divisão");
                System.out.println("#### Resultado da Divisão " +dividir);
             break;
             default: 
           System.out.println( "### Você não digitou a operação corretamente.");
           break;
        } 
        
      }
        }
 
    
        
    


 