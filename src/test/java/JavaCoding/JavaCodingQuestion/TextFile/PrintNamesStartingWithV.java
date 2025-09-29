package JavaCoding.JavaCodingQuestion.TextFile;

import java.io.*;

public class PrintNamesStartingWithV {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/JavaCodingQuestion/TextFile/textRead.txt");
        BufferedReader reader=new BufferedReader(new FileReader(file));
        String line;
        while((line=reader.readLine())!=null){
             String[] words=line.split("[,\\s]+");
             for(String s:words){
                 if(s.startsWith("V")){
                     System.out.println(s);
                 }
             }
        }
    }
}
