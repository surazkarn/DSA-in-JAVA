import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("enter item to search");
        int item = sc.nextInt();

        System.out.println("item is present at index:" + binarySearch(array, item));
    }

    public static int binarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < item) {
                low = mid + 1;

            }

            else if (arr[mid] > item) {
                high = mid - 1;

            }

            else {
                return mid;
            }
        }
        return -1;

    }
}