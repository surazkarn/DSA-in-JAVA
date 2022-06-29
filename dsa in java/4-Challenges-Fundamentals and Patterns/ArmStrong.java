import java.util.Scanner;

public class ArmStrong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt();
        ArmStrongOrNot(n);

    }

    public static long ArmStrongOrNot(long n) {

        long divident = n;
        int ans = 0;
        while (n > 0) {

            int rem = n % 10;
            ans = ans + (int) Math.pow(rem, 4);
            n = n / 10;
            System.out.println("rem:" + rem);
            // System.out.println("cont" + 4);
            System.out.println("ans" + ans);

        }

        if (ans == rem)

            return true;
        return false;
    }
}
