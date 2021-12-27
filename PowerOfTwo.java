package company;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number less than 31 to print power of 2 from 1 to N:");
        int number = scanner.nextInt();
        scanner.close();
        if(number > 0 && number < 31)
        {
            double powerValue = Math.pow(2, number);
            System.out.println(powerValue);

            for(int i = 0; i <= number; i++)
            {
                System.out.println("2^" + i + "=" + Math.pow(2, i));
            }

        }
        else {
            System.out.println("Overflow an Interger");
        }
    }
}
