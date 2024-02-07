package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {

        double operation = calculate(52.2, '+', 98.2);
        System.out.println(operation);

        int operationInt = calculate(1, '+', 88);
        System.out.println(operationInt);

        int squareOperation = square(10);
        System.out.println(squareOperation);

        double squareOperationDouble = square(20.5);
        System.out.println(squareOperationDouble);

        int cubeOperation = cubeInt(3);
        System.out.println(cubeOperation);

    }

    public static double calculate(double num1, char sign, double num2) {

        double answer = 0;

        switch (sign) {
            case '+' -> answer = (num1 + num2);
            case '-' -> answer = (num1 - num2);
            case '*' -> answer = (num1 * num2);
            case '/' -> answer = (num1 / num2);
            default -> answer = 0;
        }
        return answer;
    }

    public static int calculate(int num1, char sign, int num2) {

        int answer = 0;

        switch (sign) {
            case '+' -> answer = (num1 + num2);
            case '-' -> answer = (num1 - num2);
            case '*' -> answer = (num1 * num2);
            case '/' -> answer = (num1 / num2);
            default -> answer = 0;
        }
        return answer;
    }

    public static int square(int num1) {
        int squareAnswer = calculate(num1, '*', num1);
        return squareAnswer;
    }

    public static double square(double num1) {
        double squareAnswer = calculate(num1, '*', num1);
        return squareAnswer;
    }

    public static int cubeInt(int num1) {
        int cubeAnswer = square(num1) * num1;
        return cubeAnswer;
    }
}
