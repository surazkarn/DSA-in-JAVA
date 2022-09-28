public class fibDP {

    public static void main(String[] args) {

        int n = 50;
        System.out.println(FibTD(n, new int[n + 1]));
    }

    public static int FibRecur(int n) {

        if (n == 1 || n == 0) {
            return n;
        }

        int fnm1 = FibRecur(n - 1);
        int fnm2 = FibRecur(n - 2);

        int fn = fnm1 + fnm2;

        return fn;
    }

    // iterative Dynamic Programming
    public static int FibTD(int n, int[] strg) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (strg[n] != 0) { // reuse
            return strg[n];
        }

        int fnm1 = FibTD(n - 1, strg);
        int fnm2 = FibTD(n - 2, strg);

        int fn = fnm1 + fnm2;
        strg[n] = fn; // store

        return fn;
    }

}
