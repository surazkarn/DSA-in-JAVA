import java.util.Scanner;

public class FactorialOfaNum {
    public static void main(String[] args) {
        System.out.println("enter the value of N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));

    }

    public static int Fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = Fact(n - 1);
        int fn = n * fnm1;
        return fn;

    }

}
