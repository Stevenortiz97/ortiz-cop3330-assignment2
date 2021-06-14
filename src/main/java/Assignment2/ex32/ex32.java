///*
//// *  UCF COP3330 Summer 2021 Assignment 2 - 32
//// *  Copyright 2021 Steven Ortiz
//// */

//Let's play Guess the Number!
//
//Enter the difficulty level (1, 2, or 3): 1
//I have my number. What's your guess? 5
//Too low. Guess again: 7
//Too low. Guess again: 9
//You got it in 3 guesses!
//
//Do you wish to play again (Y/N)? y

package Assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class ex32 {

    private static final Scanner in = new Scanner(System.in);

        public static void main(String[] args) {

            String repeat;


            letsPlay();

            do {

                System.out.print("Enter the difficulty level (1, 2, 3): ");
                int difficulty = in.nextInt();

                int range;

                if (difficulty == 1) {

                    range = 10;
                    game(range);

                } else if (difficulty == 2) {

                    range = 100;
                    game(range);

                } else if (difficulty == 3) {

                    range = 1000;
                    game(range);


                }else{

                    System.out.print("That is not a proper input. ");
                }

            } while(true);

            //System.out.println("Do you wish to play again (Y/N)?");
            //repeat = in.nextLine();

            //if (repeat == "Y"){

                //break;
            }
            //else;


        //}

        private static void game(int num) {
            int guess;
            int random;
            int count = 1;
            String repeat;



            Random randomGen = new Random();

            random = randomGen.nextInt(num);

            System.out.print("I have my number. What's your guess? ");

            guess = in.nextInt();

            do {
                if( guess < random ){
                    System.out.println("Too low. Guess again: ");
                    guess = in.nextInt();
                    count ++;

                }
                if( guess > random ){
                    System.out.println("Too high. Guess again: ");
                    guess = in.nextInt();
                    count ++;

                }
                if( guess == random){
                    System.out.println("You got it in " + count + " guesses!");


                    break;

                }

            } while(true);
        }

        public static void letsPlay(){

            System.out.println("Let's play Guess the Number!");
        }

    }