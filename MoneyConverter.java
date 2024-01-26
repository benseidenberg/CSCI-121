import java.util.Scanner;

import static java.lang.Math.floor;


public class MoneyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in dollars and cents:");
        double amount = sc.nextDouble();

        // Convert dollars and cents to cents
        int totalCents = (int) (amount * 100);

        // Calculate the number of quarters, nickels, and dimes
        int quarters = totalCents / 25;
        int remainingCentsAfterQuarters = totalCents % 25;

        int dimes = remainingCentsAfterQuarters / 10;
        int remainingCentsAfterDimes = remainingCentsAfterQuarters % 10;

        int nickels = remainingCentsAfterDimes / 5;
        if (remainingCentsAfterDimes % 5 != 0) {
            int pennies = remainingCentsAfterDimes % 5;
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);
        }
        else {
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
        }


        sc.close();

    }
}

