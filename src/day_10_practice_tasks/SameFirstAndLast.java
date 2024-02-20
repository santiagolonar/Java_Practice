package day_10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ana", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        String nameFinal = "";
        names.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
        System.out.println(names);

    }
}
