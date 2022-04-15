package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in);


        System.out.println("Enter full your name: ");
        String fullName = input.nextLine(); // Wooden SpoonEnter

        System.out.println("Enter your programming language:");
        String programming = input.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //24Enter

        input.nextLine(); // capture the Enter key that pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }

}
