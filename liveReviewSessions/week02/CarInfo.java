package week02;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2022;
        String make = "Audi";
        String model = "A6";
        // automatic = true; manuel = false;
        boolean transmission = true;
        String calour = "Black";
        int miles = 0;
        int price = 75000; //for Europe

        System.out.println(year+" "+make+" "+model+"\nAutomatic Transmission: "+transmission);
        System.out.println(calour+"|"+miles+" kilometres| "+price+" Euros ");

        // let's turn the value into TL 1 Euro= 15.5 TL

        double priceInTl = price *15.5;

        double taxRate = 1.80; //for this kind of cars

        double priceAfterTaxInTL= priceInTl+(priceInTl*taxRate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

        //Variables are used, because it makes our data reusable and maintainable


    }
}
