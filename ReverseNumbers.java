// Q: 1
// AUTHOR: ARGHA DIGAR
// TITLE: ReverseNumbers
// DESCRIPTION: This program displays numbers in reverse order.

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Number in Reverse Order: " + reversedNumber);

        scanner.close();
    }
}
