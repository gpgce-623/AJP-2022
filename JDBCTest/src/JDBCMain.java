import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {

	public static void main(String[] args) {
		create();
		read();
		update();
		delete();
		// CRUD
	}
	
	private static final void create(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c1  = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ajp","root","");
			Statement s = c1.createStatement();
			String sql  = "insert into student values(\"166230307012\",\"vishal\",\"vishal@123\",\"male\",6,9.1,\"vishal@gpg.in\",8787879966,\"abcd\",\"gandhinagar\",382426)";
			System.out.println(sql);
			int i = s.executeUpdate(sql);
			System.out.println(i + "rows inserted");
			c1.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	
	
	private static final void read(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "");
			Statement s = c.createStatement();
			String sql = "select * from student";
			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				String enroll = rs.getString(1);
				String name = rs.getString("name");
				Double cpi = rs.getDouble("cpi");
				System.out.println(enroll + " : " + name + " : " + cpi);
			}
			rs.close();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	private static final void update(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c1  = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ajp","root","");
			Statement s = c1.createStatement();
			String sql  = "update student set mobile = \"4444455555\" where enrollment_no=\"166230307011\"";
			System.out.println(sql);
			int i = s.executeUpdate(sql);
			System.out.println(i + "rows updated");
			c1.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	
	private static final void delete(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c1  = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ajp","root","");
			Statement s = c1.createStatement();
			String sql  = "delete from student where enrollment_no=\"186230307011\"";
			System.out.println(sql);
			int i = s.executeUpdate(sql);
			System.out.println(i + "rows deleted");
			c1.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	


}
