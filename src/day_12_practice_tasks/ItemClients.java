package day_12_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item("tomato",1.25,8);
        System.out.println(item1);

        item1.setUnitPrice(80);
        System.out.println(item1.calcCost()); //item1.calcCost();


    }
}
