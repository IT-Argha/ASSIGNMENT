
        // Q: 8
        // AUTHOR: ARGHA DIGAR
        // TITLE: SeriesSum
        // DESCRIPTION: This program calculates the sum of the series 1 - X^2/2! + X^4/4! - ... up to the nth term.

import java.util.Scanner;

public class SeriesSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sum = 1.0; // Initialize sum with the first term
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= (-1) * x * x / (2 * i); // Calculate the next term
            sum += term; // Add the term to the sum
        }

        System.out.println("The sum of the series is: " + sum);

        scanner.close();
    }
}
