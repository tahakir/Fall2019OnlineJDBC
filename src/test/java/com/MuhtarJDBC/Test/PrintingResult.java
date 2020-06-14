package com.MuhtarJDBC.Test;

import java.sql.*;

public class PrintingResult {
    public static void main(String[] args) throws SQLException {

        String userName="hr";
        String passWord="hr";
        String URL="jdbc:oracle:thin:@54.152.21.73:1521:xe";

        Connection connection= DriverManager.getConnection(URL,userName,passWord);

        Statement statement=connection.createStatement();

        ResultSet resultSet=statement.executeQuery("SELECT*FROM employees");

        while (resultSet.next()){
            String firstName=resultSet.getString("first_name");
            String lastName=resultSet.getString("last_name");
            int salary=resultSet.getInt("salary");

            System.out.println(firstName+" "+lastName+" $"+salary);

        }

    }
}
