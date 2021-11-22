import java.io.IOException;

import javax.servlet.http.*;

public class Pra14Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		res.getWriter().println("Hello");

	}
}
