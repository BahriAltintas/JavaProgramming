package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
/*
1. Create a class called CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. price
3. Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */

        int kiloMetres = 240000;
        double kiloMetresToMiles = kiloMetres * 0.621371192;

        int year = 2008,
                price= 14400;


        String make = "Honda",
                model = "Civic",
                color = "Black";

        System.out.println(year+" "+make+" "+model+", "+kiloMetresToMiles+" miles, "+color+", $"+price+".");

        System.out.println("-------------------------------------------------------------------");

        String myCarInfo = year+" "+make+" "+model+", "+kiloMetresToMiles+" miles, "+color+", $"+price+".";

        System.out.println(myCarInfo);









    }
}
