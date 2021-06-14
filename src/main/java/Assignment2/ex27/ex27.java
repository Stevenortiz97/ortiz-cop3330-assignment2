///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 27
//// *  Copyright 2021 Steven Ortiz
//// */

//Enter the first name: J
//Enter the last name:
//Enter the ZIP code: ABCDE
//Enter the employee ID: A12-1234
//The first name must be at least 2 characters long.
//The last name must be at least 2 characters long.
//The last name must be filled in.
//The employee ID must be in the format of AA-1234.
//The zipcode must be a 5 digit number.
//Or
//
//Enter the first name: John
//Enter the last name: Johnson
//Enter the ZIP code: 55555
//Enter the employee ID: TK-4321
//There were no errors found.

package Assignment2.ex27;

import java.util.Scanner;

public class ex27 {

    private static final Scanner in = new Scanner(System.in);

    private static String zip;
    private static String id;
    private static int val = 0;
    private static String first;
    private static String last;

    private static void input() {

        System.out.print("Enter the first name: ");

        first = in.nextLine();

        System.out.print("Enter the last name: ");

        last = in.nextLine();

        System.out.print("Enter the ZIP code: ");

        zip = in.nextLine();

        System.out.print("Enter the employee ID: ");

        id = in.nextLine();
    }

    private static void validation() {

        String zipValidated = zip();
        String employeeIDValidated = id();
        String lastNameValidated = last();
        String firstNameValidated = first();

        output(first, last, zip, id);
    }

    private static String first() {

        if( first.isBlank() ){
            return "The first name must be filled in.";

        }
        else if ( first.length() <= 2 ) {
            return "The first name must have at least two letters.";

        }

        else{
            val = val + 1;

            return "";
        }
    }
    private static String last() {

        if( last.isBlank() ){

            return "The last name must be filled in.";
        }
        else if (last.length() <= 2) {

            return "The last name must have at least two letters.";
        }
        else{

            val = val + 1;

            return "";
        }
    }
    private static String zip() {

        if(zip.matches("[a-zA-Z_]+")){

            return "The zip code must be a 5 digit number.";
        }
        else if (zip.length() != 5) {

            return "The zip code must be 5 digits long.";
        }
        else{

            val = val + 1;

            return "";
        }
    }
    private static String id(){

        if(id.matches("[A-Z]{2}[-]{1}[0-9]{4}")){

            val = val + 1;

            return "";
        }
        else{

            return "The employee ID must be in the format AA-1234";
        }
    }

    private static void output(String first, String last, String zip, String id) {

        if(val == 4){

            System.out.print("There were no errors found.");
        }
        else {

            System.out.print("" +first+ "\r\n" +last+ "\r\n" +zip+ "\r\n" + id + "");
        }
    }
    public static void main(String[] args) {

        input();

        validation();
    }
}


