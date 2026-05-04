import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String args[]) {

        try {
            File f = new File("mca.txt");

            System.out.println("File exists: " + f.exists());

            if (f.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("Error:File already exists");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}