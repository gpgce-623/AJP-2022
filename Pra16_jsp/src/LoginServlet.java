import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String enroll = req.getParameter("enroll");
		String name = req.getParameter("name");
		String semester = req.getParameter("semester");

		HttpSession session = req.getSession(true);
		if (session.isNew()) {
			session.setAttribute("enroll", enroll);
			session.setAttribute("name", name);
			session.setAttribute("semester", semester);
		}

		Cookie[] all_cookie = req.getCookies();
		if (all_cookie == null || all_cookie.length < 1) {
			Cookie c1 = new Cookie("1", "Maths,English,CP,FDE");
			res.addCookie(c1);
			Cookie c2 = new Cookie("2", "Maths2,Physics,CPP,ACP,SWPD");
			res.addCookie(c2);
			Cookie c3 = new Cookie("3", "DBMS,DS,OS,CPP");
			res.addCookie(c3);
			Cookie c4 = new Cookie("4", "ADBMS,.NET,FSD,CN");
			res.addCookie(c4);
			Cookie c5 = new Cookie("5", "Java,CMTS,CNS,Project1,DWPD");
			res.addCookie(c5);
			Cookie c6 = new Cookie("6", "AJP,NMA,MCAD,Project2");
			res.addCookie(c6);
		}

		res.sendRedirect("profile.jsp");

	}

}
