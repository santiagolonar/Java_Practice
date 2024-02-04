package day06_practice_tasks;

public class OddAndEven {

    public static void main(String[] args) {

        boolean result = isOdd(4);
        System.out.println("Is the number odd?: " + result);

        boolean result2 = isEven(4);
        System.out.println("Is the number even?: " + result2);

    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;


        }
    }
}