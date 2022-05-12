package tasks.thursday12may.w3resource.inputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task10 {
    public static void main(String[] args) {
        // Write a Java program to read contents from a file into byte array.
        String fileName = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName = bufferedReader.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        try ( FileInputStream fileInputStream = new FileInputStream(fileName)) {
                byte[] bytesFromFile = fileInputStream.readAllBytes();
                System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
