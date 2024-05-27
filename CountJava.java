import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountJava {
    public static void main(String[] args) {
        int i, count = 0;
        Path fileName = Path
                .of("/Users/gaurabneupane/Documents/BCA/Semester III/CACS 204/Programs/IO/java.txt");

        try {
            String str = Files.readString(fileName);
            // System.out.println(str);

            String[] word = str.split("[\\s.,'1\u2019]+", 0);

            for (i = 0; i <= 420; i++) {
                // System.out.println(word[i]);
                if (word[i].equalsIgnoreCase("Java")) {
                    System.out.println(word[i]);
                    count = count + 1;
                }
            }
            System.out.println("The number of java is " + count);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {

        }

    }
}
