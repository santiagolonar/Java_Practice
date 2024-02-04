package day04_practice_tasks;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 11;
        double n2 = 0;
        char ch1 = '/';
        double operation =0 ;

        switch (ch1){
            case '+' -> operation = (n1+n2) ;
            case '-' -> operation = (n1-n2) ;
            case '*' -> operation = (n1*n2) ;
            case '/' -> operation = (n1/n2) ;
            default -> System.out.println("Invalid operation");
        }
        System.out.println(operation);
    }
}
