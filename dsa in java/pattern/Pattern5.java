/*

*****
 ****
  ***
   **
    *

 */

import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0;
        int nst = n;

        int row = 1;
        while (row <= n) {

            // space work
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;

            }
            // star work
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nst--;
            nsp++;
            row++;
        }
    }
}