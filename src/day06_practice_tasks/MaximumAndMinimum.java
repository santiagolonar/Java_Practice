package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {
        int maxNum = max(8, 5);
        System.out.println(maxNum);

        // 2.2 max double
        double maxDouble = max(12.2, 18.5);
        System.out.println(maxDouble);

        // 2.3 min int
        int minInt = min(23,4);
        System.out.println(minInt);

        //2.4 min double
        double minDouble = min(22.5,40.56);
        System.out.println(minDouble);


    }


    public static int max(int number, int number2) {
        if (number > number2) {
            return number;
        } else {
            return number2;
        }
    }

    public static double max(double number, double number2) {
        if (number > number2) {
            return number;
        } else {
            return number2;
        }
    }

    public static int min (int number, int number2) {
        if (number > number2) {
            return number2;
        } else {
            return number;
        }

    }

    public static double min (double number, double number2){
        if (number > number2){
            return number2;

        }else {
            return number;
        }
    }
}