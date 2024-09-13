import java.util.*;

public class ReverseTree {
    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("cherry");
        stringTreeSet.add("date");

        //printing
        System.out.println("Original TreeSet elements: " + stringTreeSet);


        TreeSet<String> reversedSet = new TreeSet<>(Collections.reverseOrder());
        reversedSet.addAll(stringTreeSet);
        System.out.println("Reversed order TreeSet elements: " + reversedSet);
    }
}
