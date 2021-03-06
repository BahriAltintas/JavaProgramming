package string;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.indexOf("bread") == str.lastIndexOf("bread")){
            System.out.println("nothing");
        }else {

            String str1 = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
            System.out.println(str1);
        }



    }

}
/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam
input: breadjambread

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadapple

output: nothing
input: xxbreadapple

output: nothing
input: breadbutterbread

output: butter
 */