package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class atleast3char {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		if(conn!=null) {
			Scanner xyz  = new Scanner(System.in);
			 xyz.close();
	
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select *from course where coursename like '___%'");
		 
			 while(rs.next()) {
			 System.out.println(rs.getInt("courseid")+"\t"+rs.getString("coursename")+"\t"+rs.getInt("fees"));
			 }
			
		}else {
			System.out.println("empty set");
		}

	}
}
