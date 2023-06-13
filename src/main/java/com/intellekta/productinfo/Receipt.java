package com.intellekta.productinfo;

public class Receipt {
    public static void printReceipt(ProductInfo[] products) {
        Transaction transaction = new Transaction();

        for (ProductInfo product : products) {
            Transaction.TransactionItem item = transaction.new TransactionItem(product.price, product.name);
            item.printInfo();
        }

        transaction.printCheck();
    }

}
