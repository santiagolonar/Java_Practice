package day04_practice_tasks;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int number = 200;
        String split = " ";


        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                split = "20 crew, 30 passengers ";
            } else if (number == 75) {
                split = "25 crew, 50 passengers ";
            } else if (number == 100) {
                split = "30 crew, 70 passengers ";

            }

        } else {
            split = "Invalid number, (there should be 50, 75 or 100 number of people) ";
        }

        System.out.println(split);

    }
}