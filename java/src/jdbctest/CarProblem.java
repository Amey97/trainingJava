package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CarProblem {

	public static final int updateStatus = 1;
	static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbname = "Amey";
	static String dbpass = "oracl";
static int id =0;
	static Scanner sc;
	public static void main(String[] args) {
		Boolean loop=true;
		
		while (loop) {
			System.out.println("1 for Registeration \n 2 for show avalable cars \n 3 for waiting list of customer \n 4 for start ride \n 5 for exit");
			sc = new Scanner(System.in);
			byte ch=sc.nextByte();
			switch (ch) {
			case 1:
				Registration();
				break;
			case 2:
				carList();
				break;
			case 3:
				custwaiting();
				break;
			case 4:
				startride();
				break;
				case 5:
					System.exit(0);
					break;
			default:System.out.println("Enter valid input");
				break;
			}
		}
	
	}
	public static void Registration() {
			id++;
			try {
			Connection con = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbname, dbpass);
		
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("select start location");
			Statement st1= con.createStatement();
			ResultSet rt = st1.executeQuery("SELECT * from location");
			while (rt.next()) {
				String na = rt.getString("location");
				String id = rt.getString("l_id");  
				System.out.println(" id : "+id+" location:  " + na);
			}
			System.out.println("Selct id from above : ");
			int loc=sc.nextInt();
			Statement st2= con.createStatement();
			ResultSet rs = st2.executeQuery("SELECT location FROM location where l_id = '"+loc+"'");
			String start_loc = null;
			while(rs.next())
			{
				start_loc=rs.getString("location");
			}
			
			System.out.println(start_loc);
			System.out.println("select end location");
			while (rt.next()) {
				String na = rt.getString("location");
				String id = rt.getString("l_id");  
				System.out.println(" id : "+id+" location:  " + na);
			}
			System.out.println("Selct id from above : ");
			int locend=sc.nextInt();
			Statement st3= con.createStatement();
			ResultSet rs1 = st3.executeQuery("SELECT location FROM location where l_id = '"+locend+"'");
			String end_loc = null;
			while(rs1.next())
			{
				end_loc=rs1.getString("location");
			}
			String sql = "insert into Customer values('" +id + "','" +name + "','" +start_loc + "','" +end_loc + "')";
			
				
				
				Statement st31 = con.createStatement();
				int mySt = st31.executeUpdate(sql);
				if(mySt == updateStatus) 
					
						System.out.println("Inserted successfully : " +sql);
				else
					System.out.println("Inserted failed");
				con.close();
				System.out.println("do you want to start ride : ans in Y/N");
				String ch=sc.next();
				if(ch.equalsIgnoreCase("Y"))
				{
					startride();
				}
				else
				{
					System.out.println("closing the application");
				}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
public static void carList() {
	try {
		 Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(dburl, dbname, dbpass);
		
		System.out.println("select your location : ");
		int loc;
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("SELECT * from location");
		while (rt.next()) {
			String name = rt.getString("location");
			String id = rt.getString("l_id");
			System.out.println(" id : "+id+" location:  " + name);
		}
		System.out.println("Selct id from above : ");
		loc=sc.nextInt();
		//'" + loc + "'"    SELECT *    
		ResultSet rs = st.executeQuery("SELECT * from car where start_loc = (SELECT location FROM location where l_id = '"+loc+"')");
		if(rs.next()) {
		System.out.println("Available cars are:");
		}
		else {
			System.out.println("cars not avalible at this location");
		}
		while (rs.next()) {
			String name = rs.getString("car_name");
			String id = rs.getString("car_id");
			System.out.println("car id is : "+id+" and name is: " + name);
		}

		con.close();
	} catch (Exception e) {
		System.out.println(e);
	}
	}
public static void custwaiting() {
	
	try {
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(dburl, dbname, dbpass);
		
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("SELECT * from customer");
		while (rt.next()) {
			String name = rt.getString("c_name");
			String loc = rt.getString("start_loc");
			System.out.println(" name : "+name+" waiting at location:  " + loc);
		}
		
}
catch (Exception e) {
	System.out.println(e);
}
	
}
public static void startride() {
	int count;
	try {
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(dburl, dbname, dbpass);
		                                             
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("SELECT * from customer");
		while (rt.next()) {
			String name = rt.getString("c_name");
			String loc = rt.getString("start_loc");
//			if()
			System.out.println(" name : "+name+" waiting at location:  " + loc);
		}
		
}
catch (Exception e) {
	System.out.println(e);
}
}
}
