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
            String sql = "INSERT INTO Customer (CUS_ID, CUS_NAME, "
                    + "CUS_TELE, CUS_POINT, CUS_PURCHASES) "
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
            String sql = "SELECT CUS_NO,\n"
                    + "CUS_ID,\n"
                    + "CUS_NAME,\n"
                    + "CUS_TELE,\n"
                    + "CUS_POINT,\n"
                    + "CUS_PURCHASES\n"
                    + "FROM Customer;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int no = result.getInt("CUS_NO");
                String id = result.getString("CUS_ID");
                String name = result.getString("CUS_NAME");
                String tel = result.getString("CUS_TELE");
                double point = result.getDouble("CUS_POINT");
                int purshase = result.getInt("CUS_PURCHASES");
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
//    public ArrayList<Customer> getID(String id) {
//        ArrayList list = new ArrayList();
//        Connection conn = null;
//        Database db = Database.getInstance();
//        conn = db.getConnection();
//
//        try {
//
//            String sql = "SELECT * FROM Customer WHERE CUS_ID = \'" + id + "\',";
//            Statement stmt = conn.createStatement();
//            ResultSet result = stmt.executeQuery(sql);
//            while (result.next()) {
//                int cno = result.getInt("CUS_NO");
//                String cid = result.getString("CUS_ID");
//                String cname = result.getString("CUS_NAME");
//                String ctel = result.getString("CUS_TELE");
//                double cpoint = result.getDouble("CUS_POINT");
//                int cpurshase = result.getInt("CUS_PURCHASES");
//                Customer customer = new Customer(cno, cid, cname, ctel, cpoint, cpurshase);
//                list.add(customer);
//
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error : Unable to select product name " + id + "!!");
//        }
//        db.close();
//        return list;
//
//    }
    public ArrayList<Customer> getNAME(String name) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();

        try {

            String sql = "SELECT * FROM Customer WHERE CUS_NAME = \'" + name + "\'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int cno = result.getInt("CUS_NO");
                String cid = result.getString("CUS_ID");
                String cname = result.getString("CUS_NAME");
                String ctel = result.getString("CUS_TELE");
                double cpoint = result.getDouble("CUS_POINT");
                int cpurshase = result.getInt("CUS_PURCHASES");
                Customer customer = new Customer(cno, cid, cname, ctel, cpoint, cpurshase);
                list.add(customer);

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select product name " + name + "!!");
        }
        db.close();
        return list;

    }
    public ArrayList<Customer> getTELE(String tele) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();

        try {

            String sql = "SELECT * FROM Customer WHERE CUS_TELE = \'" + tele + "\'";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int cno = result.getInt("CUS_NO");
                String cid = result.getString("CUS_ID");
                String cname = result.getString("CUS_NAME");
                String ctel = result.getString("CUS_TELE");
                Customer customer = new Customer(cno, cid, cname, ctel);
                list.add(customer);

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select product name " + tele + "!!");
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
            String sql = "SELECT CUS_NO, CUS_ID, CUS_NAME, CUS_TELE, CUS_POINT, CUS_PURCHASES FROM Customer WHERE CUS_NO =" + no;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int pno = result.getInt("CUS_NO");
                String pid = result.getString("CUS_ID");
                String pname = result.getString("CUS_NAME");
                String ptel = result.getString("CUS_TELE");
                double ppoint = result.getDouble("CUS_POINT");
                int ppurshase = result.getInt("CUS_PURCHASE");
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
            String sql = "DELETE FROM Customer WHERE CUS_NO = ?";
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
            String sql = "UPDATE Customer SET CUS_ID = ?, CUS_NAME = ?, CUS_TELE = ? , CUS_POINT = ? , CUS_PURCHASES = ? WHERE CUS_NO = ?";
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