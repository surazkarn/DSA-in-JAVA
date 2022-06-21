/*         
 
5
*       *
**     **
***   ***
**** ****
*********

*/

import java.util.Scanner;

public class Pattern21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = 1;
        int nsp = n + 2;

        while (row <= n) {

            // star work
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*");
            }

            // space work
            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print(" ");
            }

            // star work

            int cst = 1;
            if (row == n) {
                cst = 2;
            }

            for (; cst <= nst; cst++) {

                System.out.print("*");
            }

            System.out.println();
            nst = nst + 1;
            nsp = nsp - 2;

            row = row + 1;
        }
    }

}
