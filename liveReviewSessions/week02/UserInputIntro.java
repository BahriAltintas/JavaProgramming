package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {

        String name= ""; // Hard coded way
        // output goes to console ---- print or println
        System.out.println("Output");

        // How can I receive input for my JAVA clas

        // 1. create your scanner object (object name can be anything
        Scanner input = new Scanner(System.in); // you don't see anything

        // 2. prompt the user for putting input
        System.out.println("Put your name"); // this is printed out to console

        //3. get the input

        name = input.next(); //reads the data from console and assigns the value to my variable

        // 4. use the value that I read

        System.out.println("name = " + name);

        // step 1 and 3 are MUST but steps 2 and 4  depends on the situation




    }
}
