///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 37
//// *  Copyright 2021 Steven Ortiz
//// */

//What's the minimum length? 8
//How many special characters? 2
//How many numbers? 2
//Your password is aurn2$1s#



package Assignment2.ex37;
import java.util.Scanner;

public class ex37 {

        private static final Scanner in = new Scanner(System.in);
        private static double num;
        private static double characters;
        private static double min;

        private static void input(){

            System.out.print("What's the minimum length?");

            min = in.nextInt();

            System.out.print("How many special characters?");

            characters = in.nextInt();

            System.out.print("How many numbers?");

            num = in.nextInt();
        }
    public static void main(String[] args){

        input();

        generator rpg = new generator();

        generator.generate(min, characters, num);
    }

    }
