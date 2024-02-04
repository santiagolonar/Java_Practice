package day04_practice_tasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 20;
        String school = " ";


        if (gradeLevel >= 1 && gradeLevel <= 18) {


            if (gradeLevel >= 17) {
                school = "Grad School";
            } else if (gradeLevel >= 13) {
                school = "College";
            } else if (gradeLevel >= 9) {
                school = "High school";
            } else if (gradeLevel >= 6) {
                school = "Middle school";
            } else if (gradeLevel >= 1) {
                school = "Elementary school";
            }
        }

        else {
            school = "Invalid grade level, ";
        }

        System.out.println(school);




    }
}
