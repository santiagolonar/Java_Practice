package day07_practice_tasks;

public class Rectangle {

        public double width;
        public double length;


        public void area (){
            System.out.println( width * length);
        }

        public void perimeter(){
            System.out.println(2 * ( length + width));
        }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}


