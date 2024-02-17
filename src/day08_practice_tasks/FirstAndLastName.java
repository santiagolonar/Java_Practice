package day08_practice_tasks;

import java.util.Scanner;

public class FirstAndLastName {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println(" Write your first name: ");
        String firstName = name.next();

        System.out.println(" Write your last name: ");
        String lastName = name.next();

        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() +
                " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());
    }
}
