package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class testJdbc {

    public static void main(String[] args){

        String urlStr = "jdbc:postgresql://localhost:5432/postgres";

        String usernameStr = "postgres";

        String passwordStr = "Supernatural2005";

        try {

            System.out.println("Connection to database: " + urlStr);
            Connection myConn = DriverManager.getConnection(urlStr, usernameStr, passwordStr);
            System.out.println("Connection successful ! ");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
