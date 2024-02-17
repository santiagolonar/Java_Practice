package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        int[] array1 = new int[100];
        array1[1] = 1;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.print(( " " + array1[i]));
        }
        System.out.println(" ");

        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(" " + array1[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i +1;

            if (array1[i] % 5 ==0){
                System.out.print(" " +array1[i]);
            }

        }


    }
}
