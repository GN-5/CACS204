import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

class FileInputDemo {
    public static void main(String[] args) {
        FileInputStream fin = null;
        int i;

        try {
            fin = new FileInputStream("java.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}