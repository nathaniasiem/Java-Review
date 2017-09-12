
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author candy
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for user input
        Scanner input = new Scanner(System.in);

        //ask user to input current balance
        System.out.println("Enter the value of your current savings.");
        double bAcct = input.nextDouble();

        //ask user to input the rate
        System.out.println("Enter the interest rate in decimal.");
        double rate = input.nextDouble();

        //create variable for year for million dollars
        int year = 0;
        //create variable for year for double
        int year2 = 0;

        //calculate when the savings will double up as well as continue calculating until reach 1 million
        while (true) {
            //formula to calculate the rate
            double yearRate = Math.pow((rate + 1), year);
            //year increases for million dollars savings
            year++;
            //formula to calculate the savings in account using rate formula
            double newbAcct = yearRate * bAcct;
            //condition when the account is doubled
            if (newbAcct <= (2 * bAcct)) {
                //year increases for doubled savings
                year2++;
            }
            //condition when account reaches 1 million dollars
            if (newbAcct >= 1000000) {
                //output will give the information collected during the program
                System.out.println("It will take " + (year - 1) + " year(s) to reach 1 million in savings and " + year2 + " year(s) to double.");
                break;
            }

        }

    }
}
