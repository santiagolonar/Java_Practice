package day_11_practice_tasks;

public class CydeoClient {
    public static void main(String[] args) {


        CydeoStudent cydeoStudent1 = new CydeoStudent("Josh", 26, 2345532, 'A', 9567821, 23);

        cydeoStudent1.printSchoolName();
        cydeoStudent1.printProgramLanguage();
        cydeoStudent1.attendClass();
        cydeoStudent1.study();
        System.out.println(cydeoStudent1);
    }
}