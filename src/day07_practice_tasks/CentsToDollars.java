package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner cents = new Scanner(System.in);
        System.out.println("Enter the number of cents: ");

        int input = cents.nextInt();
        int oneDollar = input/100;
        int remainingCents = input - oneDollar * 100;

        System.out.println(input + " Cents is equal to " + oneDollar + " dollars and " + remainingCents+ " cents");


    }
}
