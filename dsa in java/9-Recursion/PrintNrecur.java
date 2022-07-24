class PrintNrecur {

    public static void main(String[] args) {
        PD(5);
    }

    public static void PD(int n) {
        // base case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // hault
        PD(n - 1);

    }
}

// DOING WORK WHILE STACK IS BUILDING