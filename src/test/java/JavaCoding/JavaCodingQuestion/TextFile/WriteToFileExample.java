package JavaCoding.JavaCodingQuestion.TextFile;

import java.io.*;

public class WriteToFileExample {
    public static void main(String[] args) throws IOException {
        /**
         *
         * Without buffering: Every .write() call → immediate disk I/O.
         * With buffering: .write() stores data in memory buffer → flushes to disk in big chunks → fewer I/O calls.
         */

        File file = new File("src/test/java/JavaCodingQuestion/TextFile/Test1.txt");

       /* BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Hello Vishal Raj");// still in memory, not yet in file Without close or flush, file might remain empty
        //writer.newLine(); // This is for new line
        writer.close();
        */

        FileWriter writer1=new FileWriter(file);
        writer1.write("Hello Raj");
        writer1.close();
    }
}
