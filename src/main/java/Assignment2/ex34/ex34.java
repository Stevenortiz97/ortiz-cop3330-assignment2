package Assignment2.ex34;
import java.util.Random;
import java.util.Scanner;

public class ex34 {

        private static final Scanner in = new Scanner(System.in);

        private static String stringSubtract;

        public static void main(String[] args){

            allEmployees();

            names nlr = new names();
            nlr.updatedNames(stringSubtract);

        }

        private static void allEmployees(){

            System.out.print("""
                There are 5 employees:
                John Smith
                Jackie Jackson
                Chris Jones
                Amanda Cullen
                Jeremy Goodwin""");

            System.out.print("\r\nEnter an employee's name to remove: ");
            stringSubtract = in.nextLine();
        }


    }
