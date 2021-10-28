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

import model.Order;

/**
 *
 * @author User
 */
public class OrderDao implements DaoInterface<Order>{

    @Override
    public int add(Order object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO order ([User Type],Total)" +
"                    VALUES ('?','?');";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getUsertype());
            stmt.setDouble(2, object.getTotal());
           
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
    public ArrayList<Order> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Id,'Date of Sell','User Type',total FROM [order] ";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("Id");
                String date = result.getString("Date of Sale");
                String type = result.getString("User Type");
                double total = result.getDouble("Total");
                Order order = new Order(id, date, type, total);
                list.add(order);
                System.out.println(order);
            }
        } catch (SQLException ex) {
           System.out.println("Error : Unable to select all product!! " + ex.getMessage());
        }
        db.close();
        return list;
    }

    @Override
    public Order get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Id,'Date of Sell','User Type',total FROM [order] Where Id = " + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if(result.next()) {
                int orid = result.getInt("ID");
                String date = result.getString("Date of Sale");
                String type = result.getString("User Type");
                double total = result.getDouble("Total");
                Order order = new Order(orid, date, type,total);
                return order;
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select product id " + id + "!!" + ex.getMessage());
        }
        return null;
    }

    @Override
    public int delete(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;

        try {
            String sql = "DELETE FROM [order] WHERE id = ?";
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
    public int update(Order object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE [order] SET 'Date of Sell' = '?', 'Use Type' = '?' , total = '?' WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getDate());
            stmt.setString(2, object.getUsertype());
            stmt.setDouble(3, object.getTotal());
            stmt.setInt(4, object.getId());
            
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to update product " + object + "!!");
        }

        db.close();
        return row;
    }
}
