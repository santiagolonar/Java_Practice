package day_11_practice_tasks;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("jorge", "Crr 1 # 3-42 Full AV. ", 5);

        Server[] Server = {
                new Server("Charlie", 354489, 12.5, true),
                new Server("Omar", 897822, 12.5, false)
        };

        Chef[] Chefs = {
                new Chef("carlos", 285564, 15.4, true),
                new Chef("Maria", 875169, 15, true)
        };

        restaurant1.hireChef(Chefs);
        restaurant1.hireServer(Server);
        System.out.println(restaurant1);
    }

}
