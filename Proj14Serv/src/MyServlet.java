import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	private Integer count_g = 0;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init start");
		String count = config.getInitParameter("count");
		count_g = Integer.parseInt(count);
		System.out.println("config count my servlet " + count);

		ServletContext context = config.getServletContext();
		String webCount = context.getInitParameter("count");
		System.out.println("context count my servlet " + webCount);
		System.out.println("init stop");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		count_g += 1;
		res.getWriter().println("count " + count_g);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.getWriter().println("post method called");
	}
}
