
public class Vetor2 {

    public static void main(String[] args) {

        int[] VetorA = new int[3];

        VetorA[0] = 9;
        VetorA[1] = 5;
        VetorA[2] = 1;

        for (int i = 0; i < 3; i++) 
            if (VetorA[i] == VetorA[0]) {
                System.out.println("Esse numero é 9");
            }
            else {
               System.out.println("Esse numero não é 9");
          
               System.out.println(VetorA[i]);
            }
           
        
        // Perguntar para sora como fazer para os vetores aparecer horizontalmente.

    }
}
