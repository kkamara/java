import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // 3 popular options

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g. images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file.

        String filePath = "C:\\Users\\doesntexist\\workspace\\test.txt";

        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(filePath)
            );

            String line;
            while(null != (line = reader.readLine())) {
                System.out.println(line);
            }
            
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
