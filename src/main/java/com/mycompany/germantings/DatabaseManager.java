package com.mycompany.germantings;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brad
 */
public class DatabaseManager {
    
    
    String a = "";
    String b = "";
    String c = "";
    String d = "";
    
    public void addUser() throws IOException, ClassNotFoundException, SQLException {
        System.out.println("add Users");
        SimpleDataSource.init("database.properties");
        Connection conn = SimpleDataSource.getConnection();
        Statement st = conn.createStatement();

        try {
            String command = "INSERT INTO User(user_ID, user_name, password, user_level)" + "VALUES (?,?,?,?)";
            PreparedStatement preperedStatement = conn.prepareStatement(command);
            preperedStatement.setString(1, a);
            preperedStatement.setString(2, b);
            preperedStatement.setString(3, c);
            preperedStatement.setString(3, c);
            preperedStatement.executeUpdate();

        } finally {

            conn.close();
        }
    }
    
    public void deleteUser() throws IOException, ClassNotFoundException, SQLException {
        System.out.println("delete students");
        SimpleDataSource.init("database.properties");
        Connection conn = SimpleDataSource.getConnection();
        Statement st = conn.createStatement();
        try {
            String command = "DELETE FROM User WHERE User_ID = ?";
            PreparedStatement preperedStatement = conn.prepareStatement(command);
            preperedStatement.setString(1, a);
            preperedStatement.execute();
        } finally {
            conn.close();
        }
    }
    
    public void login() throws IOException, ClassNotFoundException, SQLException{
        System.out.println("login");
        SimpleDataSource.init("database.properties");
        Connection conn = SimpleDataSource.getConnection();
        
    }
}
