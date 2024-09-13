import java.util.LinkedList;

public class JoinList {
    public static void main(String[] args) {
        LinkedList<Integer> linlist1 = new LinkedList<>();
        LinkedList<Integer> linlist2 = new LinkedList<>();
        LinkedList<Integer> linlist3 = new LinkedList<>();

        for (Integer i = 0; i < 10; i++) {
            linlist1.add(i);
        }

        for (Integer i = 100; i < 110; i++) {
            linlist2.add(i);
        }

        linlist3.addAll(linlist1);
        linlist3.addAll(linlist2);

        System.out.println(linlist3);
    }
}
