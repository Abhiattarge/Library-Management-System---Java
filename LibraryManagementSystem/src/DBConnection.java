import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection 
{
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/dbforlibrary";
	
	public static final String USER = "root";
	public static final String PASS = "abhimanu@1998";
	static Connection conn = null;
	
	public static Connection getConnection()
	{
		try {
			
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded....");
			
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}

}
