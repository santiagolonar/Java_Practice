package day_12_practice_tasks;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.err.println("Quantity cannot be set to negative or zero");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        if (price == 0) {
            System.out.println(brand + " Is free");

        }
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println("Price cannot be negative");
            System.exit(1);

        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    // ACTIONS


    public String toString() {

        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                ", price=" + price +
                '}';
    }
}
