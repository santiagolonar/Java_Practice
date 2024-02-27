package day_11_practice_tasks;

public class Carpet {

    //attributes:
    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public double calcCost() {
        double cost = 0.0;

        if (isPersian == false) {
            cost = (width * length) * unitPrice;

        } else if (isPersian == true) {
            cost = (((width * length) * unitPrice) + 200);
        } else {
            System.out.println("Invalid information");
        }
return cost;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", calcCost=" + calcCost() +
                '}';
    }
}
