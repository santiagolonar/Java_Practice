package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner placeAndOrder = new Scanner(System.in);
        System.out.println("Please enter the product name: ");
        String productName = placeAndOrder.nextLine();


        System.out.println("Please enter the price: ");
        double price = placeAndOrder.nextDouble();

        System.out.println("Please enter quantity: ");
        int quantity = placeAndOrder.nextInt();

        System.out.println("Please enter your name: ");
        String name = placeAndOrder.next();

        System.out.println(name + " Your order for " + quantity + " " + productName + " has been placed. Your total is $" + (quantity * price) );


    }
}
