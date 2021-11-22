package auth;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.JDBCMain;

public class HomeServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) {
		System.out.println("connection created");
		JDBCMain.getConnection();
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.sendRedirect("index.html");
	}

	@Override
	public void destroy() {
		JDBCMain.closeConnection();
	}

}
