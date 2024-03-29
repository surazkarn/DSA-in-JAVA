import java.util.Scanner;

public class Insertion {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        // int[] array = takeInput();
        //
        // display(array);

        // int[] array = { 10, 5, 20, 30, 25 };
        // System.out.println(maxInArray(array));
        // System.out.println(linearSearch(array, 130));

        // int[] array = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80
        // };
        //
        // System.out.println(binarySearch(array, 55));

        int[] arr = { 99, 88, 77, 66, 55 };

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
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

    public static int maxInArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int linearSearch(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == item) {
                return i;
            }
        }

        return -1;

    }

    public static int binarySearch(int[] arr, int item) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (arr[mid] < item) {
                lo = mid + 1;
            } else if (arr[mid] > item) {
                hi = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

    // comparing adjacent two elements(j and j+1) and
    // moving the largest element to the end using swaping
    public static void bubbleSort(int[] arr) {

        for (int counter = 0; counter < arr.length - 1; counter++) {

            for (int j = 0; j < arr.length - 1 - counter; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

    // already sorted array and store
    public static void insertionSort(int[] arr) {
        // once the work of counter ends
        // array till counter index will be sorted
        for (int counter = 1; counter <= arr.length - 1; counter++) {
            // there is no point in taking counter=0;
            // as there is no point in sorting one element
            int val = arr[counter];

            int j = counter - 1;
            // when we are doing work for counrter =1 there can be a case
            // when j=-1; so we excldude negative j value limit the while loop greater than
            // 0
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = val;

        }

    }
}
