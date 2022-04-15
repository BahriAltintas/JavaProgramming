package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Bahri";
        String lastName = "ALTINTAŞ";
        int age = 33;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        System.out.println(firstName + " " + lastName);

        // Second way

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // Full name of the person is __________

        System.out.println("Full name of the person is " + fullName);

        // ______ is ____ years old.

        System.out.println(fullName + " is " + age + " years old.");

        // FullName is JobTitle, works at CompanyName, and FullName' salary is Salary

        System.out.println(fullName + " is a " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "' salary is $" + salary + ".");

    }
}
