package com.intellekta.randommoney;

import java.util.Random;

// package com.intellekta.randommoney;
public class RandomMoney {
    private double price;

    public double getPrice() {
        return price;
    }

    public void sale(int numberOfShares, double time) {
        price = 5 * Math.sin(0.5 * time);
        double financialResult = numberOfShares * price;

        if (financialResult > 0) {
            System.out.printf("The company has earned USD %.2f", financialResult);
        } else if (financialResult == 0) {
            System.out.print("The company did not earn anything and did not lose on the sale");
        } else {
            System.out.printf("The company has lost USD %.2f", Math.abs(financialResult));
        }
    }

    public void testSale() {
        Random rnd = new Random();
        RandomMoney rndMoney = new RandomMoney();
        for (int i = 0; i < 3; i++) {
            rndMoney.sale(rnd.nextInt(), rnd.nextDouble(0, 50));
        }
    }

    public static void main(String[] args) {
        RandomMoney rndMoney = new RandomMoney();
        rndMoney.testSale();
    }
}
