package day07_practice_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner circle = new Scanner(System.in);
        System.out.println("Enter the radius: ");

        double input = circle.nextDouble();

        System.out.println( "The area of the Circle is: " + (3.14 *(input * input)));
        System.out.println( "The Perimeter of the Circle is: " + (3.14 *(input + input)));


    }
}
