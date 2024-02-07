package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner milesToKm = new Scanner(System.in);
        System.out.println("Enter the miles:");

        double input= milesToKm.nextDouble();
        System.out.println(input + " miles is equal to " + (input * 1.609) + " Kilometers");

    }
}
