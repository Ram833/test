package report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseTesting {


	static Connection con = null;
	
	private static Statement stmt;
	
	public static String DB_URL = "jdbc:mysql://localhost:3306/world";
	
	public static String DB_USER = "root";
	
	public static String DB_PASSWORD = "ram1234";
	
	@BeforeTest
	public void setup() {
		try {
			
			String dbclass = "com.mysql.jdbc.Driver";
			Class.forName(dbclass).newInstance();
			
			Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			stmt = con.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	@Test
	public void test() {
		try {
			
			String query = "select * from city";
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				System.out.println("\t"+res.getString(1));
				System.out.println("\t"+res.getString(2));
				System.out.println("\t"+res.getString(3));
				System.out.println("\t"+res.getString(4));
				System.out.println("\t"+res.getString(5));

			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void finish() throws SQLException {
		if(con != null) {
			con.close();
		}
	}
	
}
