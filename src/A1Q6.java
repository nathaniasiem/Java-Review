
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
        Scanner input = new Scanner(System.in);

        //instruct user how to use program
        while (true) {
            System.out.println("Enter the number between 50 and 100.When finished type in END to end the program.");
            int num = input.nextInt();
            String word = input.nextLine();
            //condition for user to input numbers between 50 and 100
            if (num <= 100 && num >= 50) {
                //countsdown from 100
                for (int i = 100; i >= num; i = i - 5) {
                    System.out.println(i);
                }
            // condition when number is greater than 100/less than 50
            } else {
                System.out.println("ERROR.REENTER A NUMBER BETWEEN 50 AND 100");
            }
            //condition when user wants to end program
            if (word.equals("END")) {
                break;
            }
        }
    }
}
