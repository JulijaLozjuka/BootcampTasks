package tasks.thursday12may.w3resource.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task7 {
    public static void main(String[] args) {
        // Write a Java program to get last modified time of a file.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Path file = null;
        System.out.println("enter file name");
        try {

            file = Paths.get(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            if (Files.exists(file)){
                System.out.println("file " + file.getFileName() + " last modified" + Files.getLastModifiedTime(file));
            }
            else {
                System.out.println("file " + file.getFileName() + " doesn't exist");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
