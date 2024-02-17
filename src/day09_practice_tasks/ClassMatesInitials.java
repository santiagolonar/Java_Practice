package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String [] classMates = new String[10];

        classMates [0]= "John Beckler";
        classMates [1]= "Adrian Ramos";
        classMates [2]="Susan Ochoa";
        classMates [3]="Diego Mota";
        classMates [4]="Gaston Bustamanete";
        classMates [5]= "Jennifer Anderson";
        classMates [6]= "Carlos Valderrama";
        classMates [7]="Juan Silva";
        classMates [8]="Leonel Messi";
        classMates [9]= "Leonel Alvarez";

        for (int i = 0; i < classMates.length; i++) {
            System.out.println(classMates[i].charAt(0) + " " + classMates[i].charAt(classMates[i].indexOf(" ") +1 ));

        }


        //String[]organize  =Arrays.copyOfRange(classMates,0,1);
        //System.out.println(Arrays.toString(organize));







    }
}
