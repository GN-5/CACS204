import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamRead {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("java.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
