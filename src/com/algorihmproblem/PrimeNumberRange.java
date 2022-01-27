package com.algorihmproblem;

public class PrimeNumberRange {

    public static final int START = 0;
    public static final int END = 1000;

    public static void main(String[] args) {

        for (int i = START; i <= END; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}
