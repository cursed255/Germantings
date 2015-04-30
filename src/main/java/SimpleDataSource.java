/*
 Title: SimpleDataSource
 Author: Bradley Potter & Adam Evans
 Created: 27/2/2015
 Version: 1.0 
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
/**
 *
 * @author Bradley & Adam
 */
public class SimpleDataSource 
{
    private static String url;
    private static String username;
    private static String password;
     
    /**
     * This loads the properties of the database 
     * @param database
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void init(String database)
            throws IOException, ClassNotFoundException
    {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream(database);
        props.load(in);
         
        String driver = props.getProperty("jdbc.driver");
        url = props.getProperty("jdbc.url");
        username = props.getProperty("jdbc.username");
        if(username == null) 
        {
            username = "admin";
        }
        password = props.getProperty("jdbc.password");
        if(password == null) 
        {
            password = "pass";
        }
         
         
    }
     
    /**
     * This gets the info for the connection including the url, username and password
     * @return url, username and password on the database propertiesS
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url, username, password);
    }
     
}