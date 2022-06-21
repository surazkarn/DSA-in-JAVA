/*  

5
    1
   121
  12321
 1234321
123454321

*/

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n - 1;

        // row
        int row = 1;
        while (row <= n) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");

            }

            // number

            int val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val);

                if (cst <= nst / 2) {
                    val++;
                } else {
                    val--;
                }
            }

            System.out.println();
            nsp--;
            nst += 2;
            row++;
        }

    }

}
