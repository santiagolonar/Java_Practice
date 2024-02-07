package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = myInfo.nextInt();

        System.out.println("Enter your gender: ");
        String gender = myInfo.next();



        System.out.println("Enter your full name: ");
        myInfo.nextLine();
        String fullName = myInfo.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = myInfo.nextLong();

        System.out.println("Enter your full zip code: ");
        int zipCode = myInfo.nextInt();

        System.out.println("Enter your School name: ");
        myInfo.nextLine();
        String SchoolsName = myInfo.nextLine();

        System.out.println("Enter your City's name: ");
        String cityName = myInfo.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = myInfo.next();

        System.out.println("Enter your building number: ");
        int buildingNumber = myInfo.nextInt();

        System.out.println("Enter your street name: ");
        myInfo.nextLine();
        String streetName = myInfo.nextLine();

        System.out.println("\t" + fullName + "\n\t" + age + "\n\t" + gender + "\n\t" + phoneNumber + "\n\t" + "Address : " + "\n\t\t" + buildingNumber + " " + streetName +
                "\n\t\t" + cityName + "," +  stateName + " " + zipCode    );


    }
}
