import java.sql.*;

public class DBConnect {
	
	static String url = "root";
	static String user = "";
	static String password = "";
	static Connection con;
	
	public static void DoConnect() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		 con = DriverManager.getConnection(url, user, password);
		
	}
}
