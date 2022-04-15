package day09_IfStatements.day09_PracticeTasks;

public class NumberToWord {

    public static void main(String[] args) {

        int n = 5;
        String result ="";

        if(n==1){
            result = "One";
        }else if (n==2){
            result = "Two";
        }else if (n==3){
            result = "Three";
        }else if (n==4){
            result = "Four";
        }else if (n==5){
            result = "Five";
        }else if (n==6){
            result = "Six";
        }else if (n==7){
            result = "Seven";
        }else if (n==8){
            result = "Eight";
        }else if (n==9){
            result = "Nine";
        }else {
            result = "Invalid Number";
        }
        System.out.println(result);

    }

}
/*1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
*/
