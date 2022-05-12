package tasks.thursday12may.task2;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        // Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
        //Think of how you could use any of the Set implementation to implement
        //this program.

        // Bonus:
        // Ignore case sensitivity. For example, Apple and apple should be counted as the same word.
        //Hint: to get the text as an String array can be regular expression used e.g.: String[] words = Text.TEXT.split("\\s+");
        String[] wordsFromText = Text.TEXT.split("\\s+");
        Set<String> uniqueWordsFromText = new HashSet<>();
        for (String word:wordsFromText){
            uniqueWordsFromText.add(word.toLowerCase());
        }
        int uniqueWordCount = uniqueWordsFromText.size();
        System.out.println("the count of unique words is: " + uniqueWordCount);

        for (String word:uniqueWordsFromText){
            System.out.print(word + " ");
        }


    }
}
