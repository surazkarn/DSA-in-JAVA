/*
Given pattern is seen as first we need to work for spaces and then for the numbers in each row.
Numbers are first increasing till the mid element and then decreasing till end of the row.
Thus, do the work of first spaces and then for numbers .
And then change variables accordingly for next iterations.
Always think of first row and then work for the next iteration and repeat the work total number of row times. That's how you can solve any problem related to pattern.
*/

import java.util.*;


public class GaneshaPattern {

    
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        PattenG(n);
    }

    public static void PattenG(int n) {

        int nsp = n / 2 - 1;
        int rows = 1;
        int nst = n / 2;

        while (rows <= n) {

            if (rows <= n / 2 + 1) {

                if (rows <= n / 2) {
                    System.out.print("*");

                    int csp = 1;
                    while (csp <= nsp) {
                        System.out.print(" ");
                        csp++;
                    }
                } else {
                    int cst = 1;
                    while (cst <= nst) {
                        System.out.print("*");
                        cst++;
                    }
                }

                if (rows == 1 || rows == n / 2 + 1) {

                    int cst = 0;
                    while (cst <= nst) {
                        System.out.print("*");
                        cst++;
                    }
                } else {
                    System.out.print("*");
                }
            } else {

                if (rows < n) {
                    int csp = 0;
                    while (csp <= nsp) {
                        System.out.print(" ");
                        csp++;
                    }
                } else {
                    int cst = 1;
                    while (cst <= nst) {
                        System.out.print("*");
                        cst++;
                    }
                }

                System.out.print("*");

                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(" ");
                    csp++;
                }

                System.out.print("*");

            }
            System.out.println();
            rows++;
        }
    }
}
    
}
