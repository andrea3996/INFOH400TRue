/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author margauxmannaerts
 */
public class DBHandler {
    
    private static Connection conn; 
    
    public static Connection getConnection(){ //static method means we don't create an instance of the object DBHandler, we can access it from different classes
        if (conn == null){ 
            try {
                //connection hasn't been connected yet
                String driver = "com.mysql.cj.jdbc.Driver";
                String userName = "patient";
                String password = "1234";
                String url = "jdbc:mysql://127.0.0.1/Projet2?serverTimezone=Europe/Brussels";


                Class.forName(driver).newInstance();
                
                //conn = DriverManager.getConnection(url);
                conn = DriverManager.getConnection(url, userName, password);
                System.out.println("Connected to the database.");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                    Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        return conn;
    }
}
