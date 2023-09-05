     // Q: 1
    // AUTHOR: ARGHA DIGAR
    // TITLE: SumOfDigits
    // DESCRIPTION: This program calculates the sum of the digits of a given integer.
    
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits of " + originalNumber + " is " + sum);

        scanner.close();
    }
}

