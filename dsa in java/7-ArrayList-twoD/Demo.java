import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println(List);
        System.out.println(List.size());

        System.out.println(List.add(2));
        System.out.println(List);
        System.out.println(List.size());

        System.out.println(List.add(10));
        System.out.println(List);
        System.out.println(List.size());

        System.out.println(List.add(20));
        System.out.println(List);
        System.out.println(List.size());

        System.out.println(List.add(30));
        System.out.println(List);
        System.out.println(List.size());

        System.out.println(List.get(2));
        List.remove(3);
        System.out.println(List);
    }

}
