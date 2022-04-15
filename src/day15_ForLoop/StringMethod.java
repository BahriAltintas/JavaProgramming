package day15_ForLoop;

public class StringMethod {

    public static void main(String[] args) {

        String str = "        "; // false  "" true

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);


        String str2 = "Cydeo      ";

        System.out.println(str2.isBlank() );

        System.out.println("------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true


        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("------------------------------------------------");

        String sentece = "My favorite programming language is Java";

        boolean hasCSharp = sentece.contains("C#");
        boolean hasJava = sentece.contains("Java");
        boolean hasJava2 = sentece.contains("java");
        boolean hasJava3 = sentece.toLowerCase().contains("java");
        boolean r3 = sentece.contains("java") || sentece.contains("Java"); // jAvA


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("-----------------------------------------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false
        System.out.println(input1.contains(input2)); //true

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("---------------------------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        //           "wooden spoon"
        //in order to ignore the case sensitivity we first crate the lower case/upper case version of string and then compare it with lowercase/uppercase

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);





    }

}
