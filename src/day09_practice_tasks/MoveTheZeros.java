package day09_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {


        int[] numbers = {10, 0, 5, 0, 1, 0};
        int [] newList = new int [6];
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 ) {
                newList[j] = numbers[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(newList));
    }
}
