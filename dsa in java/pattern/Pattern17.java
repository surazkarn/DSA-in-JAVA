/* 

*** ***
**   **
*     *

*     *
**   **
*** ***

*/

import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n / 2;
        int nsp = 1;

        // row
        int row = 1;
        while (row <= n) {

            // Star work
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*");
            }

            // Space work
            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print(" ");
            }

            // Star work
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*");
            }

            // prep
            System.out.println();
            if (row <= n / 2) {

                nsp = nsp + 2;
                nst = nst - 1;

            } else {
                nsp = nsp - 2;
                nst = nst + 1;

            }
            row = row + 1;
        }
    }
}