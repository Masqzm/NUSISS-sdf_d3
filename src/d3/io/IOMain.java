package d3.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File(args[0]);
        // Throws exception
        InputStream fis = new FileInputStream(f);

        DataInputStream dis = new DataInputStream(fis);

        int totalWords = 0;
        
        while (true) {
            String line = dis.readLine();
            if(line == null)
                break;
            System.out.printf(">>> line: %s\n", line);

            String[] words = line.split(" ");
            totalWords += words.length;
        }
        System.out.printf(">>> Total words: %s\n", totalWords);


        // // Create buffer
        // byte[] buffer = new byte[1024];

        // // Read file
        // int bytesRead = 0;
        // int total = 0;
        // while (bytesRead >= 0) {
        //     bytesRead = is.read(buffer);

        //     if(bytesRead >= 0)
        //         total += bytesRead;

        //     System.out.printf(">>> bytes read: %d\n", bytesRead);
        // }
        // System.out.printf(">>> total bytes: %d\n", total);

        // // Close stream after reading
        
        fis.close();
    }
}
