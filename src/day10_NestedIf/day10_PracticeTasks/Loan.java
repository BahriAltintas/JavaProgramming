package day10_NestedIf.day10_PracticeTasks;

import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Salary:");
        int salary = input.nextInt();

        System.out.println("Please Enter Your Credit Score");
        int creditScore = input.nextInt();

        String result = (salary >= 60000 && creditScore >= 650)? "Loan Approved" : "Loan Denied";

        System.out.println(result);
        input.close();

    }

}
/*6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */
