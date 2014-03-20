package scheduling;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConn {
    public static void main(String[] arg) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/scheduling", "root", "");
            System.out.print("yes");
        } catch (Exception e) {
            System.out.print("MYSQL ERROR:" + e.getMessage());
        }
    }
}