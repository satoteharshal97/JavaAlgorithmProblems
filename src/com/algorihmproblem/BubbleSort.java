package com.algorihmproblem;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {32, 13, 26, 35, 10};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println("Arr at i and j :" + arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
