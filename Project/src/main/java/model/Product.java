/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
/**
 *
 * 
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int amount;
    private String image;
    
    public Product(int id, String name ,double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
 
    public Product(int id, String name ,double price, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + '}';
    }
    public String toList() {
        return "Product" + "id=" + id + ", name=" + name + ", price=" + price+"\n";
    }
    

    public static ArrayList<Product> genProductList() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Americano", 30, "1.jpg"));
        list.add(new Product(2, "Espresso", 30, "2.jpg"));
        list.add(new Product(3, "Cappuccino", 40, "3.jpg"));
        list.add(new Product(4, "Latte", 40, "4.jpg"));
        list.add(new Product(5, "Mocha", 40, "5.jpg"));
        list.add(new Product(6, "IcedTea", 35, "6.jpg"));
        return list;
    }
    
    
        
    

   
}
