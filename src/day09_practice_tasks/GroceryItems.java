package day09_practice_tasks;

import java.util.Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String [] [] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
        {"Paper towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona tea", "Pepsi","Watter"}};


        for (int i = 0; i <= items.length -1; i++) {
            for (int j = 0; j <= items[i].length -1; j++) {
                String ind = items[i]  [j];

                System.out.print( ind + "\t");
            }
            System.out.println();

        }

        System.out.println("------------------------");
        for (int i =0 ; i < items.length   ; i++) {
            for (int j = items[i].length -1 ; j >= 0 ; j--) {
                String ind = items [i] [j];
                System.out.print(ind + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                String ind = items [i][j];
                System.out.print(ind + "\t");
            }
            System.out.println();
        }



    }

}
/*
   for (int j = name.length()-1; j >= 0 ; j--) {
                reverseName = reverseName + name.charAt(j);

            }
            System.out.println(reverseName);
 */

