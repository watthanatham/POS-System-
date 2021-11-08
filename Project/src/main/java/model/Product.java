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

    public Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", amount=" + amount + '}';
    }
    public String toList() {
        return "Product" + "id=" + id + ", name=" + name + ", price=" + price+"\n";
    }
<<<<<<< HEAD
    

    public static ArrayList<Product> genProductList() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Americano", 50, "1.png"));
        productList.add(new Product(2, "Espresso", 60, "2.png"));
        productList.add(new Product(3, "Mocca", 55, "3.png"));
        productList.add(new Product(4, "Black Coffee Honey", 65, "4.jpg"));
        productList.add(new Product(5, "All Day", 60, "5.jpg"));
        productList.add(new Product(6, "Latte", 60, "6.png"));
        return productList;
    }
    
    
        
    

   
}
=======
 }
>>>>>>> 7b3a281b4ba72b1df55d2dd8948b84743e273bd3
