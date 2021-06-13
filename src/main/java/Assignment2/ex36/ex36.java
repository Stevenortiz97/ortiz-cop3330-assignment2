///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 36
//// *  Copyright 2021 Steven Ortiz
//// */

//Enter a number: 100
//Enter a number: 200
//Enter a number: 1000
//Enter a number: 300
//Enter a number: done
//Numbers: 100, 200, 1000, 300
//The average is 400.0
//The minimum is 100
//The maximum is 1000
//The standard deviation is 353.55

package Assignment2.ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex36 {

    private static final Scanner in = new Scanner(System.in);

    private static String listofNumbers;

    public static void main(String[] args){

        input();
        average();

    }

    private static void input() {


        List<String> listofNumbers = new ArrayList<String>();

        while (true){
            System.out.print("Enter a number: ");
            String number = in.nextLine();

            if (number.equals("done")){

                break;
            }
            else {

                listofNumbers.add(number);
            }
        }

        System.out.print("Numbers:" + listofNumbers);


    }

    private static void average(ArrayList listofNumbers) {

        //double doubleArray = Double.parseDouble(listofNumbers);

        int i;
        int intArray;

        intArray = new ArrayList[listofNumbers.size()];

        for(i=0; i<listofNumbers.size(); i++){

            intArray[i] = listofNumbers[i];

        }








    }
//double total = 0;
//double average = total / doubleArray.size();
// System.out.format("The average is: %.3f", average);