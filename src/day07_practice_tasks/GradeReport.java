package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your score: ");

        int input = grade.nextInt();

        if (input > 100 || input < 0) {
            System.out.println("Invalid Score");
        } else if (input > 90) {
            System.out.println("Your grade is A ");
        } else if (input > 80) {
            System.out.println("Your grade is B ");
        }else if (input > 70) {
            System.out.println("Your grade is C ");
        }else if (input > 60) {
            System.out.println("Your grade is D ");
        }else {
            System.out.println("your grade is F ");
        }
    }
}
