import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

public class SelectDate {

	public static void main(String[] args) {
		try {
			// register and load driver
			Class.forName("com.mysql.jdbc.Driver");
			// connect to database
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp","root","");
			// create statement
			Statement s = c.createStatement();
			// execute the statement
			String sql = "select * from student";
			ResultSet rs  = s.executeQuery(sql);
			// parse the result
			while(rs.next()){
				String en = rs.getString("enrollment_no");
				String name = rs.getString("name");
				System.out.println(en + " "  + name);
			}
			rs.close();
			s.close();		
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}

	}

}
