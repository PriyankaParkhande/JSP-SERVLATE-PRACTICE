package jdbcQweryPractice;
import java.util.*;
import java.sql.*;
public class preparedStatement {

	public static void main(String[] args) throws Exception{
		//com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		//DriverManager.registerDriver(d);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Priya@3010");
		if(conn!=null) {
			System.out.println("DB  connected");
			PreparedStatement pstm;
			//.out.println("enter id");
			Scanner sc=new Scanner(System.in);
			
			pstm=conn.prepareStatement("insert into course values('0',?,?)");
			//int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter fees");
			int fees=sc.nextInt();
			//pstm.setInt(1,id);
			pstm.setString(1,name);
			pstm.setInt(2,fees);
		int val=pstm.executeUpdate();
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
