
import java.util.Scanner;
public class metodoSwitch {
    Scanner entrada =new Scanner ( System.in);
    
    
    
    
    
    
    public  void  exibirMenu(){
     int operacao;
    do{
        System.out.println("------  Escolhas umas das operações:------");      
        System.out.println(" 1.Soma  +                            ");
        System.out.println(" 2.Subtração -                          ");  // Montando o painel de escolhas das opções
        System.out.println(" 3.Multiplicação x                           ");//fazer todo esse bloco
        System.out.println(" 4.Divisão /                  ");
           
        System.out.println("Digite a operação desejada:");
        operacao=entrada.nextInt();
        } while (operacao >=5);
    
    
    
    
    }
    
   
    
    
    
}
