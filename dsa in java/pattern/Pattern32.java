/* 
5

1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1

*/

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // row
        int row = 1;
        int val;
        int nr = 2 * n - 1;
        int nst = 1;

        while (row <= nr) {

            if (row <= nr / 2 + 1)
                val = row;
            else
                val = nr - row + 1;

            // work
            for (int cst = 1; cst <= nst; cst++) {

                if (cst % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(val);
                }

            }

            // prep
            System.out.println();

            if (row <= nr / 2) {
                nst += 2;
            } else {

                nst -= 2;
            }

            row++;

        }

    }
}
