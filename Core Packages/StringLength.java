import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int count;

        str.add("java");
        str.add("cat");
        str.add("Mandy");
        str.add("Bishesh");
        str.add("Mandikatar");

        System.out.println("Enter the number of letters you want to search ");
        count = input.nextInt();

        ListIterator<String> itr = str.listIterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.length() == count) {
                System.out.println(s);
            }
        }
        input.close();
    }
}
