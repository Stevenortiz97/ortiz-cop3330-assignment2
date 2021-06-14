/*
// *  UCF COP3330 Summer 2021 Assignment 2 - 26
// *  Copyright 2021 Steven Ortiz
// */

//What is your balance? 5000
//What is the APR on the card (as a percent)? 12
//What is the monthly payment you can make? 100
//It will take you 70 months to pay off this card.

package Assignment2.ex26;
import java.util.Scanner;

public class ex26 {


        private static final Scanner in = new Scanner(System.in);

        private static double balance;
        private static double aprDecimal;
        private static double payment;

        private static void input(){

            double apr;

            System.out.print("What is your balance? ");

            balance = in.nextDouble();

            System.out.print("What is the APR on the card (as a percent)? ");

            apr = in.nextDouble();
            aprDecimal = apr / 100;

            System.out.print("What is the monthly payment you can make? ");

            payment = in.nextDouble();

        }

        private static void output(int monthsRounded){

            System.out.print("It will take you " + monthsRounded + " months to pay off this card.");

        }
    public static void main(String[] args){

        input();

        calculator calculator = new calculator();

        int monthsRounded = (int) calculator.calculate_months(balance,aprDecimal,payment);

        output(monthsRounded);

    }
    }

