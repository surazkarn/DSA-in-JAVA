
/*  

*   
**  
*** 
****
*****
****
***
**
*

 */

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr = 2 * n - 1;
        int nst = 1;
        int row = 1;
        while (row <= nr) {

            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst = cst + 1;

            }
            System.out.println();

            if (row <= nr / 2) {
                nst = nst + 1;

            } else {
                nst = nst - 1;
            }
            row = row + 1;

        }
    }

}
