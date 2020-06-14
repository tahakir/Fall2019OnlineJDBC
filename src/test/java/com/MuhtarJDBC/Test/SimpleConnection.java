package com.MuhtarJDBC.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {

    public static void main(String[] args) throws SQLException {

        String userName="hr";
        String passWord="hr";
        String URL="jdbc:oracle:thin:@54.152.21.73:1521:xe";

        Connection connection= DriverManager.getConnection(URL,userName,passWord);
        System.out.println("Connect Successfully");



    }

}
