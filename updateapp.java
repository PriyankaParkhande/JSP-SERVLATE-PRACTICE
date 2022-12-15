package signupform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class updateapp {

	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...........");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","Priya@3010");
		 if(conn!=null) {
			 System.out.println("Database is Connected");

				Statement stmt = conn.createStatement();
				Scanner xyz = new Scanner(System.in);
				System.out.println("Enter the username which you want to update ");
				String username = xyz.next();
				System.out.println("enter password");
				 String password=xyz.next();
				 System.out.println("enter country");
				 String country=xyz.next();
				 System.out.println("enter gender");
				 String gender=xyz.next();
				xyz.close();
				 
				int value = stmt.executeUpdate("update signupform set password='"+password+"', country='"+country+"' , gender='"+gender+"' where username='"+username+"' ");
				if (value > 0) {
					System.out.println("Product Deleted Success..............");
				} else {
					System.out.println("Some problem is there...............");
				}
			} 
		else {
			 System.out.println("Not Connected");
		 }


	}

}
