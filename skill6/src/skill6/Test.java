package skill6;
import java.sql.*;
public class Test
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		@SuppressWarnings("unused")
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		System.out.println("Connection established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
