package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jointest {
	public static final int updateStatus = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbname = "Amey";
		String dbpass = "oracl";

		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbname, dbpass);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT distinct location,c_name FROM location NATURAL JOIN customerl");

			while (rs.next()) {
				String start = rs.getString("LOCATION");
				String name = rs.getString("c_name");
				System.out.println("Name :"+name+" from: "+start);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
