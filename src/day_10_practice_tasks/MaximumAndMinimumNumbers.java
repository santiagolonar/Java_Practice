package day_10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

       int maximumNumber =  Collections.max(list);
       int minimumNumber = Collections.min(list);

        System.out.println("Maximum number is " + maximumNumber);
        System.out.println("Minimum number is " + minimumNumber);




    }
}
