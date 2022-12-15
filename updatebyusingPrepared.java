package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatebyusingPrepared {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Priya@3010");
		if(conn!=null) {
			System.out.println("DB  connected");
			PreparedStatement pstm;
			System.out.println("enter id which u want to update");
			Scanner sc=new Scanner(System.in);
			
			pstm=conn.prepareStatement("update course set name=?, country=?  where id=? ");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter fees");
			int fees=sc.nextInt();
			pstm.setInt(3,id);
			pstm.setString(1,name);
			pstm.setInt(2,fees);
		int val=pstm.executeUpdate();
		if(val>0) {
			System.out.println("record update successfully");
		}else {
			System.out.println("please check again syntax");
		}
		}else {
			System.out.println("DB not connected");
		}


	}

}
