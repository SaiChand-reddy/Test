package com.concretepage;

import java.sql.*;
import java.time.LocalDateTime;

class MysqlCon {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/concretepage", "root", "");
            Statement stmt = con.createStatement();
            Timestamp lst = Timestamp.valueOf(LocalDateTime.now());
            String sql = "INSERT INTO articles " +
                    "VALUES (11, 'Zara', 'Ali', null ,'"+lst+"')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  