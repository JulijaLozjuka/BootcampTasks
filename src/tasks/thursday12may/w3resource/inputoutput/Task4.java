package tasks.thursday12may.w3resource.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {
    public static void main(String[] args) {
//  Write a Java program to check if a file or directory has read and write permission.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Path file = null;
        System.out.println("enter file name");
        try {

            file = Paths.get(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (Files.isReadable(file)&& Files.isWritable(file)){
            System.out.println("file " + file.getFileName() + " is readable and writable");
        }
        else if (Files.isReadable(file)){
            System.out.println("file " + file.getFileName() + " is only readable");
        }
        else {
            System.out.println("file " + file.getFileName() + " is not readable or writable");
        }
    }
}
