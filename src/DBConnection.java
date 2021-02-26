import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		private static String BDD = "DbTestArchi";
		private static String url = "jdbc:mysql://localhost:3306/" + BDD;
		private static String user = "root";
		private static String passwd = "";
	    private static Connection  conn;
	    private static DBConnection instance;

	   private  DBConnection() throws SQLException {
		   this.conn =DriverManager.getConnection(url, user,passwd);
	   }
	   
	   public static DBConnection setConnexion() throws SQLException {
		   if(instance == null) {
			   instance=new DBConnection();
		   } else if (instance.getConn().isClosed()) {
	            instance = new DBConnection();
	        }

	        return instance;
	   }

	    
	    public static Connection getConn() {
			return conn;
		}
	
}
