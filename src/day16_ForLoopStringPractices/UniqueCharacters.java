package day16_ForLoopStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";

        String result ="";

        for (int i = 0; i <= str.length()-1; i++) { // index number of str (starting from 0)

            char ch = str.charAt(i); // ch: each character of str

            if ( (str.indexOf(ch) == str.lastIndexOf(ch)) ){ //if the first and last index numbers of the character are same, then it's unique
                result += ch;
            }

        }

        System.out.println(result);


    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */