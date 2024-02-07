package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {

        String name = daysName(1);
        System.out.println(name);

        String nameMonth = monthsName(6);
        System.out.println(nameMonth);

        String days = dayInMonth(6);
        System.out.println(days);
    }

    public  static String daysName(int day) {
        String pint = "Invalid number";

        if (day == 1) {
            pint = "Monday";

        } else if (day == 2) {
            pint = "Tuesday";

        } else if (day == 3) {
            pint = "wednesday";

        } else if (day == 4) {
            pint = "Thursday";

        } else if (day == 5) {
            pint = "Friday";

        } else if (day == 6) {
            pint = "Saturday";

        } else if (day == 7) {
            pint = "Sunday";

        } else {
            pint = "Invalid number";
        }

        return pint;
    }

    public static String monthsName (int month) {

        String answer = " ";
        if (month == 1) {
            answer = "January";

        } else if (month == 2) {
            answer = "February";

        } else if (month == 3) {
            answer = "March";

        } else if (month == 4) {
            answer = "April";

        } else if (month == 5) {
            answer = "May";

        } else if (month == 6) {
            answer = "June";

        } else if (month == 7) {
            answer = "July";

        } else if (month == 8) {
            answer = "August";

        } else if (month == 9) {
            answer = "September";

        } else if (month == 10) {
            answer = "October";

        } else if (month == 11) {
            answer = "November";

        } else if (month == 12) {
            answer = "December";

        } else {
            answer = "Invalid Number";
        }
        return answer;
    }

    public static String dayInMonth(int month) {

        String monthSelection = monthsName(month);
        String message = monthSelection + "has " + "days";

        if (monthSelection == "February") {
            message = monthSelection + " has 29 days";

        } else if (monthSelection == "January" || monthSelection == "March" || monthSelection == "May" || monthSelection == "July"
                || monthSelection == "August" || monthSelection == "October" || monthSelection == "December") {
            message = monthSelection + " has 31 days";

        } else if (monthSelection == "April" || monthSelection == "June" || monthSelection == "September" || monthSelection == "November") {
            message = monthSelection + " has 30 days";

        } else {
            message = "Invalid Number";
        }
        return message;
    }
}