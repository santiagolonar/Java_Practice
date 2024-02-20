package day_10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String [] str1 = {"A","B", "C"};
        String [] str2 = {"D","E", "F", "G"};

        ArrayList <String> list = new ArrayList<>();
        for (String values : str1){
            list.add(values);
        }
        for (String values : str2){
            list.add(values);
        }

        System.out.println(list);





    }
}
