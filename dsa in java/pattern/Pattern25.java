/*  

5
                                1
                        2       3       4
                5       6       7       8       9
        10      11      12      13      14      15      16
17      18      19      20      21      22      23      24      25

*/

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n - 1;
        int val = 1;

        // row
        int row = 1;
        while (row <= n) {

            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");

            }

            // number
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                val++;
            }

            System.out.println();
            nsp--;
            nst += 2;
            row++;
        }

    }

}
