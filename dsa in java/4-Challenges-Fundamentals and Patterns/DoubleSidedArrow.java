/* 
Pattern Hack: Always first Try to first print pattern by ignoring the value to be printed then accommodate your value in that pattern. For e.g.,                 

7

            1
        2 1   1 2
    3 2 1       1 2 3
4 3 2 1           1 2 3 4
    3 2 1       1 2 3
        2 1   1 2
            1 
            
*/

import java.util.*;

public class DoubleSidedArrow {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // number of rows
        int nsp1 = n - 1; // initializing number of spaces of 1st batch
        int nsp2 = -1; // initializing number of spaces of 2nd batch
        int nst = 1; // initializing number of numbers

        for (int row = 1; row <= n; row++) {

            int val; // starting value of numbers

            if (row <= n / 2 + 1) {
                val = row; // till mid value is equal to row number
            } else {
                val = n - row + 1; // after mid values are total rows - current row +1
            }

            // work for spaces
            for (int csp = 1; csp <= nsp1; csp++) {
                System.out.print("  ");
            }

            // work for numbers
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + " ");
                val--;
            }

            // work for spaces
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("  ");
            }

            int cst = 1;
            val++;
            if (row == 1 || row == n) {
                cst = 2;

            }

            // work for numbers
            for (; cst <= nst; cst++) {
                System.out.print(val + " ");
                val++;
            }

            // preparation for next iteration
            if (row <= n / 2) {
                nsp1 -= 2;
                nst++;
                nsp2 += 2;
            } else {
                nsp1 += 2;
                nst--;
                nsp2 -= 2;
            }
            System.out.println();
        }
    }

}