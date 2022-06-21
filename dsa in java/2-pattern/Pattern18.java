/* 

   *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *

*/

import java.util.*;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n / 2;
        int nst = 1;

        // row
        int row = 1;
        while (row <= n) {

            // Space work
            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print(" ");
            }

            // Star work
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*");
            }

            // Space work
            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print(" ");
            }

            // prep
            System.out.println();
            if (row <= n / 2) {

                nsp = nsp - 1;
                nst = nst + 2;

            } else {
                nsp = nsp + 1;
                nst = nst - 2;

            }
            row = row + 1;
        }
    }
}