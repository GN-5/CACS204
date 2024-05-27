import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamWrite {
    public static void main(String[] args) {
        String data = "This is a string";
        char[] buffer = new char[data.length()];
        data.getChars(0, data.length(), buffer, 0);

        try (FileWriter f1 = new FileWriter("test1.txt", false);
                FileWriter f2 = new FileWriter("test2.txt", false)) {
            f1.write(buffer);
            f2.write(data);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

}
