
/* 5

5 4 3 2 1 0 1 2 3 4 5 
  4 3 2 1 0 1 2 3 4   
    3 2 1 0 1 2 3     
      2 1 0 1 2       
        1 0 1         
          0 
        1 0 1         
      2 1 0 1 2   
    3 2 1 0 1 2 3 
  4 3 2 1 0 1 2 3 4
5 4 3 2 1 0 1 2 3 4 5 
*/

import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int rows = 2 * n + 1; // number of rows

        int nst = 2 * n + 1; // initializing number of numbers
        int nsp = 0; // initializing number of spaces
        for (int row = 1; row <= rows; row++) {
            int val;
            if (row <= n + 1) // for first n + 1 numbers val is n - row + 1
                val = n - row + 1;
            else
                val = row - n - 1; // for rest numbers val is row - n - 1

            // work for spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }

            // work for numbers
            // Till n numbers are in decreasing order and then in increasing order
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + " ");
                if (cst <= nst / 2)
                    val--;
                else
                    val++;
            }
            // preparation for next iteration
            if (row <= n) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }
    }

}
