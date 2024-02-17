package day08_practice_tasks;


public class EmailTask1 {

    public static void main(String[] args) {

        String email =  "mike_tyson@gmail.com ";



        if (email.contains("_")){
            String nameOfEmail = email.substring(0,email.indexOf("_"));
            System.out.println(nameOfEmail);

            String lastNameOfEmail = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            System.out.println(lastNameOfEmail);

            String domain = email.substring(email.indexOf("@"));

            System.out.println(lastNameOfEmail + "_" + nameOfEmail+ domain);
        }


        else {
            System.out.println(email);
        }





    }
}
