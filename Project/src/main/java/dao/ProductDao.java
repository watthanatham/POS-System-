/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Database.Database;

import model.Product;

/**
 *
 * @author User
 */
public class ProductDao implements DaoInterface<Product>{

    @Override
    public int add(Product object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO Product (Product_Name, Product_Price, Product_Amount) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setDouble(2, object.getPrice());
            stmt.setInt(3, object.getAmount());
            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
            if(result.next()) {
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error : to create product!!");
        }
        db.close();
        return id;
    }

    @Override
    public ArrayList<Product> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Product_ID,\n" +
"       Product_Name,\n" +
"       Product_Price,\n" +
"       Product_Amount\n" +
"  FROM Product;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("Product_ID");
                String name = result.getString("Product_Name");
                double price = result.getDouble("Product_Price");
                int amount = result.getInt("Product_Amount");
                Product product = new Product(id, name, price, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
           System.out.println("Error : Unable to select all product!! " + ex.getMessage());
        }
        db.close();
        return list;
    }
    public ArrayList<Product> getId(String id) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Product_ID, Product_Name, Product_Price, Product_Amount FROM Product WHERE Product_ID='" + id+"'";
            Statement stmt = conn.createStatement();
            ResultSet ans = stmt.executeQuery(sql);
            while (ans.next()) {
                int pid = ans.getInt("Product_ID");
                String name = ans.getString("Product_Name");
                double price = ans.getDouble("Product_Price");
                int amount = ans.getInt("Product_Amount");
                Product product = new Product(pid, name, price, amount);
                list.add(product);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select product id " + id + "!!");
        }
        db.close();
        return list;
    }   

     public ArrayList<Product> getMin() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Product WHERE Product_Amount <=5";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("Product_ID");
                String name = result.getString("Product_Name");
                double price = result.getDouble("Product_Price");
                int amount = result.getInt("Product_Amount");
                Product product = new Product(id, name, price, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all product!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    
    
    public ArrayList<Product> getStock(String id) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try { 
            
          //  String sql2 = " SELECT PRODUCT_AMOUNT FROM PRODUCT ORDER BY PRODUCT_AMOUNT DESC;";
            String sql = "SELECT Product_ID, Product_Name, Product_Price, Product_Amount FROM Product WHERE Product_ID ORDER BY Product_Amount DESC='" + id+"'";
            Statement stmt = conn.createStatement();
     //        ResultSet result2 = stmt.executeQuery(sql2);
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int sid = result.getInt("Product_ID");
                String name = result.getString("Product_Name");
                double price = result.getDouble("Product_Price");
                int amount = result.getInt("Product_Amount");
                Product product = new Product(sid, name, price, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
           System.out.println("Error : Unable to select all product!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    @Override
    public Product get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Product_ID, Product_Name, Product_Price, Product_Amount FROM Product WHERE Product_ID=" + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if(result.next()) {
                int pid = result.getInt("Product_ID");
                String name = result.getString("Product_Name");
                double price = result.getDouble("Product_Price");
                int amount = result.getInt("Product_Amount");
                Product product = new Product(pid, name, price,amount);
                return product;
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select product id " + id + "!!" + ex.getMessage());
        }
        return null;
    }

    

    
    public ArrayList<Product> getName(String name) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        
        try {
            
            String sql = "SELECT * FROM Product WHERE Product_Name = \'"+name+"\'";
            Statement stmt = conn.createStatement();
            ResultSet ans = stmt.executeQuery(sql);
            if (ans.next()) {
                
                int id = ans.getInt("Product_ID");
                String pname = ans.getString("Product_Name");
                double price = ans.getDouble("Product_Price");
                int amount = ans.getInt("Product_Amount");
                Product product = new Product(id, pname, price, amount);
                list.add(product);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select product name " + name + "!!");
        }
        db.close();
        return list;
    }

    @Override
    public int delete(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;

        try {
            String sql = "DELETE FROM Product WHERE Product_ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            row =stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to delete product id " + id + "!!");
        }

        db.close();
        return row;
    }

    @Override
    public int update(Product object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE Product SET Product_Name = ?, Product_Price = ?, Product_Amount = ? WHERE Product_ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setDouble(2, object.getPrice());
            stmt.setInt(3, object.getAmount());
            stmt.setInt(4, object.getId());
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to update product " + object + "!!");
        }

        db.close();
        return row;
    }
}
