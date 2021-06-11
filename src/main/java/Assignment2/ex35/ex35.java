///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 35
//// *  Copyright 2021 Steven Ortiz
//// */

//Enter a name: Homer
//Enter a name: Bart
//Enter a name: Maggie
//Enter a name: Lisa
//Enter a name: Moe
//Enter a name:
//The winner is... Maggie.

package Assignment2.ex35;

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class ex35 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        namesLoop();

    }

    private static void namesLoop(){

        String input;

        List<String> listofNames = new ArrayList<String>();

        while (true){
            System.out.print("Enter a name: ");
            input = in.nextLine();

            if (input == ""){

                break;

        }
            else {

                listofNames.add(input);
            }
        }

        Random rand = new Random();

        int randomInt = rand.nextInt(listofNames.size());

        String randomName = listofNames.get(randomInt);

        System.out.print("The winner is..." + randomName);
    }
    }
