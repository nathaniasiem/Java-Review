
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for user input
        Scanner input = new Scanner(System.in);
        //create list of numbers
        int[] integers = new int[3];
        //ask user to input 3 numbers
        System.out.println("Enter 3 numbers: ");
        //scan in numbers
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }
        //create accumulator 
        //find product amongst the 3 numbers
        int product = 1;
        for (int i = 0; i < integers.length; i++) {
            product = product * integers[i];
        }
        System.out.println("The product of these numbers is " + product);
        //square the product
        double square = Math.pow(product, 2);
        System.out.println("When the product is squared it equals to " + square);
        //square root of product
        double squareroot = Math.sqrt(square);
        System.out.println("The square root is " + squareroot);

    }
}
