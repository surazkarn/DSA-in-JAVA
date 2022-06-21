import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nr = 2 * n + 1; // number of rows
        int nst = 1;
        int nsp = 2 * n - 1;

        for (int row = 1; row <= nr; row++) {

            // int val = n;
            // work for numbers
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*" + " ");
                // val--;
            }

            // work for spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }

            int cst = 1;
            if (row == n + 1) {
                cst = 2;
                // val += 2;
            } else {
                cst = 1;
                // val++;
            }

            // work for numbers
            for (; cst <= nst; cst++) {
                System.out.print("*" + " ");
                // val--;
            }

            // preparation for next row
            if (row <= n) {
                nst = nst + 1;
                nsp = nsp - 2;
            } else {
                nst--;
                nsp += 2;

            }

            System.out.println();

        }

    }

}
