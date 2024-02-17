package day09_practice_tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6,7};

        int oddNum = 0;
        int evenNum =0;

        for (int i = 0; i < num.length; i++) {
            if (num [i]  % 2 ==0){
              evenNum += 1;

            }
            else {
                oddNum +=1;
            }

        }
        System.out.println("The array has " + oddNum + " odd numbers and " + + evenNum + " even numbers. " );
    }
}
