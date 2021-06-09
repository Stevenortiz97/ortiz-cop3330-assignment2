package Assignment2.ex26;

import java.lang.Math;

public class PaymentCalculator {

    public double calculateMonthsUntilPaidOff(double balance, double aprDecimal, double payment) {

        double dailyRate;
        double months;


        dailyRate = aprDecimal / 365.0;

        ////n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

        months = -(1.0 / 30) * Math.log((1 + balance / payment * (1 - Math.pow((1 + dailyRate), 30))) / Math.log((1 + dailyRate));

        return months;

    }
}
