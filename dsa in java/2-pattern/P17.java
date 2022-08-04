
/*
  
222
212
222
 
*/

import java.util.Scanner;

public class P17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            // work
            int col = 1;
            while (col <= n) {
                System.out.print("*");
                col = col + 1;
            }
            // prep
            System.out.println();
            row = row + 1;
        }

    }

}
