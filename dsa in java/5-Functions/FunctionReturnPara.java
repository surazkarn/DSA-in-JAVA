public class FunctionReturnPara {

    public static void main(String[] args) {
        System.out.println("normal call");
        System.out.println("enter");
        // function call
        addition();
        System.out.println("exit");

        System.out.println("funtion with parameters");
        additionParam(10, 20);
        additionParam(20, 30);

        System.out.println("funtion return value");
        int sum = additionReturn(30, 40); // sum is local variable of main
        System.out.println(sum);

    }

    public static int additionReturn(int a, int b) {
        // sum is local variable of additionReturn function
        int add = a + b; // int sum = a + b;
        return add; // return sum;
    }

    public static void additionParam(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    // function definition
    public static void addition() {

        int a = 6;
        int b = 8;

        int c = a + b;
        System.out.println(c);
    }

}
