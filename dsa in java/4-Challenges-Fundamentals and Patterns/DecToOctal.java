
/*Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned. */
import java.util.Scanner;

public class DecToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snum = sc.nextInt();
        int db = 8;

        int res = DecimalToOctal(snum, db);
        System.out.println(res);
    }

    public static int DecimalToOctal(int snum, int db) {
        int ans = 0;

        int multiplier = 1;
        while (snum != 0) {

            int rem = snum % 8;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 10;
            snum = snum / db;

        }
        return ans;

    }

}
