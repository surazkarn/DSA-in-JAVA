/* 

*    
**   
***  
**** 
*****

 */

import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1; // by looking the first row initialize the nst

        // rows
        int row = 1;
        while (row <= n) {
            // work
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;

            }

            // prep
            System.out.println();
            nst = nst + 1;
            row = row + 1;

        }
    }
}
