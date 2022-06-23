public class PassByValue {

    public static void main(String[] args) {
        int one = 10;
        int two = 20;

        System.out.println(one + "," + two); // 1.) 10,20
        swap(one, two);
        System.out.println(one + "," + two); // 4.) 10,20

    }

    public static void swap(int one, int two) {
        System.out.println(one + "," + two); // 2.) 10,20
        int temp = one;
        one = two;
        two = temp;
        System.out.println(one + "," + two); // 3.) 20,10

    }

}
