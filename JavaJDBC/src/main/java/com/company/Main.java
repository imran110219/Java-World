package com.company;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        try{
            /* Two ways of registering driver */
//            Class.forName("com.mysql.jdbc.Driver");
            Driver myDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver( myDriver );

            /* Three ways of creating connection */
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "12345678";

            /* Creating Properties object */
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "12345678");

//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345678");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=12345678");
            Connection con=DriverManager.getConnection(url, info);

            /* Three types of Statement Interface */

            //Statement Interface
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user");

            //PreparedStatement Interface
            String psql = "update user set author=? where id=?";
            PreparedStatement pstmt = con.prepareStatement(psql);
            pstmt.setString(1,"Sadman");
            pstmt.setInt(2,1);
            int i=pstmt.executeUpdate();
            System.out.println(i+" records updated");

            //CallableStatement Interface
            String csql = "{call getAuthor (?, ?)}";
            CallableStatement cstmt = con.prepareCall (csql);
            cstmt.setInt(1,1);
            cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            cstmt.execute();
            String author = cstmt.getString(2);
            System.out.println("User with ID:" +
                    1 + " is " + author);
//            System.out.println(cstmt.getString(2));

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
