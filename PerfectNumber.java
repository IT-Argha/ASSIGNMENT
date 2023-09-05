
    // Q: 1
    // AUTHOR: ARGHA DIGAR
    // TITLE: PerfectNumber
    // DESCRIPTION: This program finds perfect numbers between 1 and the specified upper limit.
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        for (int i = 1; i <= upperLimit; i++) {
            int sumOfDivisors = 1;

            // Optimized loop to find divisors
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    sumOfDivisors += j;
                }
            }

            if (sumOfDivisors == i) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
