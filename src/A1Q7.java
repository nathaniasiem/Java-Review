
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
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        //set variable for starting year
        int initYear = 1999;
        //set variable for starting population
        int initPop = 6;
        //set variable for year
        int year = 0;

        //create formula to calculate rate
        while (true) {
            
            double futrPop = Math.pow(1.014, year);
            double popRate = initPop * futrPop;
            //condition when population exceeds 10 billion
            if (popRate > 10) {
                System.out.println((year + initYear) + " will be the year that the population will exceed 10 billion ");
                break;
            }
            //increae counter for number of years
            year++;

        }

    }
}
