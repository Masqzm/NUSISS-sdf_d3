package d3.io;

import java.io.File;

public class FileMain {
    public static void main(String[] args) {
        // for(String value : args)
        //     System.out.printf(">>> %s\n", value);

        if(args.length <= 0) {
            System.err.println("Please provide file name!");
            System.exit(1); // exit code 0 = all good
        }

        for(String a : args) {
            System.out.printf("\n\n>>> Processing %s\n", a);
            
            File f = new File(a);
            System.out.printf("Get absolute path: %s\n",  f.getAbsolutePath());
            System.out.printf("Is file: %s\n",  f.isFile());
            System.out.printf("Exists: %s\n",  f.exists());
            System.out.printf("Writable: %s\n",  f.canWrite());
        }

    }
}
