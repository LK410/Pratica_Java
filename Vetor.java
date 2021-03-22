
public class Vetor {

    public static void main(String[] args) {

        int[] A = new int[6]; // Declarando um vetor inteiro com nome de numeros e seu tamanhho

        A[0] = 1;
        A[1] = 3;  // Nome do vetor/ sua posição e o valor que ele vai gaurdar
        A[2] = 5;
        A[3] = 7;
        A[4] = 9;
        A[5] = 11;

        for (int i = 0; i < 6; i++) //Percorrendo o vetor enquanto ele for menor que 4.
        {
            System.out.println(A[i]); //Exibindo todos os vetores com seus valores.
        }

    }
}
