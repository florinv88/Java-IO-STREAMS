package files;

import java.io.*;

public class ReadingFromFiles {

    public static void main(String[] args) {

        try (
                FileInputStream inputStream = new FileInputStream("exemple.txt");  // bytes of strings
                InputStreamReader streamReader = new InputStreamReader(inputStream);   // we create the reader that will tell the buffer how to convert the data
                BufferedReader bufferReader = new BufferedReader(streamReader);  //high level stream
        ) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
