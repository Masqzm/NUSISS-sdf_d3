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

public class ReadWriteProcMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inFile = args[0];        // to ask: why not use File inFile = new File(args[0]);
        String outFile = args[1];

        // Open input file for reading
        Reader reader = new FileReader(inFile);
        BufferedReader br = new BufferedReader(reader);
        
        // Open output file to write to
        Writer writer = new FileWriter(outFile);
        BufferedWriter bw = new BufferedWriter(writer);
        
        String line;    // to store current line being read
        
        while((line = br.readLine()) != null)       // read line if it exists in input file
        {
            System.out.println(line);

            // Process line
            String toRemove = "\\p{Punct}"; // matches any char in: !”#$%&'()*+,-./:;<=>?@[\]^_`{|}~:
            String processed = (line.toUpperCase() + "\n").replaceAll(toRemove, "");

            bw.write(processed);    // write line to out file after manipulation
        }

        // Close files
        reader.close();
        // Flush remaining data to file before closing
        bw.flush();
        bw.close();
        //writer.flush();
        writer.close();
    }
}
