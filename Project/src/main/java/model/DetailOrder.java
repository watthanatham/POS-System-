/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author watan
 */
public class DetailOrder {
    private int id;
    private Product product;
    private int amount;
    private double price;
    private Order order;
    private ArrayList<Product> listProduct;

    public DetailOrder(int id, Product product, int amount, double price,Order order) {
        this.id = id;
        this.product = product;
        this.amount = amount;
        this.price = price;
        this.order = order;
    }

    public DetailOrder(Product product, int amount,double price,Order order) {
        this(-1, product, amount, price,order);
    }
    public DetailOrder(Product product,Order order){
        this.product = product;
        this.order = order;
    }
    public ArrayList<Product> getProductList(){
        return listProduct;
    }
    public double getTotal() {
        return amount * price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "ReceiptDetail{" + "id=" + id
                + ", product=" + product
                + ", amount=" + amount
                + ", price=" + price
                + ", total=" +this.getTotal()
                + '}';
    }
}
