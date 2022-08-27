
public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        // to create person class ka object
        Person p1 = new Person();
        // p1 is refrence which points to the MA in Heap
        // new is keywoard to create object
        // object bantey hai heap memeory mai
        // stack may refrence store hota hai
        Person p2 = new Person();

        System.out.println(p1.age);
        System.out.println(p1.name);

        p2.name = "suraz";
        p2.age = 20;

        System.out.println(p2.age);
        System.out.println(p2.name);

    }
}
