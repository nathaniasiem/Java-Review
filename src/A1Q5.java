
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner (System.in);
        //ask a user to enter a number between 1-10
        System.out.println("Enter a number between 1 and 10.");
        int number = input.nextInt();
        //runs through number of asterisks needed for length
        for (int i=0; i<number;i++){
            //runs through number of asterisks needed for width
            for (int j = 0; j < number; j++) {
            //print out the width
            System.out.print("*");
        }
            //print out length
            System.out.println("");
        }
    }
}
