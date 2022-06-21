/* 

*
*
*
*
*


import java.util.Scanner;

public class NrowStarPattern0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1) no. of rows
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            // 2)work to be done in every row
            // print one star
            System.out.print("*");
            // 3)preparation for next row
            // change the line
            System.out.print("\n");

        }
    }

}
*/

import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1) no. of rows
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            // 2)work to be done in every row
            // print one star
            System.out.print("*");

            // 3)preparation for next row
            // change the line
            // increment row by 1

            row = row + 1;
            System.out.print("\n");
        }
    }

}
