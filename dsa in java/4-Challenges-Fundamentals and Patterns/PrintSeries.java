import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n = 1;

        int row = 1;
        while (row <= n1) {
            int s = 3 * n + 2;
            if (s % n2 != 0) {
                System.out.println(s);
                row++;
            }
            n++;
        }

    }

}
