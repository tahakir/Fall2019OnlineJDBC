package com.MuhtarJDBC.Test;

import com.MuhtarJDBC.Utility.DBUtility;

import java.sql.SQLException;

public class MetaData {
    public static void main(String[] args) throws SQLException {

        System.out.println(DBUtility.metadata.getUserName());
        System.out.println(DBUtility.metadata.getDatabaseProductVersion());
        System.out.println(DBUtility.metadata.getConnection());


    }
}
