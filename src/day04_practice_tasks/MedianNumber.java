package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int number = 10;
        int number2 = 20;
        int number3 =20;

        int mediannumber = (number +number2 +number3) / 3 ;


        if (number != number2 && number!= number3 &&number2!=number3) {
            System.out.println(mediannumber + " Is the median number") ;
        }

       else if (number2 != number && number2!= number3) {
            System.out.println(mediannumber + " Is the median number") ;
        }

       else {
            System.out.println("Numbers are not DIFFERENT");

        }
    }
}
/*
public static void main(String[] args) {

    int a =10,
            b= 15,
            c =20;
    boolean aIsMedian = ( b > a && a > c ) || (c > a && a > b);

    boolean bIsMedian = ( a > b && b > c ) || (c > b && b > a );

    //System.out.println("a Is Median = " + aIsMedian);
    //System.out.println("b Is Median = " + bIsMedian);


    if (aIsMedian){ //If A is the median number between those three different numbers
        System.out.println(a + " Is the median number");
    } else if (bIsMedian) {
        System.out.println(b + " Is the median number"); // If b is the median number between those three different numbers

    }else {
        System.out.println(c + " Is median number");
    }

}
}
*/

