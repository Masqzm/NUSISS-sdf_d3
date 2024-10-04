package d3.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Ref to file
        Path p = Paths.get("catinthehat.txt");
        System.out.printf("toStr: %s\n", p.toString());

        // Get file
        File f = p.toFile();

        // Info on file
        System.out.printf("Get absolute path: %s\n",  f.getAbsolutePath());
        System.out.printf("Get name: %s\n",  f.getName());
        System.out.printf("Get size: %d\n",  f.length());

        // Use file
        // File cat = new File("src/d3/io/")
    }
}
