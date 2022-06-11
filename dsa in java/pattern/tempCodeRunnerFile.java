import java.util.Scanner;

public class NrowStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1) no. of rows
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            // 2)work to be done in every row
            // print one star
            System.out.print("*");
            // 3)preparation for next row
            // change the line
            System.out.print("\n");

        }
    }

}