<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<body>
	<%
		String enroll = (String) request.getParameter("enroll");
		String name = (String) request.getParameter("name");
		String email = (String) request.getParameter("email");
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "");
			String sql = "insert into student11(enrollment_no,name,email) values(?,?,?)";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(enroll));
			ps.setString(2, name);
			ps.setString(3, email);
			int i = ps.executeUpdate();
			System.out.println(i + " rows inserted");
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.setAttribute("user", name);
		response.sendRedirect("home.jsp");
	%>
</body>
</html>