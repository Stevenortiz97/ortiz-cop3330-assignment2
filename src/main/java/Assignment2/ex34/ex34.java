///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 34
//// *  Copyright 2021 Steven Ortiz
//// */

//There are 5 employees:
//John Smith
//Jackie Jackson
//Chris Jones
//Amanda Cullen
//Jeremy Goodwin
//
//Enter an employee name to remove: Chris Jones
//
//There are 4 employees:
//John Smith
//Jackie Jackson
//Amanda Cullen
//Jeremy Goodwin

package Assignment2.ex34;

import java.util.Scanner;

public class ex34 {

        private static final Scanner in = new Scanner(System.in);

        private static String remove;

        private static void list(){

            System.out.print("""
                There are 5 employees:
                John Smith
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin""");

            System.out.print("\r\nEnter an employee's name to remove: ");

            remove = in.nextLine();
        }

    public static void main(String[] args){

        list();

        names names = new names();

        Assignment2.ex34.names.namesNew(remove);
    }

}
