package tasks.thursday12may.w3resource.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) {
        //1. Write a Java program to get a list of all file/directory names from the given.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File folder = null;
        try {
            folder = new File(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}
