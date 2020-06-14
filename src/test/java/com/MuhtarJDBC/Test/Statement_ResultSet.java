package com.MuhtarJDBC.Test;

import java.sql.*;

public class Statement_ResultSet {
    public static void main(String[] args) throws SQLException {

        String userName="hr";
        String passWord="hr";
        String URL="jdbc:oracle:thin:@54.152.21.73:1521:xe";

        Connection connection= DriverManager.getConnection(URL,userName,passWord);
        System.out.println("Connect Successfully");

        Statement statement=connection.createStatement();
        System.out.println("Statement is created");

        ResultSet resultSet=statement.executeQuery("SELECT*FROM employees");
        System.out.println("Result Set is completed");

        String sql="UPDATE employees SET first_name='Taha' WHERE first_name='Steven'";
        statement.executeUpdate(sql);

    }
}
