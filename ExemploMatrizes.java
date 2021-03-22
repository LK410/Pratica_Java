

import java.util.Scanner;

/**
 *
 * @author monteiro
 */
public class ExemploMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        //definindo uma matriz
        //int[][] matriz = new int[linhas][colunas]; 
        double[][] matrizNotas = new double[7][6];
        
        //ler matrizNotas[1,1]
        System.out.print("Digite a nota 1 do aluno 1: ");
        matrizNotas[1][1] = input.nextDouble();
        System.out.println("Nota Digitada: " + matrizNotas[1][1]);
        
        //Copiar o valor lido para outro elemento (coluna) da matriz 
        matrizNotas[1][2] = matrizNotas[1][1];
        System.out.println("Copia da Nota: " + matrizNotas[1][2]);

        //Verificar se o valor lido é igual a 10:
        if (matrizNotas[1][2] == 10)
            System.out.println("Nota 1 do Aluno 1 igual a 10");
        else
            System.out.println("Nao foi desta vez :-(");
    
       
       //Preencher uma matriz 10x10 com zeros
       //linha por coluna
       int[][] matrizZeros = new int[10][10];
       for (int linha = 0; linha < 2; linha++){
           for (int coluna = 0; coluna < 10; coluna++){
               matrizZeros[linha][coluna] = 0;
               System.out.print("  " + matrizZeros[linha][coluna]);
           }
           System.out.print("\n NOVA LINHA \n");
       }
    }
    
}