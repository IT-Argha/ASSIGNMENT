        // Q: 1
        // AUTHOR: ARGHA DIGAR
        // TITLE: LeapYearChecker
        // DESCRIPTION: This program takes a year from the user and prints whether it's a leap year or not.

        // Q: 1
        // AUTHOR: ARGHA DIGAR
        // TITLE: LeapYearChecker
        // DESCRIPTION: This program takes a year from the user and prints whether it's a leap year or not.
        
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If it's divisible by 100, it must also be divisible by 400 to be a leap year
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
