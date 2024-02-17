package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner tipInformation = new Scanner(System.in);
        System.out.println("Split or no split (Yes or No) ? ");
        String split = tipInformation.next();

        System.out.println("Enter the number of people: ");
        int people = tipInformation.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = tipInformation.nextDouble();

        System.out.println("How was the service quality ?");
        System.out.println("(Excellent / Great / Good / Fair / Poor");
        String service = tipInformation.next();

        double tipPercentage = 0.00;



        tipInformation.close();
        switch  (service){
        case "Poor" -> tipPercentage = 0.05 ;
        case "Fair" -> tipPercentage = 0.10 ;
        case "Good" -> tipPercentage = 0.15 ;
        case "Great" -> tipPercentage = 0.20 ;
        case  "Excellent" -> tipPercentage = 0.25;
        }

        double amountToPay = (amount * tipPercentage) + amount;


        System.out.println("Number of people entered : " + people);
        System.out.println("Total to pay " + amountToPay);
        System.out.println("Total tip: " + (amount * tipPercentage));
        System.out.println("Total per person: " + (amountToPay / people));
        System.out.println("Tip per person: " + ((amount * tipPercentage)/ people) );





    }
}
