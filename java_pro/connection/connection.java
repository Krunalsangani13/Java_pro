package connection;

import java.sql.*;
import javax.sql.*;

public class connection {
	protected static Connection cn;	
	public static Statement st;
	
	public static final String username="root";
	public static final  String password="";
	public static final  String url = "jdbc:mysql://localhost:3306/college";
	public static Connection getconnection() {
	 
	try {
		//ste2 : load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*step 3
		 * 1 : url/database
		 * 2  : username
		 * 3:password
		 */
		cn = DriverManager.getConnection(url,username,password);
//		st = (Statement) cn.createStatement();
//		String query = "INSERT INTO student " + "VALUES (4, 'harun', 'MBA')";
//		int r=st.executeUpdate(query);
//		
//		if(r>0) {
//			System.out.println("REcord inserted .....");
//		}
//		
		
	}catch(SQLIntegrityConstraintViolationException sq) {
		System.out.println("can not duplicate adhar number value");
	}
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}	
	return (cn);
	}
	
	public static void main(String[] arg) {
		connection cn=new connection();
		cn.getconnection();
	}
}
