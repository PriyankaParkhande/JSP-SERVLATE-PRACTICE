package signupform;

import java.sql.*;
import java.util.*;

public class insertRecord {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","Priya@3010");
		 if(conn!=null) {
			 System.out.println("Database is connected");
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter user name");
			 String username=sc.next();
			 System.out.println("enter password");
			 String password=sc.next();
			 System.out.println("enter country");
			 String country=sc.next();
			 System.out.println("enter gender");
			 String gender=sc.next();
				java.sql.Statement stmt=conn.createStatement();
				int value= stmt.executeUpdate("insert into signupform values('"+username+"','"+password+"','"+country+"','"+gender+"')");
				if(value>0) {
					System.out.println("Record Save Success...............");
				}
				else {
					System.out.println("Some problem is there...............");
				}
		 }
		 else {
			 System.out.println("Not Connected");
		 }
		
	}

}
