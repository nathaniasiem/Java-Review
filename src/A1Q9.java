
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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //create an array to store in 10 words
        String[] words = new String[10];

        //create variable to keep count of characters
        int total = 0;

        //create loop to go through words within the array
        //asks user to enter a word
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a word.");
            words[i] = input.nextLine();
            //create loop to keep track of number of letters              
        }
        for (int i = 0; i < 10; i++) {
            String term = words[i];
            //convert word to character length in numbers
            int count = term.length();
            //add to variable
            total = count + total;
        }
        //calculate average word length
        int avg = total / 10;
        System.out.println("The average word length is " + avg + " character(s) long.");
    }
}
