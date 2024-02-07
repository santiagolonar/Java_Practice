package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner answer = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int input = answer.nextInt();

        if (input > 6){
            System.out.println( " Live with more than six people.");
        } else if (input >=3 ) {
            System.out.println("Live with 3 - 6 people.");
        }else {
            System.out.println("Live with less than three people.");
        }


    }
}
