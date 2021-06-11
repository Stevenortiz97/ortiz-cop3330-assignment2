///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 33
//// *  Copyright 2021 Steven Ortiz
//// */

//What's your question?
//> Will I be rich and famous?
//
//Ask again later
package Assignment2.ex33;
import java.util.Scanner;
import java.util.Random;
public class ex33 {

        private static final Scanner in = new Scanner(System.in);

        public static void main(String[] args){

            String output = ball();

            System.out.print(""+output+"");

        }

        public static String ball(){

            System.out.print("What's your question? \r\n > ");
            String input = in.nextLine();

            Random rand = new Random();

            int randomNumber = rand.nextInt(4);
            int randomNumberFixed = randomNumber + 1;

            return switch (randomNumberFixed) {
                case 1 -> "Yes";
                case 2 -> "No";
                case 3 -> "Maybe";
                case 4 -> "Ask again later";
                default -> "";
            };
        }
    }