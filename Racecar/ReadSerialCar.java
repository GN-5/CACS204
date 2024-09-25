import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerialCar {
        public static void main(String[] args) {
        try (ObjectInputStream ip = new ObjectInputStream(new FileInputStream("racecar.bin"))) {
            Racecar Tesla = (Racecar) ip.readObject();
            System.out.println(Tesla);
        } catch (IOException ex) {
            System.out.println(ex.toString());

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());

        }
    }

}
