package org.example.sort;

public class BubbleSortSales {

    public static void main(String[] args){
        String[] countries = {"Japan", "Belarus", "Russia", "India", "China", "North Korea", "Mongolia" };
        double[] sales = {3.14, 1.5, 9.2, 6, 5.3, 5.8, 9.7, 9.3};

        System.out.println("Unsorted array");
//        printData(countries, sales);

        sortSales(countries, sales);
//        System.out.println("Sorted array");
//        printData(countries, sales);
    }

    private static void sortSales(String[] names, double[] data){

        boolean isAllRight = checkData(names, data);
        if (!isAllRight)
            return;

        double max;
        String maxName;

        for(int i = 1; i < data.length; ++i) {
            for(int j = 0; j < data.length - i; ++j) {
                // отсортировать подразделения по убыванию объемов продаж
                if (data[j] < data[j + 1]) {
                    // меняем данные местами
                    max = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = max;
                    // меняем названия местами
                    maxName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = maxName;
                }
            }
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
