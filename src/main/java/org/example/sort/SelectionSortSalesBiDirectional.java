package org.example.sort;

public class SelectionSortSalesBiDirectional {


    public static void main(String[] args) {
        String[] countries = {"QKv", "iAC", "oGu", "jSv", "cvx", "JJJ",};
        double[] sales = {23.0, 15.7, 12.7, 47.8, 58.7, 1.9};

        System.out.println("Unsorted array");
        printData(countries, sales);

        sortSales(countries, sales);
        System.out.println("Sorted array");
        printData(countries, sales);
    }


    private static void sortSales(String[] names, double[] data) {
        boolean isAllRight = checkData(names, data);
        if (!isAllRight)
            return;

        // max
        double max;
        int maxId;
        String maxName;
        // min
        double min;
        int minId;
        String minName;

        // Границы
        int maxBoundary = data.length - 1;
        int minBoundary = 0;


        for (int i = 0; i < names.length / 2; i++) {

            // инициализация
            maxId = maxBoundary;
            max = data[maxId];
            maxName = names[maxId];
            minId = minBoundary;
            min = data[minId];
            minName = names[minId];

            for (int j = minBoundary; j < maxBoundary; j++) {
                // ищем максимальный элемент
                if (data[j] > max) {
                    max = data[j];
                    maxId = j;
                    maxName = names[j];
                }

                // ищем минимальный элемент
                if (data[j] < min) {
                    min = data[j];
                    minId = j;
                    minName = names[j];
                }
            }


            // меняем
            data[maxId] = data[maxBoundary];
            data[maxBoundary] = max;
            names[maxId] = names[maxBoundary];
            names[maxBoundary] = maxName;

            data[minId] = data[minBoundary];
            data[minBoundary] = min;
            names[minId] = names[minBoundary];
            names[minBoundary] = minName;

            minBoundary += 1;
            maxBoundary -= 1;
        }
    }

    // идём только по половине массива внешним циклом
//        for (int i = 0; i < maxBoundary; i++) {
//            // инициализация
//            maxId = i;
//            max = data[maxId];
//            maxName = names[maxId];
//            // min
//            minId = i;
//            min = data[minId];
//            minName = names[minId];
//
//            //
//            for (int j = i + 1; j <= data.length - i - 1; j++) {
//                // ищем максимальный элемент
//                if (data[j] > max){
//                    max = data[j];
//                    maxId = j;
//                    maxName = names[j];
//                }
//
//                // ищем минимальный элемент
//                if (data[j] < min){
//                    min = data[j];
//                    minId = j;
//                    minName = names[j];
//                }
//            }
//
//
//            // меняем
//            data[maxId] = data[data.length - i - 1];
//            data[data.length - i - 1] = max;
//            names[maxId] = names[names.length - i  - 1];
//            names[data.length - i - 1] = maxName;
//
//            data[minId] = data[i];
//            data[i] = min;
//            names[minId] = names[i];
//            names[i] = minName;
//        }


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
        for (int i = 0; i < data.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }
}

