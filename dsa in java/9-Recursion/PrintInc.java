public class PrintInc {

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

// DOING WORK WHEN FUNCTION IS POPED FROM THE STACK