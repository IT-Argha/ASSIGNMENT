// Q: 1
// AUTHOR: ARGHA DIGAR
// TITLE: SquareSeriesSum
// DESCRIPTION: This program calculates the sum of the series (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n).

import java.util.Scanner;

public class SquareSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int term = i * i;
            sum += term;
        }

        System.out.println("The sum of the series is: " + sum);

       
    }
}
