package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        //4) Ask user to input a whole number and output false, if it is even number and true if it is odd number
        System.out.println("Please whole number");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(bufferedReader.readLine());
            System.out.println(a%2!=0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
