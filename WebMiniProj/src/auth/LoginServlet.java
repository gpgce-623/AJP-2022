package auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.JDBCMain;
import model.Student;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String enroll = req.getParameter("enroll");
		String pswd = req.getParameter("pwd");

		Student s = JDBCMain.readStudent(enroll);
		if (s== null || !pswd.equals(s.getPassword())) {
			res.sendRedirect("login.html");
			return;
		}

		HttpSession session = req.getSession(true);
		String msg = "";
		if (session.isNew()) {
			//session.setAttribute("username", enroll);
			s.setPassword(null);
			session.setAttribute("student", s);
			msg = "login welcome " + enroll;
		} else {
			Student s2 = (Student) session.getAttribute("student");
			msg = "login welcome back " + s2.getEmail();
		}
		System.out.println(msg);

		res.sendRedirect("userDashboard.jsp");

		return;
	}

}
