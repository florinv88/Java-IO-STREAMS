import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
          Low-Level
           InputStream
           OutputStream
           FileInputStream
           FileOutputStream
           ByteArrayInputStream
         */

        /*
         * High-level
         *   PrintStream
         *   PrintWriter
         *   DataInputStream (legacy)
         *   DataOutputStream (legacy)
         *   BufferedReader
         *   BufferedWriter
         *   ObjectInputStream     Serializable!!
         *   ObjectOutputStream
         */

        /*
         * java.io.File (legacy)
         * java.nio
         *      Path , Paths, Files
         */

        System.out.println(":)");    //I/O Stream

        //We have to tell to BufferedReader how to "read" the bytes

        //InputStreamReader
        //FileReader

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        // IOException and FileNotFoundException
        try {
            String line = in.readLine();
            System.out.println("Line : "+line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //Or
        try(var input = new BufferedReader(new InputStreamReader(System.in))) {
            String line = input.readLine();
            System.out.println("Line : "+line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}