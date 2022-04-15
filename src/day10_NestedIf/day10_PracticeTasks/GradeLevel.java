package day10_NestedIf.day10_PracticeTasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 17;

        String result = (number >= 1 && number <= 5)? "Elementary school" :(number >= 6 && number <= 8)?  "Middle school" :
        (number >= 9 && number <= 12)? "High school" :(number >= 13 && number <= 16)?  "Collage" :
        (number >= 17 && number <= 18)? "Grad school" : "Invalid grade level given";

        System.out.println(result);


    }

}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */