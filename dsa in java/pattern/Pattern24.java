/*  

5
    1
   222
  33333
 4444444
555555555

*/

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n - 1;
        int val = 1;

        // row
        int row = 1;
        while (row <= n) {
            val = row;

            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");

            }

            // number
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val);
            }

            System.out.println();
            nsp--;
            nst += 2;
            row++;
        }

    }

}
