package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class coursewisestudentlist {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		if(conn!=null) {
			Scanner xyz  = new Scanner(System.in);
			 xyz.close();
	
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select c.coursename ,s.name from course c left join csjoin cs on c.courseid=cs.courseid left join student s on s.sid=cs.sid");
		 
			 while(rs.next()) {
			 System.out.println(rs.getString("coursename")+"\t"+rs.getString("name"));
			 }
			 
		}else {
			System.out.println("db Not Connected");
		}
	}

}
