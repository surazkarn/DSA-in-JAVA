/*
5
3
1
2
4
 */

public class PdSkip {

    public static void main(String[] args) {

        PDI(5);
    }

    public static void PDI(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        PDI(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }

    }

}
