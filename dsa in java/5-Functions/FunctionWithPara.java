public class FunctionWithPara {

    public static void main(String[] args) {
        System.out.println("normal call");
        System.out.println("enter");
        // function call
        addition();
        System.out.println("exit");

        System.out.println("funtion with parameters");
        additionParam(10, 20);
        additionParam(20, 30);

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
