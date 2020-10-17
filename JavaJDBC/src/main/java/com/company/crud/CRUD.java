package com.company.crud;

import java.sql.*;

public class CRUD {

    public static void view(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);

            String SQL = "SELECT * FROM user";

            ResultSet result = stmt.executeQuery(SQL);

            int count = 0;

            while (result.next()){
                String title = result.getString(2);
                String author = result.getString(3);

                String output = "User #%d: %s - %s";
                System.out.println(String.format(output, ++count, title, author));
            }
            con.close();

        } catch(Exception e){ System.out.println(e);}
    }

    public static void add(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);

            String sql = "INSERT INTO user (id, title, author) "
                    + "VALUES (7,'Mr','Bob')";

            int rowsInserted = stmt.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            con.commit();
            con.close();

        } catch(Exception e){ System.out.println(e);}
    }

    public static void main(String[] args) {
        add();
        view();

    }
}

