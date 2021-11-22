import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	private static final String connectionString = "jdbc:mysql://localhost:3306/ajp";
	private static final String username = "root";
	private static final String password = "";
	private static Connection c = null;
	private static ResultSet rs = null;

	public static void main(String args[]) {
		connect();
		fetch();
		close();
	}

	private static void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(connectionString, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	private static Student[] fetch() {
		String query = "select * from student";
		Statement s;
		Student[] st_array = null;
		try {
			s = c.createStatement();
			rs = s.executeQuery(query);
			Student st;
			st_array = new Student[100];
			int len = 0;
			while (rs.next()) {
				String enroll = rs.getString(1);
				String name = rs.getString("name");
				Double cpi = rs.getDouble("cpi");
				st = new Student(enroll, name, cpi);
				st_array[len] = st;
				len++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st_array;
	}
	
	private static void close() {
		try {
			rs.close();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
