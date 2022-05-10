package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        /*
        1) Ask user to input two numbers, compare them and output result:
        Input:
        Enter value a: 10
        Enter value b: 10
        Expected output:
        is 10 equal to 10? - true
        is 10 less than 10? - false
        is 10 less or equal to 10? - true
        is 10 greater than 10? - false
        is 10 greater or equal to 10? - true
         */

        System.out.println("Please enter two numbers");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            int a =Integer.parseInt(bufferedReader.readLine());
            int b =Integer.parseInt(bufferedReader.readLine());
            System.out.printf("is %d equal to %d? - " + (a==b) + "\n",a,b);
            System.out.printf("is %d less than %d? - " + (a<b) + "\n",a,b);
            System.out.printf("is %d less or equal to %d? - " + (a<=b) + "\n",a,b);
            System.out.printf("is %d greater than %d? - " + (a>b) + "\n",a,b);
            System.out.printf("is %d greater or equal to %d? - " + (a>=b) + "\n",a,b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
