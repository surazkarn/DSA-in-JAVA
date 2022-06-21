/*

*****    
  ****
    ***
      **
        * 
        
*/

import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = n;
        int fsp = 0;
        int row = 1;
        while (row <= n) {

            // space work
            int cfsp = 1;
            while (cfsp <= fsp) {
                System.out.print(" ");
                cfsp++;

            }

            // star work
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }

            // space work
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;

            }

            System.out.println();
            nst--;
            nsp++;
            row++;
            fsp = fsp + 2;

        }
    }
}
