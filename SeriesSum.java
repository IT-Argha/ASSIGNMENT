     // Q: 1
    // AUTHOR: ARGHA DIGAR
    // TITLE: SeriesSum
    // DESCRIPTION: This program calculates the sum of the series 1 + 1/2^2 + 1/3^3 + ... + 1/n^n.


import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
    

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double term = 1.0 / Math.pow(i, i);
            sum += term;
        }

        System.out.println("The sum of the series is: " + sum);
    }
        
}

