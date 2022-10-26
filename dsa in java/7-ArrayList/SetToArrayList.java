import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetToArrayList {
    public static void main(String[] args) {
        // create-a-hashset-of-string-type
        HashSet<String> myset = new HashSet<>();
        HashSet<Integer> myNumb = new HashSet<>();
        myset.add("I");
        myset.add("Love");
        myset.add("Programming");
        myset.add("In Java");
        System.out.println("My AphaSet : " + myset);
        //// create-a-hashset-of-integer-type
        myNumb.add(2);
        myNumb.add(2);
        myNumb.add(2);
        myNumb.add(1);
        myNumb.add(0);
        System.out.println("My Numbset: " + myNumb);
        // create-arraylist
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Javascript");
        System.out.println("ArrayList: " + stringArray);
        // Add----all---elements---from---hashset---to----arraylist
        stringArray.addAll(myset);
        System.out.println("Updated ArrayList: " + stringArray);
    }
}
