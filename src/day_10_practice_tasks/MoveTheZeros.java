package day_10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {
        ArrayList <Integer> list2 = new ArrayList<>();

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        for (Integer i : list) {
            if (i != 0){
                list2.add(i);
            }
        }
        for (Integer i : list) {
            if (i ==0){
                list2.add(i);
            }

        }
        System.out.println(list2);
        }

    }

//*list.addAll( Arrays.asList