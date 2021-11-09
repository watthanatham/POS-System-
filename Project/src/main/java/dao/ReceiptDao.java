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
import model.Receipt;

/**
 *
 * @author nutthawut
 */
public class ReceiptDao implements DaoInterface<Receipt> {

    @Override
    /*public int add(Receipt object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO Receipt (CUS_ID, user_id, total) VALUES(?,?,?;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, object.getCustomer().getId());
            stmt.setDouble(2, object.getSeller().getId());
            stmt.setDouble(3, object.getTotal());
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
    }*/

    @Override
    public ArrayList<Receipt> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Receipt WHERE prod_type = 'Coffee'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String ptype = result.getString("prod_type"); 

                Receipt product = new Receipt(id, name, price, img, ptype);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }
    public ArrayList<Receipt> getMT() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Receipt WHERE prod_type = 'MT'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String ptype = result.getString("prod_type"); 

                Receipt product = new Receipt(id, name, price, img, ptype);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }
    public ArrayList<Receipt> getBakery() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Receipt WHERE prod_type = 'Bakery'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String img = result.getString("prod_img");
                String ptype = result.getString("prod_type"); 

                Receipt product = new Receipt(id, name, price, img, ptype);
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    public ArrayList<Receipt> getId(String id) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Stock_ID, Stock_Name, Stock_Price, Stock_Amount FROM Stock WHERE Stock_ID='" + id + "'";
            Statement stmt = conn.createStatement();
            ResultSet ans = stmt.executeQuery(sql);
            while (ans.next()) {
                int sid = ans.getInt("Stock_ID");
                String name = ans.getString("Stock_Name");
                double price = ans.getDouble("Stock_Price");
                int amount = ans.getInt("Stock_Amount");
                Receipt product = new Receipt(sid, name, price, amount);
                list.add(product);

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Stock id " + id + "!!");
        }
        db.close();
        return list;
    }

    public ArrayList<Receipt> getMin() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Stock WHERE Stock_Amount <=5";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("Stock_ID");
                String name = result.getString("Stock_Name");
                double price = result.getDouble("Stock_Price");
                int amount = result.getInt("Stock_Amount");
                Receipt product = new Receipt(id, name, price, amount);
                list.add(product);
                System.out.println(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all Stock!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    public ArrayList<Receipt> getStock(String id) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {

            String sql = "SELECT Stock_ID, Stock_Name, Stock_Price, Stock_Amount FROM Stock WHERE Stock_ID ORDER BY Stock_Amount DESC='" + id + "'";
            Statement stmt = conn.createStatement();

            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int sid = result.getInt("Stock_ID");
                String name = result.getString("Stock_Name");
                double price = result.getDouble("Stock_Price");
                int amount = result.getInt("Stock_Amount");
                Receipt product = new Receipt(sid, name, price, amount);
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
    public Receipt get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Stock_ID, Stock_Name, Stock_Price, Stock_Amount FROM Stock WHERE Stock_ID=" + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int sid = result.getInt("Stock_ID");
                String name = result.getString("Stock_Name");
                double price = result.getDouble("Stock_Price");
                int amount = result.getInt("Stock_Amount");
                Receipt product = new Receipt(sid, name, price, amount);
                return product;
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Stock id " + id + "!!" + ex.getMessage());
        }
        return null;
    }

    public ArrayList<Receipt> getName(String name) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();

        try {

            String sql = "SELECT * FROM Stock WHERE Stock_Name = \'" + name + "\'";
            Statement stmt = conn.createStatement();
            ResultSet ans = stmt.executeQuery(sql);
            if (ans.next()) {

                int id = ans.getInt("Stock_ID");
                String sname = ans.getString("Stock_Name");
                double price = ans.getDouble("Stock_Price");
                int amount = ans.getInt("Stock_Amount");
                Receipt product = new Receipt(id, sname, price, amount);
                list.add(product);

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Stock name " + name + "!!");
        }
        db.close();
        return list;
    }

    public ArrayList<Receipt> getMainmenuReceipt() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Stock_ID,\n"
                    + "       Stock_Name,\n"
                    + "       Stock_Price,\n"
                    + "       Stock_Amount\n"
                    + "  FROM Stock Order by Stock_Amount asc ;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("Stock_ID");
                String name = result.getString("Stock_Name");
                double price = result.getDouble("Stock_Price");
                int amount = result.getInt("Stock_Amount");
                Receipt product = new Receipt(id, name, price, amount);
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
            String sql = "DELETE FROM Stock WHERE Stock_ID = ?";
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
    public int update(Receipt object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE Stock SET Stock_Name = ?, Stock_Price = ?, Stock_Amount = ? WHERE Stock_ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setDouble(2, object.getPrice());
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
