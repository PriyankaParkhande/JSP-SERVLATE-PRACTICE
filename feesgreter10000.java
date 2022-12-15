package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class feesgreter10000 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","Priya@3010");
		 if(conn!=null) {
			 Statement stmt=conn.createStatement();
			 ResultSet rs=stmt.executeQuery("select *from course where fees>=10000");
			 while(rs.next()) {
				 System.out.println(rs.getInt("courseid")+"\t"+rs.getString("coursename")+"\t"+rs.getInt("fees"));
			 }
		 }else {
			 System.out.println("Not Connected");
		 }


	}

}
