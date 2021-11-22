
import java.sql.*;
import java.util.*;

class JDBCTest {
	public static void main(String a[]) {
		// Creating the connection
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "12345";

		// Entering the data
	
		// Inserting data using SQL query
		String sql = "insert into student1 values('" + "fd" + "'," + "fdfd" + ",'" + "dsds" + "')";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.driver");

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
