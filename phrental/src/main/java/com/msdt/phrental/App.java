package com.msdt.phrental;

import java.util.Properties;

import com.msdt.phrental.domain.CustRole;
import com.msdt.phrental.domain.Customer;
import com.msdt.phrental.util.PropertiesReader;


public class App 
{
    public static void main( String[] args )
    {
        Properties properties =  PropertiesReader.getPorperties("src/main/resources/dbconnection.properties");
        
        System.out.println("File Length: " + properties.size());
        System.out.println("jdbcUrl: " + properties.getProperty("jdbcUrl"));
    }
}
