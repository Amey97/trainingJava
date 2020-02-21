package jdbctest;


import java.sql.*;
import java.util.*;

public class Assessment {

	public static final int updateStatus = 1;

	public static void main(String[] args) {

		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbname = "Amey";
		String dbpass = "oracl";

		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbname, dbpass);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM employees");

			while (rs.next()) {
				String n = rs.getString("emp_name");
				int a = rs.getInt("emp_wage");
				int b = rs.getInt("emp_day");
				int c = a*b;
				System.out.println(n+"'s salary is: "+c);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
