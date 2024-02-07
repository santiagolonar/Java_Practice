package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = " John";
        employee1.age = 29;
        employee1.gender = 'M';
        employee1.jobTitle = "PM";
        employee1.salary = 90_000;

        System.out.println(employee1);
        employee1.work();


        Employee employee2 = new Employee();
        employee2.name=" Sarah";
        employee2. age = 25;
        employee2.gender = 'F';
        employee2.jobTitle = "SDET";
        employee2.salary = 75_000;

        System.out.println(employee2);
        employee2.work();


    }



}
