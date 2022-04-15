package day08_IfStatement.day08_PracticeTasks;

public class Maximum_MinimumNumber {

    public static void main(String[] args) {

        int n1 = 100;
        System.out.println("n1 = " + n1);
        int n2 = 200;
        System.out.println("n2 = " + n2);

        if (n1>n2){
            System.out.println(n1+" is maximum number");
        }
        if (n1<n2){
            System.out.println(n2+" is maximum number");
        }
        if (n1==n2){
            System.out.println(n1+" and "+n2+" are equals numbers");
        }




    }

}
/*

	3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
 */
