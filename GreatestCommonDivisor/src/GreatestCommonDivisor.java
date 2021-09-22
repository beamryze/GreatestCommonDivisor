/*
 *  Assignment PreLab 5
 *  Description: Case Study for Greatest Common Denominator section 5.8.1
 *  Name: Rick
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
	// write your code here

        // Declaring input object
        Scanner input = new Scanner(System.in);

        // Prompt for first integer input
        System.out.print("Enter first integer: ");

        // Input for first integer
        int inp1 = input.nextInt();

        // Prompt for second integer input
        System.out.print("Enter second integer: ");

        // Input for second integer
        int inp2 = input.nextInt();


        // Init greatest common denominator
        int gcd = 1;

        // Using for loop instead of while to find gcd
        for (int c = 2; c <= inp1 && c <= inp2; c++) { if (inp1 % c == 0 && inp2 % c == 0)
            gcd = c; }

        // Print greatest common denominator.
        System.out.println("The greatest common divisor for " + inp1 + " and " + inp2 + " is " + gcd);
    }
}
