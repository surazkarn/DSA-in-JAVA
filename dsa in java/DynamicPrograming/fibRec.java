public class fibRec {

    public static void main(String[] args) {
        System.out.println(FibRecur(50));
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

}
