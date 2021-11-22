package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		Cookie ck_list[] = request.getCookies();
		if (ck_list != null && ck_list.length > 0) {
			for (int i = 0; i < ck_list.length; i++) {
				Cookie c = ck_list[i];
				pw.println("after " + c.getName() + " : " + c.getValue());
			}
		} else {
			Cookie ck = new Cookie("user", "gpg");
			ck.setMaxAge(100);
			response.addCookie(ck);
			pw.println("first " + ck.getName() + " : " + ck.getValue());
		}

	}

}
