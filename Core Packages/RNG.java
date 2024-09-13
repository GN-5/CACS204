import java.util.Random;

public class RNG {

    public static void main(String[] args) {
        Random numbers = new Random(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.nextInt(1, 5));
        }
    }

}
