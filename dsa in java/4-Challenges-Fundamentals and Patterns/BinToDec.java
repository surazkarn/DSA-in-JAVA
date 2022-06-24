
/* Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned. */
import java.util.*;

public class BinToDec {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int bnum = sc.nextInt();
        int bbase = 2;
        int decimalnum = binaryToDecimal(bnum, bbase);
        System.out.println(decimalnum);

    }

    public static int binaryToDecimal(int bnum, int bbase) {
        int ans = 0;
        int multiplier = 1;
        while (bnum != 0) {
            int rem = bnum % 10;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 2;
            bnum = bnum / 10;
        }
        return ans;
    }
}
