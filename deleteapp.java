package signupform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deleteapp {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","Priya@3010");
		if(conn!=null) {
			System.out.println("DB  connected");
			PreparedStatement pstm;
					
						pstm=conn.prepareStatement("delete from signupform where username=?");
						System.out.println("enter username");
						Scanner sc=new Scanner(System.in);
						String username=sc.next();
			pstm.setString(1, username);
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
