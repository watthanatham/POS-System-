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
import model.Employee;

/**
 *
 * @author Patcharawalai
 */
public class EmployeeDao implements DaoInterface<Employee> {

    @Override
    public int add(Employee object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int no = -1;
        try {
            String sql = "INSERT INTO employee (Em_name,Em_tel,Em_type,Em_timeAt,Em_timeDe,Em_dateAt,Em_salePerDay) VALUES (? , ? , ? , ? , ? , ? , ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, object.getName());
            stmt.setString(2, object.getTel());
            stmt.setString(3, object.getType());
            stmt.setString(4, object.getTimeAM());
            stmt.setString(5, object.getTimePM());
            stmt.setString(6, object.getDate());
            stmt.setString(7, object.getSale());

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
    public ArrayList<Employee> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Em_id,Em_name,Em_tel,Em_type,Em_timeAt,Em_timeDe,Em_dateAt,Em_salePerDay FROM Employee";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt("Em_id");
                String name = result.getString("Em_name");
                String telephone = result.getString("Em_tel");
                String type = result.getString("Em_type");
                String timeAM = result.getString("Em_timeAt");
                String timePM = result.getString("Em_timeDe");
                String data = result.getString("Em_dateAt");
                String sale = result.getString("Em_salePerDay");

                Employee employee = new Employee(id, name, telephone, type, timeAM, timePM, data, sale);
                list.add(employee);
                System.out.println(employee);
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all customer!! " + ex.getMessage());
        }
        db.close();
        return list;

    }

    @Override
    public Employee get(int no) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECTE m_id , Em_name , Em_tel , Em_type , Em_timeAt , Em_timeDe,Em_dateAt,Em_salePerDay WHERE m_id = " + no;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                int id = result.getInt("Em_id");
                String name = result.getString("Em_name");
                String telephone = result.getString("Em_tel");
                String type = result.getString("Em_type");
                String timeAM = result.getString("Em_timeAt");
                String timePM = result.getString("Em_timeDe");
                String data = result.getString("Em_dateAt");
                String sale = result.getString("Em_salePerDay");
                
               Employee employee = new Employee(id, name, telephone, type, timeAM, timePM, data, sale);
                return employee;
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
            String sql = "DELETE FROM employee WHERE Em_id =  ?";
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
    public int update(Employee object) {
       Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE employee SET Em_name = ? , Em_tel = ? , Em_type = ? , Em_timeAt = ? , Em_timeDe = ? , Em_dateAt = ? , Em_salePerDay = ? WHERE Em_id = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
           
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getTel());
            stmt.setString(3, object.getType());
            stmt.setString(4, object.getTimeAM());
            stmt.setString(5, object.getTimePM());
            stmt.setString(6, object.getDate());
            stmt.setString(7, object.getSale());
            
            row = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error : Unable to update Customer " + object + "!!");
        }

        db.close();
        return row;
    }
}
