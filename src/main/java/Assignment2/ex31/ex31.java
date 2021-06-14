///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 31
//// *  Copyright 2021 Steven Ortiz
//// */

//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
//Example Output
//Resting Pulse: 65        Age: 22
//
//Intensity    | Rate
//-------------|--------
//55%          | 138 bpm
//60%          | 145 bpm
//65%          | 151 bpm
//:               :        (extra lines omitted)
//85%          | 178 bpm
//90%          | 185 bpm
//95%          | 191 bpm

package Assignment2.ex31;

import java.util.Scanner;

public class ex31 {

    private static final Scanner in = new Scanner(System.in);

    private static int age;
    private static int rest;


    private static int input() {

        String input;

        do {
            input = in.nextLine();

            if (input.equals("0")) {

                System.out.println("Sorry, that's not a valid input.");

            } else if (input.matches("[a-zA-Z_]+")) {

                System.out.println("Sorry, that's not a valid input.");

            } else {

                break;
            }
        } while (true);

        return Integer.parseInt(input);
    }

    private static void output() {

        System.out.println("Resting Pulse: " + rest + "\t\tAge: " + age + "");

        System.out.println("Intensity \t\t| Rate");

        System.out.println("________________|__________________");

        for (int i = 55; i < 100; i++) {

            int target = (int) ((((220 - age) - rest) * (i / 100.0)) + rest);
            System.out.println(+i + "%\t\t\t\t| " + target + " bpm");

            i = i + 4;

        }
    }
    public static void main(String[] args) {

        System.out.print("Please enter your age: ");

        age = input();

        System.out.print("Please enter your resting heart rate: ");

        rest = input();

        output();

    }
}