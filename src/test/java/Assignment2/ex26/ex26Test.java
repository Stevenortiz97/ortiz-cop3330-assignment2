/*
// *  UCF COP3330 Summer 2021 Assignment 2 - 26
// *  Copyright 2021 Steven Ortiz
// */

//What is your balance? 5000
//What is the APR on the card (as a percent)? 12
//What is the monthly payment you can make? 100
//It will take you 70 months to pay off this card.


package Assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex26Test {

    @Test
    void main() {
 {

            double n;
            double i = 25 / 365.0;
            double b = 1000;
            double p = 300;

            n = -( 1.0 / 30.0 ) * Math.log( (1 + b/p * ( 1 - Math.pow( ( 1 + i ), 30 ) ) ) ) / Math.log( ( 1 + i ) );
            int n_final_value = (int) Math.ceil(n);

            assertEquals(325,n_final_value);

        }

    }
}