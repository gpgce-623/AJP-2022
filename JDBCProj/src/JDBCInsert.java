import java.sql.*;

class JDBCInsert {
	public static void main(String a[]) {
		// Creating the connection
		String url = "jdbc:mysql://localhost:3306/ajp";
		String user = "root";
		String pass = "root";

		String sql = "insert into student1 values('" + "fd" + "'," + "fdfd" + ",'" + "dsds" + "')";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

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
