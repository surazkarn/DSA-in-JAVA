/* 

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

        int n = scn.nextInt();

        int nst = 1;
        int nsp = 2 * n - 2;
        int mnsp = 2;

        int row = 1;

        while (row <= n) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }

            for (int cst = nst; cst >= 1; cst--) {
                System.out.print(cst + " ");
            }

            if (row > 1 && row < n) {
                for (int csp = 1; csp <= mnsp; csp++) {
                    System.out.print(" ");
                }

                if (row <= n / 2) {
                    mnsp += 4;
                } else {
                    mnsp -= 4;
                }
            }

            int cst = 1;

            if (row == 1 || row == n) {
                cst = 2;
            }

            for (; cst <= nst; cst++) {
                System.out.print(cst + " ");
            }

            System.out.println();

            if (row <= n / 2) {
                nst += 1;
                nsp -= 4;
            } else {
                nst -= 1;
                nsp += 4;
            }

            row++;
        }
    }
}