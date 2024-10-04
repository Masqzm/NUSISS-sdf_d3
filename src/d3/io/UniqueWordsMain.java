package d3.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class UniqueWordsMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inFile = args[0];        

        // Open input file for reading
        Reader reader = new FileReader(inFile);
        BufferedReader br = new BufferedReader(reader);
        
        String line;    // to store current line being read
        
        while((line = br.readLine()) != null)       // read line if it exists in input file
        {
            // Process line
            String regex = "\\p{Punct}"; // matches any char in: !”#$%&'()*+,-./:;<=>?@[\]^_`{|}~:
            String processed = line.replaceAll(regex, "");

            System.out.println(processed);
        }

        // Close files
        reader.close();
    }
}
