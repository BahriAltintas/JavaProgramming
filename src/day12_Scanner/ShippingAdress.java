package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.next();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();

        System.out.println(fullName);
        System.out.println( buildingNumber);
        System.out.println(streetName);
        System.out.println(cityName);
        System.out.println(state);
        System.out.println(zipCode);

        input.close();
    }

}
/*
1 Enter your full name ( nextLine () )
2 Enter your building number (next () )
3 Enter your street name ( nextLine () )
4 Enter your city name ( nextLine () )
5 Enter your state (next () )
6 Enter your zip code (next () )

display the shipping address

 */
