
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        //keep program running
        while (true) {
            //ask user to enter a number from 1-10
            System.out.println("Please enter a number between 1 and 10");
            int num = input.nextInt();
            //condition if user entered a number not between 1 and 10
            if (num > 10 || num < 1) {
                System.out.println("error.");
                //create loop to count the number of asterisks user entered
            } else {
                for (int i = 0; i < num; i++) {
                    //print out the asterisks
                    System.out.print("*");
                }
                break;
            }
        }
    }
}
