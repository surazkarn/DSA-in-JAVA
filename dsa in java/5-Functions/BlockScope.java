public class BlockScope {

    public static int val = 20; // val is a global variable

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

        // varaible scopes
        System.out.println("varaible scopes");
        int one = 10;
        int two = 20;
        int res = DemoScopes(one, two);
        System.out.println(res);

        // global scopes
        System.out.println("global scopes");
        System.out.println(val);
        int val = 200;
        System.out.println(val);
        System.out.println(GlobalScope.val); // nameofclass.variablename
        int ans = DemoGlobalScopes(one);
        System.out.println(ans);

        // block scope
        System.out.println("block scope");

        if (one < two) {
            int three = 30;
            System.out.println(three);

            // int one;

        }

    }

    public static int DemoGlobalScopes(int one) {
        int sum = one + val;
        return sum;
    }

    public static int DemoScopes(int one, int another) {
        int sum = one + another;
        return sum;
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
