package sparta.mk;

import java.util.random.RandomGenerator;
import java.util.Scanner;

import java.util.Arrays;
class App {

    // perform the bubble sort


    public static void main(String args[]) {

        int[] data = { 10,0,26,45,-8,81 };

        // call method using class name
        bubbleSort(data);

        System.out.println("Array is in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}