import java.util.*;

public class SQL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Integer, String> name_dict = new Hashtable<>();
        Hashtable<Integer, Integer> marks_dict = new Hashtable<>();

        String[] names = new String[5];
        Integer[] marks = new Integer[5];

        Enumeration<Integer> id;
        Integer mark;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name ");
            names[i] = input.nextLine();
            name_dict.put(i, names[i]);

            System.out.println("Enter the Mark ");
            marks[i] = input.nextInt();
            marks_dict.put(i, marks[i]);

        }

        for (int i = 0; i < 5; i++) {

        }

        id = marks_dict.keys();

        while (id.hasMoreElements()) {
            mark = id.nextElement();

            if (marks_dict.get(mark) > 80) {
                System.out.println(mark + " " + name_dict.get(mark) + " " + marks_dict.get(mark));

            }

        }
        input.close();

    }

}