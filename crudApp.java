package jdbcQweryPractice;
import java.util.*;
import java.sql.*;

public class crudApp {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choise");
		System.out.println("press 1 for insert record");
		System.out.println("press 2 for delete record");
		System.out.println("press 3 for update recors");
		int ch=sc.nextInt();
	
		do {
			switch(ch) {
			case 1:
				preparedStatement p=new preparedStatement();
				break;
			case 2:
				deletebyusingPreparedStatement d=new deletebyusingPreparedStatement();
				break;
			case 3:
				updateqweryjdbc u=new updateqweryjdbc();
				break;
			
			default:
				System.out.println("invalid choice");
			}
			
			
		}while(true);
		
		

	}

}
