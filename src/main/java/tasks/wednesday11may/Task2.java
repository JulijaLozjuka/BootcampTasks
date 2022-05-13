package tasks.wednesday11may;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //2) Declare and initialize array with four arbitrary whole numbers.
        // Write a Java program to copy this array by iterating it.

        int[] myArray = new int[4];
        for (int i = 0; i < myArray.length ; i++) {
            myArray[i] = i+1;
        }

        int[] copyOfArray = new int[myArray.length];

        for (int i = 0; i <myArray.length ; i++) {
            copyOfArray[i] = myArray[i];
        }

        // proof that they are the same
        System.out.println(Arrays.equals(myArray,copyOfArray));

    }
}
