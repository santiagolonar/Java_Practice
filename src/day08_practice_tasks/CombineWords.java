package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner combineWords = new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        String firstWord = combineWords.next();

        System.out.println("Please enter the second word: ");
        String secondWord = combineWords.next();

combineWords.close();

        if (firstWord.charAt(firstWord.length() -1 ) == secondWord.charAt(0)) {
            System.out.println(firstWord + secondWord.substring(1));}

        else {
            System.out.println(firstWord + " " +  secondWord);
        }



    }
}
