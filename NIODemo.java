import java.nio.file.*;
import java.io.IOException;
import java.nio.file.InvalidPathException;

public class NIODemo {
    public static void main(String[] args) {
        // Creating a Path for a file
        Path path = Paths.get("IO/java.txt");

        // Getting information about the file
        try {
            System.out.println("File Name: " + path.getFileName());
            System.out.println("Path: " + path);
            System.out.println("Parent Directory: " + path.getParent());
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Is Regular File: " + Files.isRegularFile(path));
            System.out.println("File Size (bytes): " + Files.size(path));
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

        Path dir = Paths.get("/Users/gaurabneupane/Documents/BCA/Semester III/CACS 204");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(dir)) {
            for (Path file : files) {
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        }
    }
}