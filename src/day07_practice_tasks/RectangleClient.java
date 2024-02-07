package day07_practice_tasks;

public class RectangleClient {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1. width = 20.5;
        rectangle1.length = 12.8;

        System.out.println(rectangle1);
        rectangle1.area();
        rectangle1.perimeter();

        System.out.println("------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2. width = 80.5;
        rectangle2. length =12.89;

        System.out.println(rectangle2);
        rectangle2.area();
        rectangle2.perimeter();
    }
}
