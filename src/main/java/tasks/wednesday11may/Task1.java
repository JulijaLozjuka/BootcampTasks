package tasks.wednesday11may;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

       /* 1) Write a program which creates two dimensional
// array and stores multiplication table (from 1 - 10) in it.

        Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100

        Hint:
        1) don't forget that you have to save the values in array and output them from array.
        2) Arrays should be the size of [10][10]
        */



//created table + output
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < multiplicationTable.length ; i++) {
            for (int j = 0; j <multiplicationTable[i].length ; j++) {
                multiplicationTable[i][j] = (i +1) * (j +1);
                System.out.println((i+1) + " * " + (j+1) + " = " + (i+1)*(j+1));
            }
        }

        // whole multiplication table output in table view
        for (int i = 0; i < multiplicationTable.length ; i++) {
            for (int j = 0; j <multiplicationTable[i].length ; j++) {
                if ((multiplicationTable[i][j]+"").length()<2){
                    System.out.print(multiplicationTable[i][j] + "  ");
                }
                else{
                    System.out.print(multiplicationTable[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
