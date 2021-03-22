        import java.util.Scanner;
        

// Fazer programa para ler 3 nome e 3 idades. 
// E imprima a soma e a média das 3 idades.

        public class Programação2 {
        
        public static void main(String[] args) {
        
        String nome1 ;
        String nome2;
        String nome3;
        
         int soma;
         int media;
         
         int idade1;
         int idade2;
         int idade3;
        
         Scanner entrada =new Scanner (System.in);
         
         System.out.println("Digite seu nome :");
         nome1=entrada.nextLine();
         
         System.out.println("Digite o segundo nome :");
         nome2=entrada.nextLine();
        
         System.out.println("Digite o terceiro nome :");
         nome3=entrada.nextLine();
        
         
            System.out.println("Digite a  primeira idade :");
            idade1=entrada.nextInt();
            
            
            System.out.println("Digite a segunda idade :");
            idade2=entrada.nextInt();
            
            
            System.out.println("Digite a  terceira idade :");
            idade3=entrada.nextInt();
        
            
            soma = idade1+idade2+idade3;
            media= (idade1+idade2+idade3) /3;
       
            System.out.println(" A Somas das idades são respectivamente :" +soma);   
            System.out.println(" A média das idades ficou em :" +media+  " anos de idade. ");
    }
    
   
}
