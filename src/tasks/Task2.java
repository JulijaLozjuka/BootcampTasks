package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        /*
        2) Ask user to input two boolean values and compare them.
                Input:
        Enter b1: true
        Enter b2: false

        Expected output:
        Is b1 and b2 equal? - false
         */

        System.out.println("Please enter two boolean values");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            boolean b1 = Boolean.parseBoolean(bufferedReader.readLine());
            boolean b2 = Boolean.parseBoolean(bufferedReader.readLine());
            System.out.println("Is b1 and b2 equal? - " + (b1==b2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
