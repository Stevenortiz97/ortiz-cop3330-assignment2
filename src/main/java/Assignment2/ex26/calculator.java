/*
// *  UCF COP3330 Summer 2021 Assignment 2 - 26
// *  Copyright 2021 Steven Ortiz
// */

//What is your balance? 5000
//What is the APR on the card (as a percent)? 12
//What is the monthly payment you can make? 100
//It will take you 70 months to pay off this card.



package Assignment2.ex26;

import java.lang.Math;

public class calculator {


    public double calculate_months(double balance, double aprDecimal, double payment) {

        double dailyRate;
        double months;
        double monthsRounded;


        dailyRate = aprDecimal / 365.0;

        ////n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

        months = -(1.0 / 30) * Math.log((1 + balance / payment * (1 - Math.pow((1 + dailyRate), 30)))) / Math.log((1 + dailyRate));

        monthsRounded = Math.ceil(months);

        return monthsRounded;

    }


}
