import java.sql.*;

class Pra12_JDBCCreateTable {
	public static void main(String a[]) {
		// Creating the connection
		String url = "jdbc:mysql://localhost:3306/ajp";
		String user = "root";
		String pass = "";
		String sql = " CREATE TABLE Student11 (`enrollment_no` INT(12) NOT NULL , `name` VARCHAR(30) NOT NULL  , `password` VARCHAR(12)NOT NULL  , `gender` VARCHAR(6) NOT NULL  , `semester` INT(1) NOT NULL  , `cpi` DECIMAL(4,2) NOT NULL  , `email` VARCHAR(30) NOT NULL  , `mobile` VARCHAR(10) NOT NULL  , `address` VARCHAR(100) NOT NULL  , `city` VARCHAR(20) NOT NULL  , `pincode` VARCHAR(6) NOT NULL  , PRIMARY KEY (`enrollment_no`) )  ";
		//String sql = "drop table student11";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			int m = st.executeUpdate(sql);
			System.out.println("table created");
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
