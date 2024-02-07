package day07_practice_tasks;

public class AddressClient {

    public static void main(String[] args) {

        Address address1 = new Address ();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city =  "McLean";
        address1.state = "VA";
        address1.zipCode = "22012";
        System.out.println(address1);

        //address1.toString();

        System.out.println("--------------");

        Address address2 = new Address ();
        address2.buildingNumber = 8415;
        address2.street = "JJames Drr";
        address2.city =  "Chicago";
        address2.state = "IL";
        address2.zipCode = "31598";
        System.out.println(address2);



    }
}
