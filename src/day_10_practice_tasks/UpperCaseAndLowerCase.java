package day_10_practice_tasks;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int isLower = 0;
        int isUpper = 0;


        for (char ch : str.toCharArray())
            if (Character.isLetter(ch)) {

                if (Character.isLowerCase(ch)) {
                    isLower += 1;
                } else {
                    isUpper += 1;
                }
            }
        System.out.println(isLower);
        System.out.println(isUpper);

        System.out.println(isLower == isUpper);

    }
    }
