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
 * @author nutthawut
 */
public class ProductDao implements DaoInterface<Product> {

    @Override
    public int add(Product object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO Product (prod_name, prod_price, prod_type, prod_amount) VALUES (?, ?, ?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setDouble(2, object.getPrice());
            stmt.setString(3, object.getType());
            stmt.setInt(4, object.getAmount());

            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
            if (result.next()) {
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error : to create Stock!!");
        }
        db.close();
        return id;
    }

    public ArrayList<Product> getSearch(String search) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Product WHERE prod_name = \"" + search + "\" ";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(id, name, price, type, amount);
                list.add(product);

            }
        } catch (SQLException ex) {
            System.out.println("Error : Search Stock " + ex.getMessage());
        }
        db.close();
        return list;
    }

    @Override
    public ArrayList<Product> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
//            String sql = "SELECT * FROM Product WHERE prod_type = 'Coffee'";
            String sql = "SELECT * FROM Product ";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");

                Product product = new Product(id, name, price, type, amount);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }
    
    public ArrayList<Product> getCoffee() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Product WHERE prod_type = 'Coffee'";
            
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");

                Product product = new Product(id, name, price, type, amount);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    public ArrayList<Product> getMT() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Product WHERE prod_type = 'MT'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");

                Product product = new Product(id, name, price, type, amount);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    public ArrayList<Product> getBakery() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Product WHERE prod_type = 'Bakery'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(id, name, price, type, amount);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
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
            String sql = "SELECT prod_id, prod_name, prod_price, prod_type,prod_amount FROM Product WHERE prod_id='" + id + "'";
            Statement stmt = conn.createStatement();
            ResultSet ans = stmt.executeQuery(sql);
            while (ans.next()) {
                int pid = ans.getInt("prod_id");
                String name = ans.getString("prod_name");
                double price = ans.getDouble("prod_price");
                String type = ans.getString("prod_type");
                int amount = ans.getInt("prod_amount");

                Product product = new Product(pid, name, price, type, amount);
                list.add(product);

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Stock id " + id + "!!");
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
            String sql = "SELECT * FROM Product WHERE prod_amount <=5";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(id, name, price, type, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
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

            String sql = "SELECT prod_id, prod_name, prod_price, prod_type, prod_amount FROM Product WHERE prod_id ORDER BY prod_amount DESC='" + id + "'";
            Statement stmt = conn.createStatement();

            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int pid = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(pid, name, price, type, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
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
            String sql = "SELECT prod_id, prod_name, prod_price, prod_type, prod_amount FROM Product WHERE prod_id=" + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int pid = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(pid, name, price, type, amount);
                return product;
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Stock id " + id + "!!" + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Product> getName(String name) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();

        try {

            String sql = "SELECT * FROM Product WHERE prod_name = \'" + name + "\'";
            Statement stmt = conn.createStatement();
            ResultSet ans = stmt.executeQuery(sql);
            if (ans.next()) {

                int id = ans.getInt("prod_id");
                String pname = ans.getString("prod_name");
                double price = ans.getDouble("prod_price");
                String type = ans.getString("prod_type");
                int amount = ans.getInt("prod_amount");
                Product product = new Product(id, pname, price, type, amount);
                System.out.println(product);
                list.add(product);
                

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Stock name " + name + "!!");
        }
        db.close();
        return list;
    }

    public ArrayList<Product> getMainmenuProduct() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT prod_id,\n"
                    + "       prod_name,\n"
                    + "       prod_price,\n"
                    + "       prod_type\n"
                    + "       prod_amount\n"
                    + "  FROM Product Order by prod_amount asc ;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(id, name, price, type, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
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
            String sql = "DELETE FROM Product WHERE prod_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to delete Stock id " + id + "!!");
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
            String sql = "UPDATE Product SET prod_name = ?, prod_price = ?,prod_amount = ? WHERE prod_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setDouble(2, object.getPrice());
//            stmt.setString(3, object.getType());
            stmt.setInt(3, object.getAmount());
            stmt.setInt(4, object.getId());
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to update Stock " + object + "!!");
        }

        db.close();
        return row;
    }
}
