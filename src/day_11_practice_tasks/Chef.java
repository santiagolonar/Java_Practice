package day_11_practice_tasks;

public class Chef {

    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void makeOrder (){
        System.out.println(name + " Is making an order");
    }
    public void washDishes (){
        System.out.println(name + "Is washing the dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
