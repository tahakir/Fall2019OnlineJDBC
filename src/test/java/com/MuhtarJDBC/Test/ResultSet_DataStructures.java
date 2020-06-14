package com.MuhtarJDBC.Test;

import com.MuhtarJDBC.Utility.DBUtility;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSet_DataStructures {
    public static void main(String[] args) throws SQLException {

        ResultSet resultSet= DBUtility.getResult("SELECT*FROM employees");

        List<String> employeeNames=new ArrayList<>();

        while (resultSet.next()){
            String firstName=resultSet.getString("first_name");
            String lastName=resultSet.getString("last_name");
            String fullName=firstName+" "+lastName;
            employeeNames.add(fullName);
            
        }
        Assert.assertTrue(employeeNames.contains("Steven King"));
        System.out.println(employeeNames);

    }
}
