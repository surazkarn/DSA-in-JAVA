public class ArrayDemo {

    public static void main(String[] args) {
        // declare
        int[] arr = null;

        // allocate space
        arr = new int[5];
        System.out.println(arr);

        // get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // set
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // using loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        // enhanced for loop
        for (int value : arr) {
            System.out.println(value);
        }

    }
}
