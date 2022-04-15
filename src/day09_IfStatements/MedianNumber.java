package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 45, b = 27, c = 46;

        // if we have three different numbers, one must be Maximum, one must be Minimum and one must be Median

        boolean aIsTheMedianNumber = (a<b && a>c) || (a<c && a>b);

        /*
        in order for a to be median number:
            1. if c is maximum number & b is the minimum number, then a is the median number
            2. if b is maximum number & c is the minimum number, then a is the median number
         */

        boolean bIsTheMedianNumber = (b<a && b>c) || (b<c && b>a);
        boolean cIsTheMedianNumber = (c<a && c>b) || (c<b && c>a);
        // boolean cIsTheMedianNumber = !aIsTheMedianNumber && !bIsTheMedianNumber

        if (aIsTheMedianNumber) { // if a is the median number
            System.out.println(a + " is the median number");
        }

        if (bIsTheMedianNumber) { // if b is the median number
            System.out.println(b + " is the median number");
        }

        if (cIsTheMedianNumber) { // if c is the median number
            System.out.println(c + " is the median number");
        }






    }
}
/*
. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */