package d3.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOMain {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        // Throws exception
        InputStream is = new FileInputStream(f);
        
        // Create buffer
        byte[] buffer = new byte[1024];

        // Read file
        int bytesRead = 0;
        int total = 0;
        while (bytesRead >= 0) {
            bytesRead = is.read(buffer);

            if(bytesRead >= 0)
                total += bytesRead;

            System.out.printf(">>> bytes read: %d\n", bytesRead);
        }
        System.out.printf(">>> total bytes: %d\n", total);

        // Close stream after reading
        is.close();
    }
}
