package day_11_practice_tasks;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public double calcCost() {
        double cost = 0.0;
        if (size.equalsIgnoreCase("Small")) {
            cost = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);

        } else if (size.equalsIgnoreCase("Medium")){
            cost = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);

        }else if (size.equalsIgnoreCase("Large")) {
            cost = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else {
            System.out.println("Size is invalid ");
        }

        return cost;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", costOfPizza " + calcCost() +
                '}';
    }
}

