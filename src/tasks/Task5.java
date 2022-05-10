package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) {

        /*
        5) Write a program which reads boolean value from user and prints out the opposite value:
        Example input:
        Enter boolean value: true
        Expected output:
        Opposite of "true" is "false"
        */
        System.out.print("Enter boolean value: ");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean booleanValue = Boolean.parseBoolean(bufferedReader.readLine());
            System.out.printf("Opposite of \"%b\" is \"%b\"",booleanValue,!booleanValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
