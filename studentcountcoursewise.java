package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class studentcountcoursewise {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		if(conn!=null) {
			Scanner xyz  = new Scanner(System.in);
			 xyz.close();
	
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select c.coursename,count(s.sid)as'student_count' from course c inner join csjoin cs on c.courseid=cs.courseid inner join student s on cs.sid=s.sid group by c.coursename");
		 
			 while(rs.next()) {
			 System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
			 }
			
		}else {
			System.out.println("course Not Connected");
		}
	}

}
