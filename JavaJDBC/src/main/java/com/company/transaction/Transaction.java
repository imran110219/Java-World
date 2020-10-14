package com.company.transaction;

import java.sql.*;

public class Transaction {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);

            String SQL1 = "INSERT INTO user (title, author) " +
                    "VALUES('Mr', 'Ali')";
            stmt.addBatch(SQL1);

            String SQL2 = "INSERT INTO user (title, author) " +
                    "VALUES('Mr', 'Asad')";
            stmt.addBatch(SQL2);

            String SQL3 = "INSERT INTO user (title, author) " +
                    "VALUES('Mr', 'Asad')";
            stmt.addBatch(SQL3);

            int[] count = stmt.executeBatch();
            con.commit();
        } catch(Exception e){ System.out.println(e);}
    }
}
