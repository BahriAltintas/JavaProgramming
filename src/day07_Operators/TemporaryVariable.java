package day07_Operators;

public class TemporaryVariable {

    public static void main(String[] args) {

        byte a = 10, b = 15;
        byte c = a;
         a = b;
         b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);






    }

}
/*
1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */
