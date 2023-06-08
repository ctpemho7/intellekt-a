package org.example.solved.sort;

public class SelectionSortSalesTwoDirectional {


    public static void main(String[] args) {
        String[] countries = {"Japan", "Turkey", "Belarus", "Russia", "India", "China", "North Korea", "Mongolia" };
        double[] sales = {3.14, 1.5, 9.2, 6, 5.3, 5.8, 9.7, 9.3};

        System.out.println("Unsorted array");
        printData(countries, sales);

        sortSales(countries, sales);
        System.out.println("Sorted array");
        printData(countries, sales);
    }


    private static void sortSales(String[] names, double[] data){
        boolean isAllRight = checkData(names, data);
        if (!isAllRight)
            return;

        double max;
        int maxId;
        String maxName;

        // min
        double min;
        int minId;
        String minName;

        // идём только по половине массива внешним циклом
        for (int i = 0; i < data.length / 2; i++) {
            // инициализация
            maxId = i;
            max = data[maxId];
            maxName = names[maxId];
            // min
            minId = i;
            min = data[minId];
            minName = names[minId];

            //
            for (int j = i + 1; j <= data.length - i - 1; j++) {
                // ищем максимальный элемент
                if (data[j] > max){
                    max = data[j];
                    maxId = j;
                    maxName = names[j];
                }

                // ищем минимальный элемент
                if (data[j] < min){
                    min = data[j];
                    minId = j;
                    minName = names[j];
                }
            }


            // меняем
            data[maxId] = data[data.length - i - 1];
            data[data.length - i - 1] = max;
            names[maxId] = names[names.length - i  - 1];
            names[data.length - i - 1] = maxName;

            data[minId] = data[i];
            data[i] = min;
            names[minId] = names[i];
            names[i] = minName;
        }
    }

    private static boolean checkData(String[] names, double[] data) {
        if (names.length != data.length) {
            System.out.println("Corrupted Data");
            return false;
        }

        if (names.length == 0 || data.length == 0) {
            System.out.println("Empty Data");
            return false;
        }
        return true;
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i=0; i<data.length;i++){
            System.out.print(names[i]+": "+data[i]+", ");
        }
        System.out.println("\b\b}");
    }
}

