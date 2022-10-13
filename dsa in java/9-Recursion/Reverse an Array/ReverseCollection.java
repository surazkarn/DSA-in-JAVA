import java.util.Arrays;
import java.util.Collections;

public class ReverseCollection {
    public static void main(String[] args) {

        int n = 5;
        Integer arr[] = { 5, 4, 3, 2, 1 };
        reverseArray(arr);
        printArray(arr, n);
    }

    static void reverseArray(Integer arr[]) {
        // fetching array as list object
        // reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
    }

    public static void printArray(Integer arr[], int n) {
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + " ");
        }
    }
}
