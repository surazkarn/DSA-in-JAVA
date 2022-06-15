
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1;
        int num = 1;

        int row = 1;
        while (row <= n) {

            // space work
            int csp = 1;
            while (csp <= nsp) {
                System.out.println(" ");
                csp++;
            }

            // number work
            int cnum = 1;
            while (cnum <= num) {
                System.out.println(n);
                cnum++;

            }
            row++;
        }

    }
}