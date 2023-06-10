package org.example.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int array[] = {1, 4, 7, 0, 3, 6, 2, 5};
        System.out.println("Started array");
        printArray(array);

        for(int i = 1; i < array.length; ++i) {
            for(int j = 0, max; j < array.length - i; ++j) {
                if (array[j] > array[j + 1]) {
                    max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }
            }
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
