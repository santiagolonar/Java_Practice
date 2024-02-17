package day09_practice_tasks;

public class StudentGrade {

    public static void main(String[] args) {

        String [] names  = new String [3];
        names [0] = "Juanita Romero";
        names [1] = "Juan Carlos";
        names [2] = "Camilo Rodriguez";

        int [] scores = new int[3];
        scores [0] = 90;
        scores [1] = 75;
        scores [2] = 80;

        char [] grades = new char[3];

        for (int i = 0; i < scores.length; i++) {
            if (scores [i] >= 90 ){
                grades [i] = 'A';

            }else if (scores[i] >= 80){

                    grades[i] = 'B';

                }else if (scores [i]>= 70){

                grades [i] = 'C';
                }else {
                grades [i] = 'F';
            }
            System.out.println(names [i]+ 's' + " score is " + scores [i] + " and grade is " + grades [i]);
        }



    }
}
