import java.util.Scanner;
    // Q : 1 ;
    // AUTHOR: ARGHA DIGAR
    // TITLE: CompareFloats
    // DESCRIPTION: This program reads two floating-point numbers and tests whether they are the same up to three decimal places.

public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Multiply by 1000 and convert to integers
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);

        // Compare the integer representations
        if (intNum1 == intNum2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are not the same up to three decimal places.");
        }

        scanner.close();
    }
}
