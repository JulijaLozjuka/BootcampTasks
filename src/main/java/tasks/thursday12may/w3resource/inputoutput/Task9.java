package tasks.thursday12may.w3resource.inputoutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task9 {
    public static void main(String[] args) {
        String input = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
             input = bufferedReader.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try ( FileInputStream fileInputStream = new FileInputStream(input)) {
            System.out.println("available bytes: " + fileInputStream.available());
            Path filePath = Paths.get(input);
            System.out.println("file size in bytes: " + Files.size(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
