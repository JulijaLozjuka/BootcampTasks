package tasks.thursday12may.w3resource.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {
        //3. Write a Java program to check if a file or directory specified by pathname exists or not.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Path file = null;
        System.out.println("enter file name");
        try {

            file = Paths.get(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (Files.exists(file)){
            System.out.println("file " + file.getFileName() + " exists");
        }
        else {
            System.out.println("file " + file.getFileName() + " does not exist");
        }

    }
}
