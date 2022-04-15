package string;

import java.util.Scanner;

public class PrefixAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String str1 = str.replaceFirst(""+str.charAt(n-1),"");

        System.out.println(str1);

        if (str1.contains(""+str.charAt(n-1))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }


}
/*
Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

Assume that the String is not empty and that n is in the range from 1 to str.length().

Examples:

input: abXYabc
input: 1

output: true
input: abXYabc
input: 1

output: true
input: abXYabc
input: 2

output: true
input: abXYabc
input: 2

output: true
input: abXYabc
input: 3

output: false
 */
