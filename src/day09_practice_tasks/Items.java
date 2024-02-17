package day09_practice_tasks;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {

        String [] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "i Phone 12 case" };
        double [] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 439.50, 39.99};
        int [] itemIDs = {12345, 12346, 12347, 12348, 12349, 123450};

        int indexOfGloves= 0;
        boolean iPadOnList = false;

        for (int i = 0; i < items.length; i++) {

            if ( items[i].equals("Gloves")){
                indexOfGloves = i;
            }
            if (items[i].contains("iPad")){
                iPadOnList = true;
            }


            System.out.println(items[i] + " - " + "$"+ prices[i] + " - " + itemIDs[i]);
        }
        System.out.println(indexOfGloves);
        System.out.println(iPadOnList);

    }
}
