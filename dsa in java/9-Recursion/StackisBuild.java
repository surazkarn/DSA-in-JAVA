// DOING WORK WHILE STACK IS BUILDING
/*
 * 
 * 5
 * 4
 * 3
 * 2
 * 1
 * 
 */

class StackisBuild {

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
