package com.msdt.phrental.model.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.msdt.phrental.util.PropertiesReader;

public class DBConnection {
	
	private static final Logger LOGGER = LogManager.getLogger();
	private static final String PROPERTIES_DB_FILE = "src/main/resources/dbconnection.properties";
	private static final String URL = "jdbcUrl";
	private static final String USER = "postgres.username";
	private static final String PASSWORD = "postgres.password";
	private static final String DRIVER = "driverClassName";

	private String databaseUrl = "";
	private String databaseUser = "";
	private String databasePassword = "";
	private String databaseDriver = "";

	public DBConnection() {
		Properties properties = PropertiesReader.getProperties(PROPERTIES_DB_FILE);
		databaseUrl = properties.getProperty(URL);
		databaseUser = properties.getProperty(USER);
		databasePassword = properties.getProperty(PASSWORD);
		databaseDriver = properties.getProperty(DRIVER);
	}
	
	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(databaseUrl, databaseUser, databasePassword);

			LOGGER.info("Successfully connected to Database URL: " + databaseUrl);
			return connection;
		} catch (SQLException e) {
			LOGGER.error("Unable to connect to Database URL: " + databaseUrl + " " + e);
			throw new RuntimeException("Unable to connect to Database URL: " + databaseUrl);
		}
	}
}
