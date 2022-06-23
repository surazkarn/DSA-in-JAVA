import java.util.Scanner;

public class AnyBaseToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snum = sc.nextInt();
        int sb = sc.nextInt();

        int res = anyBaseToDecimal(snum, sb);
        System.out.println(res);
    }

    public static int anyBaseToDecimal(int snum, int sb) {
        int ans = 0;

        int multiplier = 1;
        while (snum != 0) {

            int rem = snum % 10;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * sb;
            snum = snum / 10;

        }
        return ans;

    }

}
