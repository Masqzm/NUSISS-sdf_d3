package d3.io;

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set; 

// Count total unique words using Set
public class UniqueWordsMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inFile = args[0];        

        // Open input file for reading
        Reader reader = new FileReader(inFile);
        BufferedReader br = new BufferedReader(reader);

        // Create set of string
        Set<String> uniqueWords = new HashSet<>();
        
        String line;    // to store current line being read
        
        while((line = br.readLine()) != null)       // read line if it exists in input file
        {
            if(line.isEmpty())
                continue;
                
            // Process line
            String regex = "\\p{Punct}"; // matches any char in: !”#$%&'()*+,-./:;<=>?@[\]^_`{|}~:
            String processed = line.replaceAll(regex, "").toLowerCase().trim();
            
            for(String word : processed.split(" "))
                uniqueWords.add(word);

            //System.out.println(processed);
        }

        // Close files
        reader.close();

        System.out.printf("Total unique words in %s: %d\n\n", inFile, uniqueWords.size());

        for(String word : uniqueWords)
            System.out.printf("%s, ", word);
    }
}
