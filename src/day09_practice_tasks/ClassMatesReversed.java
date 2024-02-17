package day09_practice_tasks;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classMates = {"Jorge" , "Michael", "Ella", "Dalio", "Paris", "Miguel", "Max", "Marco" , "Vannessa", "Lupita"};


        for (int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            String reverseName =" ";

            for (int j = name.length()-1; j >= 0 ; j--) {
                reverseName = reverseName + name.charAt(j);

            }
            System.out.println(reverseName);
        }

        }
    }

