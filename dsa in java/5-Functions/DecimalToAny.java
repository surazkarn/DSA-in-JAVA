
import java.util.Scanner;

public class DecimalToAny {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snum = sc.nextInt();
        int db = sc.nextInt();

        int res = DecimalToAnyBase(snum, db);
        System.out.println(res);
    }

    public static int DecimalToAnyBase(int snum, int db) {
        int ans = 0;

        int multiplier = 1;
        while (snum != 0) {

            int rem = snum % db;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 10;
            snum = snum / db;

        }
        return ans;

    }

}
