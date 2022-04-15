package day12_Scanner;

//import java.util.*; // wild import: imports everything from the package
import java.util.Scanner; // regular import: imports one class

public class ScannerPractice {

    public static void main(String[] args) {

        /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        ...   // if you don't assign a varriable for scanner, you need to write new scanner again and again
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7:");

        int num = scan.nextInt();

        String result = "";

        if (num<=7 && num>=1){

            result =(num==1)?"Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday"
                    :(num==5)? "Friday" :(num==6)? "Saturday" : "Sunday";

        }else{
            result = "Invalid Number";
        }

        System.out.println(result);

        scan.close();

    }
}
