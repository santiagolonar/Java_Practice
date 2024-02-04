package day02_practice_tasks;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender= 'F';
        String companyName = " Apple Inc ";
        String jobTitle = " SDET ";
        Double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";


        System.out.println("\t" + "Employee Name:"+  employeeName);
        System.out.println("\t" + "Gender: " + gender);
        System.out.println("\t" + "Age: " + age);
        System.out.println("\t" + "Employee ID: " + employeeId);
        System.out.println("\t" + "Job Title:" + jobTitle);
        System.out.println("\t" + "Company Name:" + companyName);
        System.out.println("\t" + "Full Time: " + isFullTime);
        System.out.println("\t" + "Years Of Work Experience: " + yearsOfExperience);
        System.out.println("\t" + "Salary " + "$" +  salary );
        System.out.println("\t" + "Married: " + isMarried);
    }
}
