package org.example.sort;

public class SelectionSortSales {


    public static void main(String[] args) {
        String[] countries = {"Japan", "Turkey", "Belarus", "Russia", "India", "China", "North Korea", "Mongolia" };
        double[] sales = {3.14, 1.5, 9.2, 6, 5.3, 5.8, 9.7, 9.3};

        System.out.println("Unsorted array");
        printData(countries, sales);

//        if checkData(countries, sales)  {
        sortSales(countries, sales);
        System.out.println("Sorted array");
        printData(countries, sales);
//        }
    }


    private static void sortSales(String[] names, double[] data){
        double max;
        int maxId;
        String maxName;


        for (int i = 1; i < data.length; i++) {

            // инициализация
            maxId = 0;
            max = data[maxId];
            maxName = names[maxId];


            for (int j = 1; j <= data.length - i; j++) {
                // ищем максимальный элемент
                if (data[j] > max){
                    max = data[j];
                    maxId = j;
                    maxName = names[j];
                }
            }

            // меняем
            data[maxId] = data[data.length - i];
            data[data.length - i] = max;
            names[maxId] = names[names.length - i];
            names[names.length - i] = maxName;

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

