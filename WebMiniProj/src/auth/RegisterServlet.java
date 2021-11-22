package auth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.JDBCMain;
import model.Student;

public class RegisterServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String enroll = req.getParameter("enroll");
		Long en = Long.parseLong(enroll);
		String email = req.getParameter("email");
		String pswd = req.getParameter("pwd");
		String name = req.getParameter("name");

		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		s.setEnrollmentNo(enroll);
		s.setPassword(pswd);
		s.setAddress(req.getParameter("address"));
		s.setCity(req.getParameter("city"));
		s.setGender(req.getParameter("gender"));
		s.setCpi(Double.parseDouble(req.getParameter("cpi")));
		s.setMobile(req.getParameter("mobile"));
		s.setPincode(req.getParameter("pincode"));
		s.setSemester(Integer.parseInt(req.getParameter("semester")));

		System.out.println(s);
		JDBCMain.createStudent(s);

		RequestDispatcher rd = req.getRequestDispatcher("login");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		}
		return;
	}

}
