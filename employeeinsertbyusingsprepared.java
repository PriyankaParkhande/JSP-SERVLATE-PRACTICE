package jdbcQweryPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class employeeinsertbyusingsprepared {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//driver register
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","Priya@3010");//get connection
		if(conn!=null) {
			System.out.println("DB  connected");
			PreparedStatement pstm;
			//declaration of PreparedStatement
			//.out.println("enter id");
			Scanner sc=new Scanner(System.in);
			
			pstm=conn.prepareStatement("insert into employee values('0',?,?)");
			
			System.out.println("enter name");
			String name=sc.next();//input employee name
			System.out.println("enter salary");
			int salary=sc.nextInt();//input salary
			
			pstm.setString(1,name);//set name
			pstm.setInt(2,salary);//set salary
		int val=pstm.executeUpdate();//execute qweery
		if(val>0) {
			System.out.println("record added successfully");
		}else {
			System.out.println("please check again syntax");
		}
		}else {
			System.out.println("DB not connected");
		}

	}

}
