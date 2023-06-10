package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Null {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 3, 80}, {3, 2, 100}, {2, 1, 99}};

        sort(array);
    }

    public static void sort(int[][] array) {
        // Проверка на пустой массив
        if (array == null || array.length == 0) {
            System.out.print("Empty data");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];

            // Проверка на пустой вложенный массив
            if (row == null) {
                System.out.println("Empty data at index " + i);
                return;
            }

            // Проверка на некорректное количество значений во вложенном массиве
            if (row.length != 3) {
                System.out.printf("Unavailable data at index %d", i);
                return;
            }

            // Сортировка массива по идентификатору клиента (по убыванию)
            Arrays.sort(array, (row1, row2) -> Integer.compare(row2[0], row1[0]));
        }
    }
}
