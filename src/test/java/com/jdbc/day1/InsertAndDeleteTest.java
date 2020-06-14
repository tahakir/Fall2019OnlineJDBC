package com.jdbc.day1;

import java.sql.*;

public class InsertAndDeleteTest {

    static String URL = "jdbc:oracle:thin:@ec2-52-90-29-154.compute-1.amazonaws.com:1521:xe";
    static String username = "hr";
    static String password = "hr";

    public static void main(String[] args) throws SQLException {
        Connection connection= DriverManager.getConnection(URL,username,password);
        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        String INSERT_QUERY="INSERT INTO employees VALUES(264,'Taha','Kir','TKIR','0-900-999-3131',SYSDATE,'SDET',14999,0,NULL,NULL)";
        String DELETE_QUERY="DELETE FROM employees WHERE email='TKIR'";


        ResultSet resultSet=statement.executeQuery(INSERT_QUERY);

        resultSet.close();
        statement.close();
        connection.close();
    }
}
