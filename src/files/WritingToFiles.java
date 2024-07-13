package files;

import java.io.*;

public class WritingToFiles {
    public static void main(String[] args) {

        try(Writer writer = new FileWriter("exemple.txt");
            BufferedWriter out = new BufferedWriter(writer)){
            out.write("I am writing this in the file 2");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }




    }
}
