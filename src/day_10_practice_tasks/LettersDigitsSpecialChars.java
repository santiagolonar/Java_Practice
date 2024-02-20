package day_10_practice_tasks;



public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String message = "Wooden Spoon123!";

        String letters = " ";

        String digits = " ";

        String specialChars = " ";

        for (char ch : message.toCharArray()){

        if (Character.isLetter(ch)) {

         letters += ch;

        } else if (Character.isDigit(ch)) {
            digits += ch;

        } else {
            specialChars += ch;
            }


        }


        System.out.println("Letters = " +" \" " + letters + " \" ");
        System.out.println("Digits = " +" \" " + digits+ " \" ");
        System.out.println("specialChars = " + " \" " + specialChars + " \" ");



    }
}
