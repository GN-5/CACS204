
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<Racecar> carTree = new TreeSet<>();

        Racecar r1 = new Racecar(100, 100, 10);
        carTree.add(r1);

        Racecar r2 = new Racecar(90, 30, 10);
        carTree.add(r2);

        Racecar r3 = new Racecar(80, 20, 40);
        carTree.add(r3);

        Racecar r4 = new Racecar(60, 10, 30);
        carTree.add(r4);

        System.out.println(carTree);
    }
}
