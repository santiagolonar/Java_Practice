package day08_practice_tasks;

public class EmailTask2 {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String name = email.substring(0,email.indexOf("_"));
        String namePrint = name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println("Name : " + namePrint);


        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String lastNamePrint = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println("Last name: "  + lastNamePrint);

        String domain = email.substring(email.indexOf("@")+1 ,email.indexOf(".") );
        System.out.println("Domain: " +  domain);

    }
}
