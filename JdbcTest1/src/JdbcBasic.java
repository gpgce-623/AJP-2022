import java.sql.*;

public class JdbcBasic {
	private static Connection connection = null;

	public static void main(String[] args) {

		getCon();
		 create();
		// read();
		// update();
		//delete();
		// CRUD

		closeCon();
	}

	private static final void getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ajp", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static final void closeCon() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static final void create() {
		Statement s;
		try {
			s = connection.createStatement();
			String sql = "insert into student values('166230307021','vishal','vishal@123','male',6,9.1,'vishal@gpg.in',8787879966,'abcd','gandhinagar',382426)";
			int i = s.executeUpdate(sql);
			System.out.println(i + " rows inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static final void read() {
		try {
			Statement s = connection.createStatement();
			String sql = "select CURRENT_TIME from DUAL";
			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				Time d = rs.getTime(1);
				System.out.println(d);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final void update() {
		try {
			Statement s = connection.createStatement();
			String sql = "update student set mobile = '4444455555' where enrollment_no='166230307020'";
			int i = s.executeUpdate(sql);
			System.out.println(i + " rows updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final void delete() {
		try {
			Statement s = connection.createStatement();
			String sql = "delete from student where enrollment_no='1862303'";
			int i = s.executeUpdate(sql);
			System.out.println(i + " rows deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
