package day_12_practice_tasks;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("length cant be negative or zero.");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0) {
            System.err.println("width cant be negative or zero.");
            System.exit(1);
        }
        this.width = width;
    }
    public double calcArea () {
        double area = width * length;
    return area;
    }
    public double calcPerimeter () {
        double perimeter = (width + width) +(length+length);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "area=" + calcArea()+
                "perimeter="+ calcPerimeter() +
                '}';
    }
}
