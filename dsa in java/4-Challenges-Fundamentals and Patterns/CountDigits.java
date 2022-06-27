import java.util.*;

//public class Main {
public class CountDigits {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(CountDigit(n, d));

    }

    public static int CountDigit(int n, int d) {

        int counter = 0;
        while (n > 0) {
            if (n % 10 == d)
                counter++;
            n = n / 10;

        }
        return counter;

    }

}