package day10_NestedIf.day10_PracticeTasks;

public class AgeGroup {

    public static void main(String[] args) {

        short age = -1;

        String ageGroup = (age < 21 && age >= 0)? "Teenager" : (age < 55 && age >= 21)? "Adult" :
                (age <= 150 && age >= 55)? "Senior" : "ınvalid";

        System.out.println(ageGroup);

    }

}
/*
4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */