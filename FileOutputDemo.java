import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputDemo {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        String data = "This is a string";

        try {
            fout = new FileOutputStream("Test.txt", false);
            byte[] barray = data.getBytes();
            fout.write(barray);
            System.out.println("File writen successfully");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}