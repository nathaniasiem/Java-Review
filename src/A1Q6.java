
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner (System.in);
        //ask user to input number between 50-100
        System.out.println("Enter the number between 50 and 100.");
        int num =input.nextInt();
        //condition
        //countsdown from 100
        for(int i=100;i>=num;i=i-5){
            System.out.println(i); 
        }
    }
}
