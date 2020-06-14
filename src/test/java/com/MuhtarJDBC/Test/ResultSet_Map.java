package com.MuhtarJDBC.Test;

import com.MuhtarJDBC.Utility.DBUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResultSet_Map {

    public static void main(String[] args) throws SQLException {

        ResultSet resultSet=DBUtility.getResult("SELECT*FROM employees");

        Map<String,Integer> allEmployees=new LinkedHashMap<>();

        while (resultSet.next()){
            String firstName=resultSet.getString("first_name");
            String lastName=resultSet.getString("last_name");

            String fullName=firstName+" "+lastName;
            Integer salary=resultSet.getInt("salary");

            allEmployees.put(fullName,salary);

        }
        System.out.println(allEmployees);

       System.out.println(allEmployees.get("Taha King")==24000);




    }
}
