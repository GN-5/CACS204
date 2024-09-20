import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.io.ObjectInputStream;

public class RectDes {

    public static void main(String[] args) {
        try (ObjectInputStream ip = new ObjectInputStream(new FileInputStream("rectangle.bin"))) {
            Rectangle rect2 = (Rectangle) ip.readObject();
            System.out.println(rect2);
        } catch (IOException ex) {
            System.out.println(ex.toString());

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());

        }
    }

}