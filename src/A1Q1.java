
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner (System.in);
        //ask for user input
        System.out.println("Enter your name.");
        //user input for name
        String name=input.nextLine();
        //say hello to user
        System.out.println("Hello " + name + "!");
    }
}
