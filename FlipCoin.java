package company;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of  how  many Times you want to Flip coin:");
        final int noOfFlips = scanner.nextInt();//Constant
        scanner.close();
        int heads = 0;
        int tails = 1;
        // if noOfFlips are positive then the Program will execute
        if (noOfFlips >= 0){
            int random = (int) Math.floor(Math.random() * 2);
            for (int i = 0; i < noOfFlips; i++) {
                if (random > 0.5) {
                    tails++;
                }
                else {
                    heads++;
                }
            }
            System.out.println("Number of Times Heads comes :" + heads);
            System.out.println("Number of Times Tails comes :" + tails);
            int tailsPercentage =(100 * tails) / noOfFlips;
            int headsPercentage =(100 * heads) / noOfFlips;;
            System.out.println("Heads Percentage is :" + headsPercentage);
            System.out.println("Tails Percentage is :" + tailsPercentage);
        }
        else{
            System.out.println("Enter Positive Number");
        }
    }
}
