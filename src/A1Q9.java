
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
        Scanner input = new Scanner (System.in);
        
        //create an array to store in 10 words
        String [] words = new String[10];
        
        //create variable to keep count of characters
        int total = 0;
        
        for(int i =0;i<10;i++){
            System.out.println("Enter a word.");
            words[i]=input.nextLine();
            int wLength = words.length;
            System.out.println("");
            
        }
    }
}
