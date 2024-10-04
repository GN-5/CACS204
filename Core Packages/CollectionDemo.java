import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linList = new LinkedList<>();

        ArrayList<String> arrList = new ArrayList<>();

        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            linList.add(i);
            arrList.add(i, "A");
            hashSet.add(i);
            treeSet.add(i);
        }

        Random numbers = new Random(10);

        for (int i = 0; i < numbers.nextInt(1, 3); i++) {
            linList.remove(numbers.nextInt(1, 3));
        }

        for (int i = 0; i < numbers.nextInt(1, 3); i++) {
            arrList.remove(numbers.nextInt(1, 3));
        }

        for (int i = 0; i < numbers.nextInt(1, 3); i++) {
            hashSet.remove(numbers.nextInt(1, 3));
        }

        for (int i = 0; i < numbers.nextInt(1, 3); i++) {
            treeSet.remove(numbers.nextInt(1, 3));
        }

        System.out.println(linList.size());
        System.out.println(arrList.size());
        System.out.println(hashSet.size());
        System.out.println(treeSet.size());

        String[] strArr = new String[arrList.size()];
        strArr = arrList.toArray(strArr);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(strArr[i]);
        }

        ListIterator<Integer> itr = linList.listIterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }

        while (itr.hasNext()) {
            Integer element = itr.next();

            itr.set(element + 4);
        }

        itr = linList.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        Iterator<Integer> itr1 = linList.iterator();

        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }

        while (itr1.hasNext()) {
            itr1.remove();
        }

        itr1 = linList.listIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Gaurab");
        names.add("Gaurab");
        names.add("Gaurab");
        System.out.println(names);

    }
}
