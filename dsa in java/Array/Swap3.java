
public class Swap3 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] other = { 100, 200, 300 };
        int i = 0;
        int j = 2;
        System.out.println(arr[0] + "," + other[0]);
        Swap(arr, other);
        System.out.println(arr[0] + "," + other[0]);

    }

    public static void Swap(int[] one, int[] two) {

        int[] temp = one;
        one = two;
        two = temp;

    }

}
