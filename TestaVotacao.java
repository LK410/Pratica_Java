
public class TestaVotacao {

    public static void menuVotacao() {
        System.out.println("  ########      ");
        System.out.println("  ELEIÇÃO       ");
        System.out.println("                 ");
        System.out.println("  ########       ");

        System.out.println("                   ");

    }

    public static  int totalBrancosNulos(int bn){
    
        bn = bn +1;
        return bn;   
    }
    
     public static  int totalVotos(int candi1, int candi2, int bn, int totalVotos){
    
         totalVotos = bn + candi1 +candi2;
         
         return totalVotos;
    }
    
}
