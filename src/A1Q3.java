
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to scan user input
        Scanner input = new Scanner(System.in);

        //inform user about questionnaire to calculate the break even point
        System.out.println("Promptly,you will be asked a few questions to find the break even point.");

        //ask how much the costs for food
        System.out.println("How much are the costs for food?");
        double food = input.nextDouble();
        //ask how much the costs for DJ
        System.out.println("How much are the costs for the DJ?");
        double dj = input.nextDouble();
        //ask how much the costs the hall rental
        System.out.println("How much are the costs for the hall rental?");
        double hRental = input.nextDouble();
        //ask how much the costs are for the decorations
        System.out.println("How much are the costs for the decorations?");
        double decor = input.nextDouble();
        //ask how much the costs are for the wait staff
        System.out.println("How much are the costs for the wait staff?");
        double wStaff = input.nextDouble();
        // ask for any additional expenses
        System.out.println("Enter any additional miscellaneous costs.");
        double mCosts = input.nextDouble();

        //calculate the total
        double sum = food + dj + hRental + decor + wStaff + mCosts;
        System.out.println("The total cost is: " + sum + ".");

        //ask user abouy the price of ticket
        System.out.println("How much are the price of the tickets?");
        double ticket = input.nextDouble();

        //calculate the break even point
        double BEP = sum / ticket;
        System.out.println("You need to sell " + BEP + " tickets in order to break even.");

    }
}
