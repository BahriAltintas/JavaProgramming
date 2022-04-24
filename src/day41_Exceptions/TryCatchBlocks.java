package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 Started");

        try {

            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }



        System.out.println("Test1 Completed");

        System.out.println("--------------------------------------");

        System.out.println("Test2 Started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException a){

            a.printStackTrace();

            // System.out.println(a.getMessage());

        }

        System.out.println("Test2 Completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test3 Started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 Completed");

        System.out.println("--------------------------------------------------");


        System.out.println("Hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");

        System.out.println("--------------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}