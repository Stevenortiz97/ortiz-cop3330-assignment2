///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 29
//// *  Copyright 2021 Steven Ortiz
//// */

//years = 72 / r
//Example Output
//What is the rate of return? 0
//Sorry. That's not a valid input.
//What is the rate of return? ABC
//Sorry. That's not a valid input.
//What is the rate of return? 4
//It will take 18 years to double your initial investment.

package Assignment2.ex29;

import java.util.Scanner;

public class ex29 {

        private static final Scanner in = new Scanner(System.in);

        private static String check() {

            String input;

            do {

                System.out.print("What is the rate of return? ");

                input = in.nextLine();

                if (input.equals("0")) {

                    System.out.println("Sorry, that's not a valid input.");

                } else if (input.matches("[a-zA-Z_]+")) {

                    System.out.println("Sorry, that's not a valid input.");
                }

                else{

                    break;
                }
            } while(true);

            return input;

        }

    private static void output( double rate ){

        double years = 72 / rate;

        System.out.print("It will take " + years + " years to double your initial investment.");

    }
    public static void main(String[] args) {

        String input = check();

        double rate = Double.parseDouble(input);

        output(rate);
    }
}
