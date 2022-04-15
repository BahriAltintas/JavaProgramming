package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C'){
                continue;
            }

            System.out.println(i); //A B D E

        }

        System.out.println("---------------------------------------------");

        for (int i = 0; i <= 10 ; i++) {
            //print all even numbers between 1~10 (skip the odd numbers)

            if (i%2 != 0){ // 1, 3, 5, 7, 9
                continue; //skip
            }

            System.out.println(i); // 2, 4, 6, 8, 10
        }

        System.out.println("---------------------------------------------");
        //print all odd numbers between 1~10 (skip the even numbers)

        for (int i = 0; i <= 10; i++) {

            if (i%2 == 0){ // 2, 4, 6, 8, 10
                continue; // skip
            }

            System.out.println(i); //1, 3, 5, 7, 9

        }


    }

}
