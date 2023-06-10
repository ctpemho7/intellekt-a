package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Cycles {
    public static void main(String[] args) {
        double[] example_weights = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};
        Double[] example_weightsD = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};


        checkWeight(new double[]{});
        checkWeight(example_weights);
        System.out.println();
        checkWeight(example_weightsD);
    }

    public static void checkWeight(double[] weights) {
        double eta = 0.05;

        if (weights == null || weights.length == 0) {
            System.out.println("Not enough substance");
            return;
        }

        boolean isOk = true;
        for (int i = 0; i < weights.length - 1; i++) {
            if (weights[i] <= eta * 0.9) {
                System.out.println(weights[i]);
                isOk = false;
            }
        }
        if (isOk)
            System.out.println("Ok");
    }

    public static void checkWeight(Double[] weights) {
// If average exists check if it is enough
        if (weights.length == 0)
        {
            System.out.println("Not enough substance");
            return;
        }

        var badPillsWeights = Arrays.stream(weights).filter(e -> e <= 0.045).toList();

        if (badPillsWeights.size() == 0)
            System.out.println("Ok");
        else
            badPillsWeights.forEach(System.out::println);
    }

    // счётчик
//    public static void checkWeight(double[] weights) {
//        double eta = 0.05;
//
//        if (weights == null || weights.length == 0) {
//            System.out.println("Not enough substance");
//            return;
//        }
//
//        for (int i = 0; i < weights.length - 1; i = i + 3) {
//            if (weights[i] <= eta * 0.9) {
//                System.out.println("Not enough substance");
//                return;
//            }
//        }
//
//        System.out.println("Ok");
//    }
//
//    public static void checkWeight(Double[] weights) {
//// If average exists check if it is enough
//        var message = weights.length == 0 || IntStream.
//                range(0, weights.length).
//                filter(n -> n % 3 == 0).
//                mapToDouble(Arrays.asList(weights)::get).
//                anyMatch(e -> e < 0.045) ?
//                "Not enough substance" :
//                "Ok";
//        System.out.println(message);
//    }

}
