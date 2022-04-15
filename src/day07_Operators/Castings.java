package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        /*
        Warmup tasks:
	1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
         */
        float averageScore = 20.5F;

        byte num1= (byte) averageScore; // explicit casting
        short num2= (short) averageScore; // explicit casting
        int num3= (int) averageScore; // explicit casting
        long num4= (long) averageScore; // explicit casting
        float num5= averageScore; // there is no casting
        double num6= averageScore; // implicit casting

        System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);






    }
}
