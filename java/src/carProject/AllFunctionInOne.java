package carProject;



import java.sql.*;
import java.util.*;

public class AllFunctionInOne {

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
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter location");
		String location = sc.next();
		System.out.println("Enter price");
		String price = sc.next();
		

		String sql = "insert into suppliers values('" +id+"', '"+name+"', '"+location+"', '"+price+"')";
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