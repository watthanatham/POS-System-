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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;


/**
 *
 * @author sirip
 */
public class UserDao {
     public int add(User object) {
      Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int id = -1;
        try {
            String sql = "INSERT INTO User (user_name,user_type,user_password) VALUES (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getType());
            stmt.setString(3, object.getPassword());
            
            int row = stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();

            if (result.next()) {
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error Insert from User");
        }
        db.close();
        return id;
    }

    public ArrayList<User> getAll() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        
        try {
            String sql = "SELECT * FROM User";
           Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while(result.next()){          
                int id = result.getInt("user_id");
                String name = result.getString("user_name");
                String type = result.getString("user_type");
                String password = result.getString("user_password");
                User user = new User(id,name,type,password);
                list.add(user);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error Select All from User");
        } 
        db.close();
        return list;
    }
    public ArrayList<User> getSearch(String search) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        
        try {
            String sql = "SELECT * FROM User WHERE user_id ="+ search+" ";
           Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while(result.next()){          
                int id = result.getInt("user_id");
                String name = result.getString("user_name");
                String type = result.getString("user_type");
                String password = result.getString("user_password");
                User user = new User(id,name,type,password);
                list.add(user);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error Select All from User");
        } 
        db.close();
        return list;
    }

    public User get(int id) {
        ArrayList list = new ArrayList();
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        
        try {
            String sql = "SELECT user_id,user_name,user_type,user_password FROM User WHERE id=" + id;
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if(result.next()){          
                int pid = result.getInt("user_id");
                String name = result.getString("user_name");
                String type = result.getString("user_type");
                String password = result.getString("user_password");
                User user = new User(id,name,type,password);
                return user;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error Select Id from User");
        } 
        return null;
    }

    public int delete(int id) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "DELETE FROM User WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error Delete from User");
        }

        db.close();
        return row;
    }

    public int update(User object) {
        Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        int row = 0;
        try {
            String sql = "UPDATE User SET user_name = ?, user_type = ?, user_password = ?  WHERE user_id = ?;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, object.getName());
            stmt.setString(2, object.getType());
            stmt.setString(3, object.getPassword());
            stmt.setInt(4, object.getId());
            row = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error Update from User");
        }

        db.close();
        return row;
    }
    
public static void main(String[] args) {
        UserDao dao = new UserDao();
        System.out.println(dao.getAll());
        System.out.println(dao.get(1));
        int id = dao.add(new User(-1,"Siriphonpha","Manager","0123"));
        System.out.println("id: " + id);
        User lastUser = dao.get(id);
        System.out.println("last User: "+ lastUser);
        lastUser.setName("JJ");
        int row = dao.update(lastUser);
        User updateUser = dao.get(id);
        System.out.println("update User: "+ updateUser);
        dao.delete(id);
        User deleteUser = dao.get(id);
        System.out.println("delete User: " + deleteUser); 
    }

}
