package day04_practice_tasks;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 10;
        int days= 1;

        if (month >0 && month <13 ){

            switch (month){
                case 2:
                    days = 28;
                    break;

                    case 4,6,9,11:
                    days = 30;
                    break;

                    case 1,3,5,7,8,10,12:
                    days = 31;
                    break;
            }

        } else{
            System.out.println("Invalid");

        }
        System.out.println(days + " days");

    }
}
