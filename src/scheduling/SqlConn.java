package scheduling;

import java.sql.*;

public class SqlConn {
	//JDBC diver define and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	// Database credentials
	static final String USER = "zrwang";
	static final String PASS = "pdd63c";
	
    public static void main(String[] arg) {
    	Connection conn = null;
    	PreparedStatement stmt = null;
        try {
        	//Register JDBC driver
            Class.forName(JDBC_DRIVER);
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://cse.unl.edu/zrwang",USER, PASS);
          //Get Connection
            
            String query = "INSERT INTO Customer VALUES(default,?,?)";
            
            stmt = conn.prepareStatement(query);
            stmt.setString(1,"Dong Xu");
            stmt.setString(2, "40211231234");
            stmt.execute();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
         }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
         }finally{
            //finally block used to close resources
            try{
               if(stmt!=null)
                  stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
               if(conn!=null)
                  conn.close();
            }catch(SQLException se){
               se.printStackTrace();
            }//end finally try
         }//end try
    }
}