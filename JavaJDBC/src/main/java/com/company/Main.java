package com.company;

import java.sql.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            String url = "jdbc:mysql://localhost:3306/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "12345678");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345678");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=12345678");
            Connection con=DriverManager.getConnection(url, info);
            //here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from bank_account");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
