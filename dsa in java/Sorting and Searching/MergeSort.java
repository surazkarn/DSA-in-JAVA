//first code merge two sorted array
// big prblm : i want to sort an array of size n
// small prblm : my recursion is capable enough to sort an array of size n/2

public class MergeSort {

    // arr1 : [10,20,30,40,50]
    // arr2 : [5,15,30,45,60,70,80]

    // keep resultant in an array name merged[]

    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 50, 60, 5, 80, 25 };

        int[] ans = mergeSort(arr, 0, arr.length - 1);

        for (int val : ans) {
            System.out.print(val + " ");

        }

    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        // i will keep track of index of arr1
        // j -> arr2
        // k -> array merged

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;

            } else {
                merged[k] = arr2[j];
                j++;
                k++;
            }

        }

        // if arr1 is exhausted
        // have a loop on j and consume all the elements of j
        if (i == arr1.length) {
            while (j < arr2.length) {

                merged[k] = arr2[j];
                j++;
                k++;

            }
        }

        if (j == arr2.length) {
            while (i < arr1.length) {

                merged[k] = arr1[j];
                i++;
                k++;

            }
        }

        return merged;

    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];

            return br;

        }
        int mid = (lo + hi) / 2;
        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);
        int[] merge = mergeTwoSortedArrays(fh, sh);

        return merge;
    }

}
