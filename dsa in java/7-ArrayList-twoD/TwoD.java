public class TwoD {

    public static void main(String[] args) {
        // initialization
        int[][] arr;
        // declaration
        arr = new int[3][3];

        // System.out.println(arr[0][0]);
        display(arr);

    }

    // function to display entire array

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
