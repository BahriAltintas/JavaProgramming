package day09_IfStatements.day09_PracticeTasks;



public class CharacterIdentity {

    public static void main(String[] args) {



        char  ch = '1';
        String result = "";

        if ( (ch <= 'Z' && ch >= 'A') || (ch <= 'z' && ch >= 'a')){
            result = "Alphabetic!";
        }else if (ch <= '9' && ch >= '0'){
            result = "Digit!";
        }else {
            result = "Special Character!";
        }
        System.out.println(result);



    }

}
/*
4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
