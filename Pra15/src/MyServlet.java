import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	int count;
	
	public void init(ServletConfig config){
		String val = config.getInitParameter("init");
		count = Integer.parseInt(val);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		count++;
		pw.println("Hello : " + count);
		pw.close();
	}
}
