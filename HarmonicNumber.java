package company;

import java.util.Scanner;

public class HarmonicNumber {
    // Method to find nth harmonic Number
    public static double harmonic(int number) {
        double i, sum = 0.0;
        for (i = 1; i <= number; i++)
            sum = sum + 1 / i;
        return sum;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = scanner.nextInt();
        scanner.close();
        if (number != 0) {
            System.out.printf("Sum is %f", harmonic(number));
        } else {
            System.out.println("Number is Invalid");
        }
    }
}
