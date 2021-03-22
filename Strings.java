
import java.util.Scanner;

public class Strings {

    public static void main(Strings[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite três palavras:");

        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println("A palavra #1 tem : " + word1.length() + " caracteres!");
        System.out.println("A palavra #2 tem : " + word2.length() + " caracteres!");
        System.out.println("A palavra #3 tem : " + word3.length() + " caracteres!");
    }

}
