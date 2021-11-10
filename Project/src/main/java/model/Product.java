/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



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
    private String type;

    public Product(int id, String name, double price, String type, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.amount = amount;
    }
   
    public Product(String name, double price, String type, int amount) {
        
        this.name = name;
        this.price = price;
        this.type = type;
        this.amount = amount;
    }

    public Product(int id, String name, double price, String image, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.type = type;

    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, double price, String img, String ptype, int amount) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + " type=" + type + ", amount=" + amount + '}';
    }

    public String toList() {
        return "Product" + "id=" + id + ", name=" + name + ", price=" + price + "\n";
    }
}
