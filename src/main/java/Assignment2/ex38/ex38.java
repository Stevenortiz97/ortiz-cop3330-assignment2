///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 38
//// *  Copyright 2021 Steven Ortiz
//// */

//Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
//The even numbers are 2 4 6 8.

package Assignment2.ex38;

import java.util.Scanner;

public class ex38 {

        private static final Scanner in = new Scanner(System.in);

        private static String input(){

            System.out.print("Enter a list of numbers separated by spaces: ");

            return in.nextLine();
        }
    private static void output(char[] input, String userInput){

        System.out.print("The even numbers are ");

        for( int i = 0; i < userInput.length(); i++ ){

            if ( input[i] % 2 == 0 ){

                System.out.print(+input[i]);
            }
        }
    }
        private static char[] input(String numbers){

            char[] input  = new char[numbers.length()];

            for( int i = 0; i < numbers.length(); i++ ){

                input[i] = numbers.charAt(i);
            }
            return input;
        }


    public static void main(String[] args){

        String num = input();

        char[] input = input(num);

        output(input,num);
    }
    }
