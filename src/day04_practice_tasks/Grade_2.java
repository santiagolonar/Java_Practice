package day04_practice_tasks;

public class Grade_2 {

    public static void main(String[] args) {

        char grade = 'D';
        String message = "Invalid Grade";

        switch (grade) {
            case 'A' -> message =  "Excellent";
            case 'B' -> message =  "Great Job";
            case 'C' -> message =  "Good";
            case 'D' -> message =  "Passed";
            case 'F' -> message =  "Failed";
        }
        System.out.println("Your grade is: " + grade + " , " +  message);


    }
}
