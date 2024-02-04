package day05_practice_tasks;

public class SumOfNumbers {
    public static void main(String[] args) {

        int number = 50;
        int change = 0;
        for (int i = 1; i <= number ; i++) {
            change += i;

        }
        System.out.print(change);
    }
}
