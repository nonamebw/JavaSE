package cn.itcast.jdbcUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static final String dbconfig = "dbconfig.properties";
    private static Properties prop = new Properties();
    static {    
        try {
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(dbconfig);
            prop.load(in);
            Class.forName(prop.getProperty("driverClassName"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }        
    }
}