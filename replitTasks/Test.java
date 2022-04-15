public class Test {
    public static void main(String[] args) {




        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case letter
        boolean r3 = false; // has lower case letter
        boolean r4 = false; // has special character
        boolean r5 = false; // has digit

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))){
                r2 = true;
            }else if (Character.isLowerCase(password.charAt(i))){
                r3 = true;
            }else if (Character.isDigit(password.charAt(i))){
                r5 = true;
            }else {
                r4 = true;
            }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);


    }
}
