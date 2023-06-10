package org.example.sort;

public class SelectionSort {


    public static void main(String[] args) {
        int array[] = {1, 4, 7, 0, 3, 6, 2, 5};

        System.out.println("Unsorted array");
        printArray(array);

        for (int i = 1, max, maxId; i <= array.length; i++) {
            maxId = 0;
            max = array[maxId];

            for (int j = 1; j <= array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }

            array[maxId] = array[array.length - i];
            array[array.length - i] = max;
        }


        System.out.println("Sorted array");
        printArray(array);
    }


    private static void printArray(int[] array) {
        System.out.print("{");
        for (int element:array) {
            System.out.print(element+", ");
        }
        System.out.println("\b\b}");
    }
}
