import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3, 2);

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println("The capacity after adding 4 elements is " + vector.capacity());

        vector.addElement(5);
        vector.addElement(6);

        System.out.println("The capacity after adding 6 elements is " + vector.capacity());

        Enumeration<Integer> ienum = vector.elements();

        while (ienum.hasMoreElements()) {
            System.out.println(ienum.nextElement());
        }
    }
}
