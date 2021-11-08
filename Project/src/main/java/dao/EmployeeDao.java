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
        int id = -1;
        try {
            String sql = "INSERT INTO Employee (Em_name,Em_tel,Em_type,Em_timeAt,Em_timeDe,Em_dateAt,Em_salePerDay) VALUES (? , ? , ? , ? , ? , ? , ?)";
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
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error : to create customer!!");
        }
        db.close();
        return id;
    }

    @Override
    public ArrayList<Employee> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();

        try {
            String sql = "SELECT Em_id,Em_name,Em_tel,Em_type,Em_timeAt,Em_timeDe,Em_dateAt,Em_salePerDay,user_id FROM Employee";
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

            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select all customer!! " + ex.getMessage());
        }
        db.close();
        return list;

    }

    @Override
    public Employee get(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT Em_id,\n"
                    + "       Em_name,\n"
                    + "       Em_tel,\n"
                    + "       Em_type,\n"
                    + "       Em_timeAt,\n"
                    + "       Em_timeDe,\n"
                    + "       Em_dateAt,\n"
                    + "       Em_salePerDay,\n"
                    + "       user_id\n"
                    + "  FROM Employee WHERE Em_id =  " + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            if (result.next()) {
                int eid = result.getInt("Em_id");
                String name = result.getString("Em_name");
                String telephone = result.getString("Em_tel");
                String type = result.getString("Em_type");
                String timeAM = result.getString("Em_timeAt");
                String timePM = result.getString("Em_timeDe");
                String data = result.getString("Em_dateAt");
                String sale = result.getString("Em_salePerDay");

                Employee employee = new Employee(eid, name, telephone, type, timeAM, timePM, data, sale);
                return employee;
            }
        } catch (SQLException ex) {
            System.out.println("Error : Unable to select Customer No " + id + "!!" + ex.getMessage());
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
            String sql = "DELETE FROM Employee WHERE Em_id =  ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error : Unable to delete Customer No " + id + "!!");
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
            String sql = "UPDATE Employee SET Em_name = ? , Em_tel = ? , Em_type = ? , Em_timeAt = ? , Em_timeDe = ? , Em_dateAt = ? , Em_salePerDay = ? WHERE Em_id = ?";
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

    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        System.out.println(dao.getAll());
        System.out.println(dao.get(2));
         int id = dao.add(new Employee(-1,"Nana kasiri","0874585555","Full-Time","09.00","04.00","07/07/2021","1500"));
         System.out.println("id: " + id);
         Employee lastEmployee = dao.get(id);
         System.out.println("lastEmployee " + lastEmployee);
         lastEmployee.setName("Nameeeeeeee");
         int row = dao.update(lastEmployee);
         Employee updateEmployee = dao.get(id);
         System.out.println("updateEmployee " +updateEmployee);
         dao.delete(id);
         Employee deleteEmployee = dao.get(id);
         System.out.println("delete User: " + deleteEmployee); 
    }
}
