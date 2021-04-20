package com.msdt.phrental;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.msdt.phrental.domain.CustRole;
import com.msdt.phrental.domain.Customer;
import com.msdt.phrental.model.config.DBConnection;
import com.msdt.phrental.util.PropertiesReader;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Properties properties =  PropertiesReader.getProperties("src/main/resources/dbconnection.properties");
        
        System.out.println("File Length: " + properties.size());
        System.out.println("jdbcUrl: " + properties.getProperty("jdbcUrl"));
        
        Connection connection = new DBConnection().getConnection();
        System.out.println("Connect to which database: " + connection.getCatalog());
    }
}
