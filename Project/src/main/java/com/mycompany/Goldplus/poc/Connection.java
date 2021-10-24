/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Goldplus.poc;

import Database.Database;

/**
 *
 * @author Windows10
 */
public class Connection {
    public static void main(String[] args) {
        java.sql.Connection conn = null;
        Database db = Database.getInstance();
        db.close();
    }
}
