import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OdbcMain {

	public static void main(String[] args) {
		try {
			String url = "jdbc:odbc:student_connection";
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c = DriverManager.getConnection(url);
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (Exception ee) {
			System.out.println(ee);
		}

	}

}
