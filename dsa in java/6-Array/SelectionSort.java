import java.util.Scanner;

public class SelectionSort {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = takeInput();
        //
        // display(array);
        // int[] arr = { 99, 88, 77, 66, 55 };

        selectionSort(arr);

        display(arr);
    }

    public static int[] takeInput() {

        System.out.println("Size ?");
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for " + i + " index ?");
            arr[i] = scn.nextInt();
        }

        return arr;
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    // after the counter gets completed for any index
    // then we will be having the correct element at counter position

    public static void selectionSort(int[] arr) {

        // once the counter =0; gets completed
        // the correct element will be at 0 th index

        for (int counter = 0; counter < arr.length - 1; counter++) {

            // assume present counter is the only one which is containig the minimum value

            int min = counter;

            for (int j = counter + 1; j <= arr.length - 1; j++) {

                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }
    }
}