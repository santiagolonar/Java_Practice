package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.unitPrice = 2.250;
        item1.quantity =100;
        System.out.println(item1);

        item1.calculateCost();
        System.out.println(item1.calculateCost());

        System.out.println("-----------------------");
        Item item2 = new Item();
        item2.unitPrice = 350;
        item2.quantity = 20;
        System.out.println(item2);

        item2.calculateCost();


        }
    }

/* Employee employee1 = new Employee();
        employee1.name = " John";
        employee1.age = 29; */