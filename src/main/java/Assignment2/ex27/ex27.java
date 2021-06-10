///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 27
//// *  Copyright 2021 Steven Ortiz
//// */

//Enter a number: 1
//Enter a number: 2
//Enter a number: 3
//Enter a number: 4
//Enter a number: 5
//The total is 15.

package Assignment2.ex27;


import java.util.Scanner;

public class ex27 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        double sum = userInput();

        answer(sum);

    }

    private static double userInput(){

        double input;
        double sum = 0;

        for ( int i = 0; i<5; i ++) {

            System.out.print("Enter a number: ");
            input = in.nextDouble();

            sum = sum + input;

        }

        return sum;
    }

    private static void answer(double sum){

        System.out.println("The total is " + sum +"" );
    }

}


