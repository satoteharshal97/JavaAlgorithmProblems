package com.algorihmproblem;

import java.util.Arrays;

public class InsertionSort {

    void insert(int... array){
        int i, j, temp;
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;

            while (j >= 0 && temp <= array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    void printArray(int[] array){
        Arrays.stream(array).mapToObj(j -> j + " ").forEach(System.out::print);
    }

    public static void main(String[] args) {
        int[] array = {1, 25, 9, 7, 2, 43};
        InsertionSort insertionSort = new InsertionSort();
        System.out.print("\nBefore sorting: ");
        insertionSort.printArray(array);
        insertionSort.insert(array);
        System.out.print("\n\nAfter sorting: ");
        insertionSort.printArray(array);
        System.out.println();
    }
}