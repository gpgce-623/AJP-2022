import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>Table</h1> <br/>");
		pw.println("<table>");
		pw.println("<tr><td>No</td></tr>");
		for (int i = 0; i < 100; i++)
			pw.println("<tr><td> " + i + " </td></tr>");
		pw.println("</table>");
	}

}
