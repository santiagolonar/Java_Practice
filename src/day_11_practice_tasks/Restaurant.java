package day_11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.servers = new ArrayList<>();
        this.chefs = new ArrayList<>();
    }

    public void hireServer(Server serverVar){
        servers.add(serverVar);
    }

    public void hireServer(Server[] serverArray){
        servers.addAll(Arrays.asList(serverArray));
    }
    public void hireChef (Chef chef){
        chefs.add(chef);
    }

    public void hireChef (Chef [] chefArray){
        chefs.addAll(Arrays.asList(chefArray));
    }

    public void terminateChef (int employeeID) {
        chefs.removeIf(p -> p.employeeId == (employeeID));
    }

    public void  terminateServer (int employeeIDServ) {
        servers.removeIf(p ->p.employeeId == employeeIDServ);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                ", numberOfChefs="+ chefs.size() +
                ", numberOfServers=" + servers.size() +
                '}';
    }
}



