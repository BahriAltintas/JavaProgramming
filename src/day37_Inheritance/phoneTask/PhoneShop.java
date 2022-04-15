package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

     IPhone iPhone = new IPhone("IPhone 12", "6.7 Inches", 1000, "Black");

     Samsung samsung = new Samsung("Galaxy S19", "6 Inches", 900, "White");

     Nokia nokia = new Nokia("Brick", "4 Inches", 50, "Gray");


        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        iPhone.call(911);
        iPhone.text(123456789);
        iPhone.faceTime(54863215);
        iPhone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();


        System.out.println("--------------------------------------------");

        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefense();

        System.out.println("--------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(IPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

    }

}
