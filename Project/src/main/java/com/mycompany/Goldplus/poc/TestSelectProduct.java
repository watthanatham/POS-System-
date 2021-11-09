/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Goldplus.poc;

import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author User
 */
public class TestSelectProduct {

    public static void main(String[] args) {
        java.sql.Connection conn = null;
        Database db = Database.getInstance();
        conn = db.getConnection();
        try {
            String sql = "SELECT * FROM Product";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("prod_id");
                String name = result.getString("prod_name");
                double price = result.getDouble("prod_price");
                String type = result.getString("prod_type");
                int amount = result.getInt("prod_amount");
                Product product = new Product(id, name, price, type,amount);
                System.out.println(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestSelectProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.close();
    }
}
