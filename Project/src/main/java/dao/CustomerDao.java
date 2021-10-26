/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Customer;
import model.Product;

/**
 *
 * @author saharudseerakoon
 */
public class CustomerDao implements DaoInterface<Customer> {

    @Override
    public int add(Customer object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int no = -1;
        try {
            String sql = "INSERT INTO Customer (Customer_ID, Customer_Name, "
                    + "Customer_TelePhone, Customer_Point, Customer_Purshase) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getId());
            stmt.setString(2, object.getName());
            stmt.setString(3, object.getTel());
            stmt.setDouble(4, object.getPoint());
            stmt.setInt(5, object.getPurshase());

            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
            if (result.next()) {
                no = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error : to create customer!!");
        }
        db.close();
        return no;
    }

    @Override
    public ArrayList<Customer> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Customer_No,\n"
                    + "Customer_ID,\n"
                    + "Customer_Name,\n"
                    + "Customer_TelePhone,\n"
                    + "Customer_Point,\n"
                    + "Customer_Purshase\n"
                    + "FROM Customer;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int no = result.getInt("Customer_No");
                String id = result.getString("Customer_ID");
                String name = result.getString("Customer_Name");
                String tel = result.getString("Customer_TelePhone");
                double point = result.getDouble("Customer_Point");
                int purshase = result.getInt("Customer_Purshase");
                Customer customer = new Customer(no, id, name, tel, point, purshase);
                list.add(customer);
                System.out.println(customer);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all customer!! " + ex.getMessage());
        }
        db.close();
        return list;

    }

    @Override
    public Customer get(int no) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Customer_No, Customer_ID, Customer_Name,Customer_TelePhone, Customer_Point, Customer_Purshase FROM Customer WHERE Customer_No =" + no;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int pno = result.getInt("Customer_No");
                String pid = result.getString("Customer_ID");
                String pname = result.getString("Customer_Name");
                String ptel = result.getString("Customer_TelePhone");
                double ppoint = result.getDouble("Customer_Point");
                int ppurshase = result.getInt("Customer_Purshase");
                Customer customer = new Customer(pno, pid, pname, ptel, ppoint, ppurshase);
                return customer;
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Customer No " + no + "!!" + ex.getMessage());
        }
        return null;
    }

    @Override
    public int delete(int no) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;

        try {
            String sql = "DELETE FROM Customer WHERE Customer_No = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, no);
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to delete Customer No " + no + "!!");
        }

        db.close();
        return row;
    }

    @Override
    public int update(Customer object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE Customer SET Customer_ID = ?, Customer_Name = ?, Customer_TelePhone = ? , Customer_Point= ? , Customer_Purshase = ? WHERE Customer_No = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, object.getId());
            stmt.setString(2, object.getName());
            stmt.setString(3, object.getTel());
            stmt.setDouble(4, object.getPoint());
            stmt.setInt(5, object.getPurshase());
            stmt.setInt(6, object.getNo());
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to update Customer " + object + "!!");
        }

        db.close();
        return row;
    }

}
