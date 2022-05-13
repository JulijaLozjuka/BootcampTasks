package tasks.thursday12may.w3resource.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task5 {
    public static void main(String[] args) {
        // Write a Java program to check if given pathname is a directory or a file.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Path file = null;
        System.out.println("enter file name");
        try {

            file = Paths.get(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (!Files.exists(file)){
            System.out.println("pathname " + file + " doesn't exist");
        }
        else if (Files.isDirectory(file)){
            System.out.println("pathname " + file + " is directory");
        }
        else if (Files.isRegularFile(file)){
            System.out.println("pathname " + file + " is regular file");
        }


    }

}
