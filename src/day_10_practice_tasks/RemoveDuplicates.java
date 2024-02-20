package day_10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        ArrayList <Integer> output = new ArrayList<>();

        for (Integer each : list) {
            if (!output.contains(each)) {

                output.add(each);
            }

        }
        System.out.println(output);
    }
}
