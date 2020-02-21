package jdbctest;



import java.sql.*;
import java.util.*;

public class InsertData {

	public static final int updateStatus = 1;

	public static void main(String[] args) {

		// connection parameters
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbName = "Amey";
		String dbPass = "oracl";

		// entering the data
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
//		System.out.println("Enter name");
//		String name = sc.next();
		
		
		// insert data using sql statement.
		String sql = "insert into my_table values('" +id + "')";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dbUrl,dbName,dbPass);
			
			Statement st = con.createStatement();
			int mySt = st.executeUpdate(sql);
			if(mySt == updateStatus) 
				
					System.out.println("Inserted successfully : " +sql);
			else
				System.out.println("Inserted failed");
			con.close();
		}
		catch(Exception ex) {
			System.err.println(ex);
		}
	}
}