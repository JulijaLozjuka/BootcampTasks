package tasks.thursday12may.w3resource.inputoutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task18 {
    public static void main(String[] args) {
        //Write a Java program to find the longest word in a text file.
        System.out.println("Enter file name to read");
        String fileName;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int maxLength = 0;
        ArrayList<String> longestWords = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            while(bufferedReader.ready()){
                String lineFromFile = bufferedReader.readLine();
                String[] words = lineFromFile.split("\\s+");
                for (String word:words){
                    if (word.length()>maxLength){
                        maxLength = word.length();
                        longestWords.clear();
                        longestWords.add(word);
                    }
                    else if (word.length()==maxLength){
                        longestWords.add(word);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (longestWords.size()>1){
            System.out.println(" the longest words contain " + maxLength + " symbols");
            longestWords.forEach(System.out::println);
        }
        else {
            System.out.println(" the longest word is \"" + longestWords.get(0) + "\" and it contains " + maxLength + "symbols");
        }





    }
}
