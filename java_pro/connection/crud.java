package connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class crud  extends connection{
	static Statement st;
	
	
	
	public static void getinsert(int enroll,String name,String stream) throws SQLException{
		
		try {
//			st =cn.createStatement();
			String query = "INSERT INTO student (enrollno,name,stream) VALUES (?,?,?)";
			PreparedStatement pmt=cn.prepareStatement(query);
			pmt.setInt(1, enroll);
			pmt.setString(2, name);
			pmt.setString(3,stream);
//			String query = "INSERT INTO student (enrollno,name,stream) VALUES ("+enroll+", "+name+", "+filed+")";
			int r=pmt.executeUpdate();
			if(r>0) {
				System.out.println("REcord inserted .....");
			}
			
		}catch(SQLIntegrityConstraintViolationException sq) {
			System.out.println("can not duplicate adhar number value");
		}
	}
	
	public static void getdelete(int enroll){
		try {
			String query = "DELETE FROM student WHERE enrollno = ?";
			PreparedStatement pmt=cn.prepareStatement(query);
			pmt.setInt(1, enroll);
//			String query = "INSERT INTO student (enrollno,name,stream) VALUES ("+enroll+", "+name+", "+filed+")";
			int r=pmt.executeUpdate();
			if(r>0) {
				System.out.println("REcord Deleted .....");
			}
			
		}catch(SQLException sq) {
//			System.out.println("can not duplicate adhar number value");
			System.out.println(sq);
		}
	}
	
	public static void getupdate(int enroll,String name,String stream){
		try {
			String query="UPDATE student SET name = ?, stream = ? WHERE enrollno = ?";
			PreparedStatement pmt=cn.prepareStatement(query);
			pmt.setString(1,name);
			pmt.setString(2,stream);
			pmt.setInt(3,enroll);
			int r=pmt.executeUpdate();
			if(r>0) {
				System.out.println("REcord update .....");
			}
			
		}catch(SQLException sq) {
//			System.out.println("can not duplicate adhar number value");
			System.out.println(sq);
		}
	}
	
	public static void getDisplay() throws SQLException {
		try {
		    String query="SELECT * FROM student";
			PreparedStatement pmt=cn.prepareStatement(query);
//			pmt.setInt(1, enroll);
			ResultSet rs=pmt.executeQuery();
			while(rs.next()) {
				System.out.println("erno=> "+rs.getInt(1)+" name=> "+rs.getString(2)+" stream=>"+rs.getString(3));
			}
			
		}catch(SQLException sq) {
//			System.out.println("can not duplicate adhar number value");
			System.out.println(sq);
		}
		
	}
}
