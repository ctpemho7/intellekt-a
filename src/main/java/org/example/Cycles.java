package org.example;

public class Cycles {
    public static void main(String[] args) {
        double[] weights = {0.0};
        checkWeight(weights);
    }
    public static void checkWeight(double[] weights) {
        double eta = 0.05;

        if (weights == null || weights.length == 0) {
            System.out.println("Not enough substance");
            return;
        }

        for (int i = 0; i < weights.length; i = i + 3) {
            if (weights[i] <= eta * 0.9) {
                System.out.println("Not enough substance");
                return;
            }
        }

        System.out.println("Ok");
    }
}
