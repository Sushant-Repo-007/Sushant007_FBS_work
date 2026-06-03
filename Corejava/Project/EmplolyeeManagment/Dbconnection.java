package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dbconnection {

    Connection con = null;

    public Connection getConnection() {

        FileInputStream fis = null;

        Properties prop = new Properties();

        try {

            fis = new FileInputStream(".//Resources//dbconfig.properties");

            prop.load(fis);

            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

//            System.out.println(url);

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Connection Success");

        } catch (IOException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return con;
    }
}