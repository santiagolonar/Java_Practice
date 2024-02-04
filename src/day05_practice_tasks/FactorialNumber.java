package day05_practice_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int hold = 1;

        for (int i = num ; i > 0 ; i--) {
             hold *= i;
        }
        System.out.println(hold);
    }
}
