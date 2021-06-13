///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 28
//// *  Copyright 2021 Steven Ortiz
//// */

//Enter a number: 1
//Enter a number: 2
//Enter a number: 3
//Enter a number: 4
//Enter a number: 5
//The total is 15.

package Assignment2.ex28;

import java.util.Scanner;

public class ex28 {

        private static final Scanner in = new Scanner(System.in);

        private static double input(){

            double sum = 0;
            for(int i = 0; i < 5; i++){

                System.out.print("Enter a number: ");

                double input = in.nextDouble();
                sum = input + sum;
            }
            return sum;
        }

        private static void output(double sums){


            System.out.print("The total is "+sums+".");

        }
    public static void main(String[] args) {

        double sum = input();

        output(sum);

    }
}
