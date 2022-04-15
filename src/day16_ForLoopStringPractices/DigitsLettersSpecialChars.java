package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@ #$%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; // CydeoSchoolWoodenSpoon
        String specialsChars = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) { // index number of str (0 ~ last index)

            char ch = str.charAt(i); // ch: each character that we have in str

            if (ch <= '9' && ch >= '0'){ // if the character is between '0' to '9' then it is digit
                digits += ch;
            }else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){ // if the character is between 'A' to 'Z' or 'a' to 'z' then it is digit
                letters += ch;
            }else { // if the character is neither digit nor letter, then it is special character
                if (ch != ' '){ // if the spacial character is not a space
                specialsChars += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialsChars = " + specialsChars);


    }

}
