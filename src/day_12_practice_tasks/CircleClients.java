package day_12_practice_tasks;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2.20);
        System.out.println(circle1);


        Circle circle2 = new Circle(80.2);
        System.out.println(circle2);

        double areaCircle2 = circle2.calcArea();
        System.out.println(areaCircle2);

        circle2.setRadius(3.5);
        System.out.println(areaCircle2);
        System.out.println(circle2);
       areaCircle2 = circle2.calcArea();
        System.out.println(areaCircle2);
    }
}