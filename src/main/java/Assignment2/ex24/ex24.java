/*
// *  UCF COP3330 Summer 2021 Assignment 2 - 24
// *  Copyright 2021 Steven Ortiz
// */
//Enter two strings and I'll tell you if they are anagrams:
//Enter the first string: note
//Enter the second string: tone
//"note" and "tone" are anagrams.



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
