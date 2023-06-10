package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        BubbleSortSales.ShowWorking();
        System.out.println(fact(6));
    }

    public static int fact(int x) {
        if (x > 1)
            return x * fact(x - 1);
        else
            return x;
    }


    public static void sort(int[][] array) {

/// Asserts
        if (array == null || array.length == 0) {
            System.out.print("Empty data");
        }

        for (var i = 0; i < Objects.requireNonNull(array).length; i++) {

            if (array[i] == null) {
                System.out.printf("Empty data at index %d", i);
                return;
            }

            if (array[i].length != 3) {
                System.out.printf("Unavailable data at index %d", i);
                return;
            }

        }

/// Sort data
        for (var i = 0; i < array.length - 1; i++) {
            boolean breakFlag = true; // break if no swap

            for (var j = 0; j < array.length - 1; j++) {

                if (array[j][0] < array[j + 1][0]) {

                    int[] swapBufferArray = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapBufferArray;

/// No break
                    breakFlag = false;

                }
            }

            if (breakFlag) {
                break;
            }
        }
    }

}