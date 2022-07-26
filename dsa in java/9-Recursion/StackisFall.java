// DOING WORK WHEN FUNCTION IS POPED FROM THE STACK
/*
 * 1
 * 2
 * 3
 * 4
 * 5
 * 
 */

public class StackisFall {

    public static void main(String[] args) {
        PI(5);
    }

    public static void PI(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // HAULT
        PI(n - 1);
        System.out.println(n);

    }
}
