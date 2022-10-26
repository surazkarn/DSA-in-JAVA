
//create resizable arrays
//dynamic arrays
//ArrayList implements the List interface of the collections framework.
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //// create String type arraylist
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to Arraylist
        // arraylist.add(int index, E element)

        // index (optional) - index at which the element is inserted
        // element - element to be inserted

        languages.add("Java");
        languages.add(0, "Javascript");
        languages.add(2, "C");
        languages.add(1, "CPP");
        languages.add("Python");
        System.out.println(languages.size());
        System.out.println("ArrayList: " + languages);

        // If the index parameter is not passed, the element is appended to the end of
        // the arraylist.

        System.out.println(languages.add(null));
        // add() returns true if the element is successfully inserted
        System.out.println("Updated ArrayList: " + languages);
        System.out.println(languages.size());

        // another AARRAYLIST
        ArrayList<String> programmingLang = new ArrayList<>();
        // // add all elements from languages to programmingLang
        programmingLang.addAll(languages);
        System.out.println("Programming Lang : " + programmingLang);
    }

}
