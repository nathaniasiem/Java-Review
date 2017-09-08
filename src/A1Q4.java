
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
        //ask user to enter a number from 1-10
        System.out.println("Please enter a number between 1 and 10");
       
        int num = input.nextInt();
        if(num>10){
            
        }else if (num<1){
            
        }
        //create loop to count the number of asterisks user entered
        for (int i = 0; i < num; i++) {
            //print out the asterisks
            System.out.print("*");
        }
    }
}

