import java.util.Scanner;

/* 5. Considere o seguinte cenário:
– O Hotel IFRS possui 200 quartos.
– Este hotel cobra R$ 115,00 por diária e mais uma taxa de
serviços.
– A taxa de serviços é cobrada da seguinte forma:
• R$ 12 por diária, se o número de diárias for < 15;
• R$ 10 por diária, se o número de diárias for = 15;
• R$ 9 por diária, se o número de diárias for > 15

• Faça um programa em Java que:
– Leia o nome do hóspede e a quantidade de diárias
– Imprima o nome do hóspede e o valor a ser pago
*/
public class Hotel {
    public static void main(String[] args) {
        
        
        float diaria = 155;
        float taxa1 = 12;
        int taxa2 = 10;
        int taxa3 = 9;
        float Totalpagar1;
        float Totalpagar2;
        float Totalpagar3;
        int TotalDias =1;
        
        String nome;
        
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Digite o seu nome de Hospede :" );
        nome=entrada.nextLine();
        
        System.out.println("Quanto dias pretende ficar no hotel Senhor ?");
        TotalDias=entrada.nextInt();
        
        Totalpagar1 = (diaria+taxa1);
        Totalpagar2 = (diaria+taxa2);
        Totalpagar3 = (diaria+taxa3);
        
      if (TotalDias < 15 ){
      
          System.out.println("O Sr(a) " +nome + "  hospedou-se por "  +  TotalDias + " Dia(s) " );
          System.out.println("O total da sua conta foi de : R$ "    + Totalpagar1);
      }
      else{
          
      if (TotalDias == 15){
       System.out.println("O Sr(a) " +nome + "  hospedou-se por "  +  TotalDias + "  Dia(s) " );
          System.out.println("O total da sua conta foi de : R$ " + Totalpagar2);
      
      }
      
      else {
          System.out.println("O Sr(a) " +nome + "  hospedou-se por "  +  TotalDias  + "  Dia(s)  " );
          System.out.println("O total da sua conta foi de :R$ " + Totalpagar3);
      
      }
      
      }
        
    }


    
}
