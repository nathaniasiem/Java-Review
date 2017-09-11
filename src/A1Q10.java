
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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //create a variable to keep track number of words entered
        int count = 0;

        //ask user to enter a word
        while (true) {
            System.out.println("Enter a word.");
            String word = input.nextLine();
            //change any word entered into lowercase
            word = word.toLowerCase();
            //increase counter of words
            count++;
            //when user wants to end program
            //condition when they enter exit
            if (word.equals("exit")) {
                //need to subtract one from count in order to prevent program to count the user prompting "exit"
                System.out.println("You have entered " + (count - 1) + " word(s).");
                break;
            }
        }
    }
}
