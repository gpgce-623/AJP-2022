package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Student;

public class JDBCMain {
	private static Connection c = null;

	public static void main() {
		getConnection();

		Student s1 = new Student("166230307100", "virat", "vishal@123", "male", 6, 9.1, "vishal@gpg.in", "8787879966",
				"abcd", "gandhinagar", "382426");
		// create(s1);
		// deleteStudent("166230307100");
		ArrayList<Student> students_list = readAllStudent();

		closeConnection();
	}

	public static void getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection() {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Student> readAllStudent() {
		Statement s = null;
		ResultSet rs = null;
		ArrayList<Student> students_list = new ArrayList<Student>();
		try {
			s = c.createStatement();
			String sql = "select * from student";
			rs = s.executeQuery(sql);
			Student s2 = null;
			while (rs.next()) {
				s2 = new Student();
				s2.setEnrollmentNo(rs.getString(1));
				s2.setName(rs.getString("name"));
				s2.setSemester(rs.getInt("semester"));
				s2.setPassword(rs.getString(3));
				s2.setGender(rs.getString(4));
				s2.setCpi(rs.getDouble(6));
				s2.setEmail(rs.getString(7));
				s2.setMobile(rs.getString(8));
				s2.setAddress(rs.getString(9));
				s2.setCity(rs.getString(10));
				s2.setPincode(rs.getString(11));

				System.out.println(s2);

				students_list.add(s2);

			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students_list;
	}

	public static Student readStudent(String enroll) {
		PreparedStatement s = null;
		ResultSet rs = null;
		Student s2 = null;
		try {
			String sql = "select * from student where enrollment_no = ?";
			s = c.prepareStatement(sql);
			s.setString(1, enroll);
			rs = s.executeQuery();
			while (rs.next()) {
				s2 = new Student();
				s2.setEnrollmentNo(rs.getString(1));
				s2.setName(rs.getString("name"));
				s2.setSemester(rs.getInt("semester"));
				s2.setPassword(rs.getString(3));
				s2.setGender(rs.getString(4));
				s2.setCpi(rs.getDouble(6));
				s2.setEmail(rs.getString(7));
				s2.setMobile(rs.getString(8));
				s2.setAddress(rs.getString(9));
				s2.setCity(rs.getString(10));
				s2.setPincode(rs.getString(11));
				System.out.println(s2);
			}
			rs.close();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s2;
	}

	public static void createStudent(Student student) {
		PreparedStatement ps = null;
		try {
			String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?)";
			ps = c.prepareStatement(sql);

			ps.setString(1, student.getEnrollmentNo());
			ps.setString(2, student.getName());
			ps.setString(3, student.getPassword());
			ps.setString(4, student.getGender());
			ps.setInt(5, student.getSemester());
			ps.setDouble(6, student.getCpi());
			ps.setString(7, student.getEmail());
			ps.setString(8, student.getMobile());
			ps.setString(9, student.getAddress());
			ps.setString(10, student.getCity());
			ps.setString(11, student.getPincode());

			int i = ps.executeUpdate();
			System.out.println(i + " rows inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateStudent(String enroll, String mobile) {
		PreparedStatement ps = null;
		try {
			String sql = "update student set mobile = ? where enrollment_no=?";
			ps = c.prepareStatement(sql);
			ps.setString(1, mobile);
			ps.setString(2, enroll);
			int i = ps.executeUpdate();
			System.out.println(i + " rows updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteStudent(String enroll) {
		PreparedStatement ps = null;
		try {
			String sql = "delete from student where enrollment_no=?";
			ps = c.prepareStatement(sql);
			ps.setString(1, enroll);
			int i = ps.executeUpdate();
			System.out.println(i + " rows deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
