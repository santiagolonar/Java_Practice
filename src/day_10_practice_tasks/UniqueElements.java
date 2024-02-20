package day_10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        ArrayList<Integer> output = new ArrayList<>(list);


        output.removeIf(p -> Collections.frequency(output,p) >1);
        System.out.println(output);

    }


    }

