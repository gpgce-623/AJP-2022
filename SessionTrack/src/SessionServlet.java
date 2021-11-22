import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pswd = req.getParameter("pswd");
		System.out.println("email :" + email + " pasword :" + pswd);

		HttpSession session = req.getSession(true);
		PrintWriter pw = resp.getWriter();
		if (session.isNew()) {
			session.setAttribute("username", email);
			pw.println("welcome : " + email);
		} else {
			pw.println("welcome back : " + email);
		}
		pw.close();

		return;
	}

}
