
package Assignment2.ex24;
import java.util.Scanner;
public class ex24 {

private static final Scanner in = new Scanner(System.in);

private static String word1;
private static String word2;

public static void main(String[] args){

        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);
        System.out.print(output);
}

public static void readUserInput(){
        System.out.println("Enter word 1");
        word1 = in.nextLine();

        System.out.println("Enter word 2");
        word2 = in.nextLine();
}

public static String generateOutput(boolean isAnagram){
        String output;
        if(isAnagram){
        output = "is anagram";
        }
        else {
        output = "is not anagram";
        }
        return output;
        }





}
