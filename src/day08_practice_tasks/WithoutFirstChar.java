package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner letter = new Scanner(System.in);
        System.out.println("Please enter the first word: ");

        String output1 = letter.next();

        System.out.println("Please enter the second word: ");


        String output2 = letter.next();

  letter.close();

        String word1 = output1.substring(1);
        String word2 = output2.substring(1);
        System.out.println(word1 + word2);
    }


}
