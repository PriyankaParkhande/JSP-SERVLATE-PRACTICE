package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletebyusingPreparedStatement {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Priya@3010");
		if(conn!=null) {
			System.out.println("DB  connected");
			PreparedStatement pstm;
					
						pstm=conn.prepareStatement("delete from course where id=?");
						System.out.println("enter id");
						Scanner sc=new Scanner(System.in);
						int id=sc.nextInt();
			pstm.setInt(1,id);
					int val=pstm.executeUpdate();
		if(val>0) {
			System.out.println("record delete successfully");
		}else {
			System.out.println("please check again syntax");
		}
		}else {
			System.out.println("DB not connected");
		}
	}

}
