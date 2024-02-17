package day09_practice_tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr2 = new int[5];
        int [] arr1={1,2,3,4,5};

        for (int i = arr1.length - 1, j =0; i >= 0; i--,j++) {
            arr2 [j] = arr1[i];

        }
        System.out.println(Arrays.toString(arr2));
    }
}
