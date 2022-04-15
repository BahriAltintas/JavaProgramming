package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160; 160 is out of byte' range
        // byte num = 129; 129 is out of byte' range
        short weight = 160; // 160 is within range of short

        // salary: 100000 $
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;
        long asset2 = 3_333_333_334l;

        // tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 65535;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';
        System.out.println(yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;
        System.out.println("result = " + result);

        String name = "Bahri";
        String city = "Ankara";
        String country = "Turkey";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);

        String first_name$ = "Muhtar";
        int num1 = 100;
        int num2 = 200;


    }


}


