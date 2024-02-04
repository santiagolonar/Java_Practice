package day04_practice_tasks;

public class ChooseLanguage {

    public static void main(String[] args) {

        int language = 100;

        if (language == 1) {
            System.out.println("Hello, thank you for your call ");
        } else if (language == 2) {
            System.out.println("Hola, gracias por llamar");
        } else if (language == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        } else if (language == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        } else if (language == 4) {
            System.out.println(" Merci, pour votre appel");
        }

        else {
            System.out.println("That language is not available");
        }
    }


}
