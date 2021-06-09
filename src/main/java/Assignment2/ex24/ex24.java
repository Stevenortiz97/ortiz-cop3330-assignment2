/*
 *  UCF COP3330 Summer 2021 Assignment 2 - Exercise 24 - Anagram Checker
 *  Copyright 2021 Steven Ortiz
 */

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

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1,word2);

        String  output = generateOutput(result);

        System.out.println(output);
}
public void readUserInput(){
       System.out.println("enter word 1");
       word1 = in.next();

       System.out.println("enter word 2");
       word2 = in.next();
}
    private static String generateOutput(boolean isAnagram) {
        if(isAnagram) {
            return "is anagram";
        }
        else {
            return "is not anagram";
        }
    }
}
