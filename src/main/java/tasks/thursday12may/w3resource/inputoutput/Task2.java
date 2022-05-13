package tasks.thursday12may.w3resource.inputoutput;

import java.io.*;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) {
       // 2. Write a Java program to get specific files by extensions from a specified folder.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final String  fileExtension;
        File folder = null;
        try {
            System.out.println("enter directory");
            folder = new File(bufferedReader.readLine());
            System.out.println("enter file extension");
            fileExtension = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                if (name.endsWith(fileExtension)){
                    return true;
                }
                else return false;
            }
        });

        for (File file:listOfFiles){
            System.out.println(file.getName());
        }


    }
}
