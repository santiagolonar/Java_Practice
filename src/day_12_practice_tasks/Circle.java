package day_12_practice_tasks;


public class Circle {
    private double radius ;

    public Circle(double radius) {
        setRadius(radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Radius cannot be less or equal to zero.");
            System.exit(1);
        }
        this.radius = radius;
    }
    public double calcArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }

    public double calcPerimeter (){
        double perimeter = (radius + radius) * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea()+
                "perimeter=" + calcPerimeter()+
                '}';
    }
}
