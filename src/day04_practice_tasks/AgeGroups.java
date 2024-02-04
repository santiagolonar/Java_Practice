package day04_practice_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 99;
String category = "Invalid age";

       if (age >= 150 || age <= 0) {
           System.out.println(category);
       } else {

           if (age >= 55) {
               category = "Senior";
           } else if (age >= 21) {
               category = "Adult";
           } else {
               category = "Teenager";
           }
           System.out.println("your age is " + category);
       }
    }
}
