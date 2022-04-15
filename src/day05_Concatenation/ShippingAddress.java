package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

/*
EX:
Jimmy Joe
1925 Jones Branch Dr
McLean, VA 20125
 */

        String name = "Bahri Altıntaş",
                buildingNumber = "17B",
                streetName = "905 Street",
                city = "Ankara",
                state = "Turkey";
        int zipCode = 6135;
        /*(different way)
        */

        /*String name = "Bahri Altıntaş";
        String buildingNumber = "17B";
        String streetName = "905 Street";
        String city = "Ankara";
        String state = "Turkey";
        int zipCode = 06135;*/

        System.out.println(name + "\n" + buildingNumber + " " + streetName +
                "\n" + city + ", " + state + " " + zipCode);

        System.out.println("----------------------------------------------------------");

        String shippingAdress = name + "\n" + buildingNumber + " " + streetName +
                "\n" + city + ", " +state + " " + zipCode;

        System.out.println(shippingAdress);

    }
}
