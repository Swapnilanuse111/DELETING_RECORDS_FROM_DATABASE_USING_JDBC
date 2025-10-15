package deleterecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleterecord {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Is Loaded Sucessfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SWAPNIL","root","Swapnil@1706");
			Statement stmt=con.createStatement();
			 stmt.executeUpdate("delete from employee WHERE id=1");
			 System.out.println("One Record deleted Sucessfully");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

}
