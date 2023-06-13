package com.intellekta.productinfo;

public class Transaction {
    private double price;
    public double getPrice() {
        return price;
    }

    private final double tax = 1.2;

    public Transaction() {
    }

    public double dealPrice() {
        return price * tax;
    }

    private void printCheck(double price) {
        System.out.println(String.format("%s price: %.2f USD", "Order", price));
        System.out.println(String.format("%s price: %.2f USD", "Total", dealPrice()));
    }

    public void printCheck() {
        printCheck(price);
    }

    public class TransactionItem {
        private double price;
        private String name;
        Transaction getTransaction() {
            return Transaction.this;
        }

        public TransactionItem(double price, String name) {
            if (name == null || name.trim().isEmpty()) {
                this.name = "Default";
            } else {
                this.name = name;
            }

            if (price < 0) {
                this.price = 0;
            } else {
                this.price = price;
            }
            getTransaction().price += price;
        }


        public void printInfo() {
            System.out.printf("Item: %s", name);
            getTransaction().printCheck(this.price);
        }
    }

}
