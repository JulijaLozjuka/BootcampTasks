package tasks.tuesday10may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) {
        //3) Ask user to input a whole number and output true, if it is even number and false if it is odd number

        System.out.println("Please whole number");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(bufferedReader.readLine());
            System.out.println(a%2==0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
