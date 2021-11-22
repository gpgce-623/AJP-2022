import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session = req.getSession(false);
		String name = (String) session.getAttribute("name");
		String semester = (String) session.getAttribute("semester");

		Cookie[] all_cookie = req.getCookies();
		String subject_list = null;
		for (Cookie c : all_cookie) {
			if (c.getName().equalsIgnoreCase(semester)) {
				subject_list = c.getValue();
				break;
			}
		}
		
		String subjects[] = subject_list.split(",");
		session.setAttribute("subjects", subjects);
		
		res.sendRedirect("dashboard.jsp");
	}

}
