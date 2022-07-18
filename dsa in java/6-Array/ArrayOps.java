import java.util.Scanner;

public class ArrayOps {

    static Scanner sc = new Scanner(System.in); // global

    public static void main(String[] args) {

        // main should captiure that returned arr in the variable named as array
        int[] array = takeInput();
        display(array);

    }

    public static int[] takeInput() {
        System.out.println("size?");
        int n = sc.nextInt(); // user will enter size of array and will be kept in n
        int[] arr = new int[n]; // i want to allocate space to n intger

        for (int i = 0; i < arr.length; i++) { // asking value for evry index use loop
            System.out.println("enter value for " + i + "index?");
            arr[i] = sc.nextInt(); // array of i should get upgraded to what user is entering
        }

        // when u have updated all the indexes you have to return the arr

        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
