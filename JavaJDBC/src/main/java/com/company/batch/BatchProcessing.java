package com.company.batch;

import java.sql.*;

public class BatchProcessing {
    public static void main(String[] args){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            Statement stmt = con.createStatement();
//            con.setAutoCommit(false);

            String SQL1 = "INSERT INTO user (id, title, author) " +
                    "VALUES(3, 'Mr', 'Ali')";
            stmt.addBatch(SQL1);

            String SQL2 = "INSERT INTO user (id, title, author) " +
                    "VALUES(4, 'Mr', 'Asad')";
            stmt.addBatch(SQL2);

            String SQL3 = "INSERT INTO user (id, title, author) " +
                    "VALUES(5, 'Mr', 'Asad')";
            stmt.addBatch(SQL3);

            int[] count = stmt.executeBatch();
            System.out.println(count);
        } catch(Exception e){ System.out.println(e);}
    }
}
