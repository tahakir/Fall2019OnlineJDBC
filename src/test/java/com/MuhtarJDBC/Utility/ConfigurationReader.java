package com.MuhtarJDBC.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
        }
    }
    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println( getProperty("JDBC_URL"));
        System.out.println(getProperty("JDBC_userName"));
        System.out.println(getProperty("JDBC_passWord"));
    }


}