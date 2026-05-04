import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FolderExample {
    public static void main(String args[]) {

        try {
            File f = new File("MCA");

            if (f.mkdir()) {
                System.out.println("Folder created successfully");
            } else {
                System.out.println("Folder already exists");
            }

            File f2 = new File(f, "mca1.txt");

            FileWriter fw = new FileWriter(f2, true);
            fw.write("MCA1 of IILM\n");

            fw.close(); 

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}