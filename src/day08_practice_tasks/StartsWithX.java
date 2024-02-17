package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Please enter a word: ");

        word.close();

        String output = word.next();

            output = output.replaceFirst("x","a" );
            System.out.println(output);
        }
    }

