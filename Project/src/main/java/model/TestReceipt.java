/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author watan
 */
public class TestReceipt {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Cocoa", 50);
        Product p2 = new Product(2, "Green Tea", 40);
        User seller = new User("Inwza007","191911","password");
        Customer customer = new Customer("Prayuth","199991");
        Receipt receipt = new Receipt(seller, customer);
        receipt.addReceiptDetail(p1, 1);
        receipt.addReceiptDetail(p2, 3);
        System.out.println(receipt);
        receipt.deleteReceiptDetail(0);
        System.out.println(receipt);
        receipt.addReceiptDetail(p1, 2);
        System.out.println(receipt);
        receipt.addReceiptDetail(p1, 2);
        System.out.println(receipt);
    }
}
